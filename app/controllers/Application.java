package controllers;
import models.*;
import play.api.mvc.Session;
import play.mvc.*;
import views.html.*;
import java.util.List;
import java.sql.Timestamp;

public class Application extends Controller {

   // public static Client currentClient;


    // index to landing page by default
    public static Result index() {
        return redirect(routes.Application.landing());
    }

    public static Result landing() {
        //currentClient = null;
        return ok(landing.render());
    }

    // get the information that the client just typed
    public static Client getClient() {
        play.data.Form<Client> clientForm = play.data.Form.form(Client.class);
        return clientForm.bindFromRequest().get();
    }

    public static Client currentClient() {
        String email = session().get("clientEmail");
        return Client.findClientByEmail(email);
    }

    // methods deal with client account
    public static  Result createClient() {

        Client client = getClient();

        if(Client.checkNull(client) || Client.checkEmpty(client)){
            return redirect(routes.Application.register("Empty details"));
        } else if(!client.emailFormat()){
            return redirect(routes.Application.register("Wrong email format"));
        } else if(!Client.checkPasswordConsistency(client)){
            return redirect(routes.Application.register("Passwords do not match"));
        } else if(Client.clientEmailExists(client)){
            return redirect(routes.Application.register("Client with email " + client.email + " already exists"));
        }
        Client.createClient(client);
        session().put("clientEmail", client.getEmail());
        Client currentClient = client;
        return ok(randChat.render(currentClient));
    }

    public static  Result deleteClientFromDB(String email) {
        Client.deleteClient(email);
        return redirect(routes.Application.displayAllClientsFromDB());
    }

    public static  Result displayAllClientsFromDB() {
        return ok(registration.render(Client.find.findList(), ""));
    }

    public static Result logIn() {
        Client client = getClient();
        if(Client.validate(client)) {
            Client currentClient = Client.findClient(client);
            session().put("clientEmail", client.getEmail());
            return ok(randChat.render(currentClient));

        }

        return ok(landing.render());
    }

    public  static Result register(String error) {
        return ok(registration.render(Client.find.findList(), error));
    }



    // Websocket interface
    public static WebSocket<String> wsInterface(){
        Client currentClient = currentClient();
        return new WebSocket<String>(){
            // called when websocket handshake is done
            public void onReady(WebSocket.In<String> in, WebSocket.Out<String> out){
                RandChat.start(in, out, currentClient);
            }
        };
    }

    public static Result nextUser(){
        Client client = currentClient();
        RandChat.nextUser(client);
        return ok("");
    }

    public static Result randChatWS() {
        return ok(views.js.randChatWebSocket.render());
    }

    public static Result findFriendProfileWithClientEmail(String clientEmail, String key) {
        String email = session().get("clientEmail");
        Client client = Client.findClientByEmail(clientEmail);
        Client currentClient = Client.findClientByEmail(email);
        boolean friendRequestReceived = Unread.friendRequestReceived(currentClient, client);
        if(key.equals("request")) {
            Unread.updateUnreadFriendRequest(clientEmail);
            RandChat.removeOneUnread(currentClient);
        }
        if(key.equals("confirmation")) {
            Unread.updateUnreadFriendConfirmation(clientEmail);
            RandChat.removeOneUnread(currentClient);
        }
        return ok(friendProfile.render(client, friendRequestReceived, Friend.friendWith(client, currentClient), ClientInterest.findInterestsOfAClient(clientEmail)));
    }

    public static Result friendProfile() {
        String email = session().get("clientEmail");
        Client currentClient = Client.findClientByEmail(email);
        ClientConnection clientConnection = RandChat.findClientConnection(currentClient);
        if(clientConnection != null && clientConnection.isPaired()) {
            Client client2 = clientConnection.getChatPair().getTheOtherClientConnection(clientConnection).getClient();
            return ok(friendProfile.render(client2, Unread.friendRequestReceived(currentClient, client2), Friend.friendWith(currentClient, client2), ClientInterest.findInterestsOfAClient(client2.getEmail())));
        }
        return ok(notPairedYet.render());
    }

    public static Result myProfile() {
        String email = session().get("clientEmail");
        Client currentClient = Client.findClientByEmail(email);
        return ok(myProfile.render(currentClient, ClientInterest.findInterestsOfAClient(email)));
    }

