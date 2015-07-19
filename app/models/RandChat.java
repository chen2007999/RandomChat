package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

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
                if (clientConnection1.isPaired()) {
                    clientConnection1.getChatPair().notifyPair(event);
                }
            }
        });


        in.onClose(new F.Callback0() {
            public void invoke() {
                if (clientConnection1.isPaired()) {
                    ClientConnection theOtherClientConnection = clientConnection1.getChatPair().getTheOtherClientConnection(clientConnection1);

                    theOtherClientConnection.notifyClosed();

                    chatPairs.remove(clientConnection1.getChatPair());

                    theOtherClientConnection.setChatPair(null);
                    start(in, theOtherClientConnection.getConnection(), theOtherClientConnection.getClient());
                } else {
                    waiting.remove(clientConnection1);
                }
            }
        });
    }

    private static ClientConnection setUpConnection(WebSocket.Out<String> out, Client client) {
        ClientConnection clientConnection1 = null;
        for(ClientConnection w : waiting) {
            if(w.getClient().equals(client)) {
                clientConnection1 = w;
                return clientConnection1;
            }
        }

        for (ChatPair chatPair : chatPairs) {
            if (chatPair.getClientConnection1().getClient().equals(client)) {
                clientConnection1 = chatPair.getClientConnection1();
                break;
            }
            if (chatPair.getClientConnection2().getClient().equals(client)) {
                clientConnection1 = chatPair.getClientConnection2();
                break;
            }
        }

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

        //   Pairing
        if(waiting.size() >= 2) {
            waiting.remove(clientConnection1);

            Random rand = new Random();
            int index2 = rand.nextInt(waiting.size());
            ClientConnection clientConnection2 = waiting.get(index2);

            waiting.remove(clientConnection2);

            ChatPair chatPair = new ChatPair(clientConnection1, clientConnection2);
            clientConnection1.setChatPair(chatPair);
            clientConnection2.setChatPair(chatPair);

            System.out.println("Conrrent user: " + clientConnection1.getClient().getEmail());
            System.out.println("The other user: " + clientConnection2.getClient().getEmail());
            System.out.println("The other user's pair user: " + chatPair.getTheOtherClientConnection(clientConnection2).getClient().getEmail());
            chatPairs.add(chatPair);

        }
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