package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;
import java.lang.Thread;

import java.util.*;

public class RandChat {

    // collect all websockets here
    private static List<ClientConnection> waiting = new ArrayList<ClientConnection>();
    private static List<ChatPair> chatPairs = new ArrayList<>();


    public static synchronized void start(WebSocket.In<String> in, WebSocket.Out<String> out, Client client) {
        ClientConnection clientConnection1 = setUpConnection(out, client);

        // Server responses
       in.onMessage(new F.Callback<String>() {
            public void invoke(String event) {
                System.out.println("check: " + clientConnection1.getChatPair());
                if (clientConnection1.isPaired()) {
                    clientConnection1.getChatPair().notifyPair(event);
                }
            }
        });


        in.onClose(new F.Callback0() {
            public void invoke() {
                if (clientConnection1.isPaired()) {
                    ClientConnection theOtherClientConnection = clientConnection1.getChatPair().getTheOtherClientConnection(clientConnection1);

                    theOtherClientConnection.notifyClosed(clientConnection1.getClient());

                    chatPairs.remove(clientConnection1.getChatPair());

                    theOtherClientConnection.setChatPair(null);

                    waiting.add(theOtherClientConnection);
                    pairing(theOtherClientConnection);

                    System.out.println("after check  " + theOtherClientConnection.getChatPair());

                } else {
                    waiting.remove(clientConnection1);
                }
            }
        });
        System.out.println(clientConnection1.getClient().getEmail() + "here");
    }

    private static ClientConnection setUpConnection(WebSocket.Out<String> out, Client client) {
        ClientConnection clientConnection1 = findClientConnection(client);

        if(clientConnection1 == null) {
            clientConnection1 = new ClientConnection(client, out);
            connectionAndPairing(clientConnection1, client);
        }
        return clientConnection1;
    }

    private static void connectionAndPairing(ClientConnection clientConnection1, Client client) {
        boolean notConnected = true;
        for(ClientConnection w : waiting) {
            if(w.getClient().equals(client)) {
                notConnected = false;
            }
        }
        for(ChatPair chatPair : chatPairs) {
            if(chatPair.getClientConnection1().getClient().equals(client)) {
                notConnected = false;
            }
            if(chatPair.getClientConnection2().getClient().equals(client)) {
                notConnected = false;
            }
        }
        if(notConnected) {
            waiting.add(clientConnection1);
        }
        pairing(clientConnection1);
    }

    private static void pairing(ClientConnection clientConnection1) {
        if(waiting.size() >= 2) {

            System.out.println("yes1" + clientConnection1.getClient().getEmail());

            ClientConnection clientConnection2 = null;

            for(int i=0; i<waiting.size(); i++) {
                if(!PairHistory.inHistory(clientConnection1.getClient(), waiting.get(i).getClient())) {
                    if(!waiting.get(i).getClient().equals(clientConnection1.getClient())) {
                        clientConnection2 = waiting.get(i);
                        break;
                    }
                }
            }


            if(clientConnection2 != null) {

                System.out.println("yes3" + clientConnection1.getClient().getEmail());
                waiting.remove(clientConnection1);
                waiting.remove(clientConnection2);

                ChatPair chatPair = new ChatPair(clientConnection1, clientConnection2);
                chatPairs.add(chatPair);
                clientConnection1.setChatPair(chatPair);
                clientConnection2.setChatPair(chatPair);

                PairHistory.createPairHistory(clientConnection1.getClient(), clientConnection2.getClient());
                PairHistory.createPairHistory(clientConnection2.getClient(), clientConnection1.getClient());

                clientConnection1.getConnection().write("Just got connected to " + clientConnection2.getClient().getName());
                clientConnection2.getConnection().write("Just got connected to " + clientConnection1.getClient().getName());

                System.out.println("Conrrent user: " + clientConnection1.getClient().getEmail());
                System.out.println("The other user: " + clientConnection2.getClient().getEmail());
                System.out.println("The other user's pair user: " + clientConnection2.getChatPair().getTheOtherClientConnection(clientConnection2).getClient().getEmail());
            }
        }
    }


    public static void nextUser(Client client) {
        ClientConnection clientConnection1 = null;
        ClientConnection clientConnection2 = null;

        for (ChatPair chatPair : chatPairs) {
            if (chatPair.getClientConnection1().getClient().equals(client)) {
                clientConnection1 = chatPair.getClientConnection1();
                clientConnection2 = chatPair.getClientConnection2();
                chatPairs.remove(chatPair);
                chatPair = null;
                break;
            }
            if (chatPair.getClientConnection2().getClient().equals(client)) {
                clientConnection1 = chatPair.getClientConnection2();
                clientConnection2 = chatPair.getClientConnection1();
                chatPairs.remove(chatPair);
                chatPair = null;
                break;
            }
        }

        // Previous pairing is no longer allowed
        waiting.add(clientConnection1);
        waiting.add(clientConnection2);
        pairing(clientConnection1);
        pairing(clientConnection2);

    }

    public static ClientConnection findClientConnection(Client client) {
        ClientConnection clientConnection = null;
        for(ClientConnection w : waiting) {
            if(w.getClient().equals(client)) {
                clientConnection = w;
                break;
            }
        }

        for (ChatPair chatPair : chatPairs) {
            if (chatPair.getClientConnection1().getClient().equals(client)) {
                clientConnection = chatPair.getClientConnection1();
                break;
            }
            if (chatPair.getClientConnection2().getClient().equals(client)) {
                clientConnection = chatPair.getClientConnection2();
                break;
            }
        }
        return clientConnection;
    }

    public static List<Client> getChatPairs() {
        List<Client> result = new ArrayList<>();
        for(ChatPair cp : chatPairs) {
            result.add(cp.getClientConnection1().getClient());
            result.add(cp.getClientConnection2().getClient());
        }
        return result;
    }

    public static List<Client> getWaiting() {
        List<Client> result = new ArrayList<>();
            for (ClientConnection c : waiting) {
                result.add(c.getClient());
            }
        return result;
    }
}