    public static Result addFriend(String friendRequestClientEmail) {
        Client currentClient = currentClient();
        Unread.createUnreadFriendRequest(currentClient, friendRequestClientEmail);
        RandChat.newUnread(Client.findClientByEmail(friendRequestClientEmail));
        return ok(friendRequestSent.render());
    }

    public static Result acceptFriendRequest(String friendRequestClientEmail) {
        String email = session().get("clientEmail");
        Client currentClient = Client.findClientByEmail(email);
        Client client = Client.findClientByEmail(friendRequestClientEmail);
        Friend.createFriend(currentClient, friendRequestClientEmail);
        Friend.createFriend(client, email);
        boolean friendRequestReceived = Unread.friendRequestReceived(currentClient, client);
        Unread.createUnreadFriendConfirmation(currentClient, friendRequestClientEmail);
        RandChat.newUnread(Client.findClientByEmail(friendRequestClientEmail));
        return ok(friendProfile.render(client, friendRequestReceived, Friend.friendWith(client, currentClient), ClientInterest.findInterestsOfAClient(friendRequestClientEmail)));
    }

    public static Result unreadNum() {
        Client currentClient = currentClient();
        int unreadNum = Unread.getUnreadNum(currentClient);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(unreadNum);
        String strI = sb.toString();
        return ok(strI);
    }

    public static Result showUnread() {
        Client currentClient = currentClient();
        if(Unread.getUnreadNum(currentClient) == 0) {
            return ok(everythingRead.render());
        } else {
            return ok(unread.render(Unread.getUnreadFriendRequest(currentClient), Unread.getUnreadFriendConfirmation(currentClient), Unread.getUnreadMessage(currentClient)));
        }
    }

    public static Result interestsListPage() {
        return ok(interestsList.render(ClientInterest.allInteretsWithLikes(Interest.allInterests())));
    }

    public static Result createInterestPage() {
        return ok(createInterest.render());
    }

    public static Result createInterest() {
        play.data.Form<Interest> interestForm = play.data.Form.form(Interest.class);
        Interest interest = interestForm.bindFromRequest().get();
        if(Interest.find.byId(interest.getInterest()) != null) {
            return ok(interestExists.render());
        }
        interest.save();
        String email = session().get("clientEmail");
        ClientInterest.createClientInterest(interest.getInterest(), email);
        return ok(successCreateInterest.render(interest.getInterest()));
    }

    public static Result interestPage(String interestTitle) {
        return ok(interestPage.render(Interest.getInterestWithTitle(interestTitle), ClientInterest.findLikesNumOfAnInterest(interestTitle)));
    }

    public static Result likeInterest(String interest) {
        String email = session().get("clientEmail");
        if(!ClientInterest.alreadyLiked(interest, email)) {
            ClientInterest.createClientInterest(interest, email);
        }
        return interestPage(interest);
    }

    public static Result editMyProfilePage() {
        Client currentClient = currentClient();
        return ok(editMyProfile.render(currentClient));
    }

    public static Result editMyProfile() {
        String description = getClient().getDescription();
        String email = session().get("clientEmail");
        Client.updateDescription(email, description);
        return ok(description);
    }

    public static Result logOut() {
        session().clear();
        return redirect(routes.Application.landing());
    }

    public static Result friendListPage() {
        Client currentClient = currentClient();
        return ok(friendList.render(Friend.findfriends(currentClient)));
    }

    public static Result message(String clientEmail, String key, int number) {
        String email = session().get("clientEmail");
        List<String> history = ChatHistory.findHistory(email, clientEmail);
       if(key.equals("updateUnread")) {
            Unread.updateUnreadMessage(email, number);
            RandChat.removeOneUnread(currentClient());
        }
        return ok(message.render(Client.findClientByEmail(clientEmail), history));
    }

    public static Result sendMessage(String friendEmail) {
        play.data.Form<ChatHistory> messageForm = play.data.Form.form(ChatHistory.class);
        ChatHistory chatHistory = messageForm.bindFromRequest().get();
        String email = session().get("clientEmail");
        java.util.Date date= new java.util.Date();
        Timestamp time = new Timestamp(date.getTime());
        ChatHistory.createNewHistory(email, friendEmail, chatHistory.getContent(), time);
        Unread.createUnreadMessage(friendEmail, email);
        RandChat.newUnread(Client.findClientByEmail(friendEmail));
        return ok(messageSuccess.render());
    }
}
