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


    public  static synchronized void start(WebSocket.In<String> in, WebSocket.Out<String> out, Client client) {

        ClientConnection clientConnection1 = new ClientConnection(client, out);
        connectionAndPairing(clientConnection1, client);


        // Server responses
       in.onMessage(new F.Callback<String>() {
            public void invoke(String event) {
                clientConnection1.getChatPair().notifyPair(event);
            }
        });


        in.onClose(new F.Callback0() {
            public void invoke() {
                //connections.remove(clientConnection1);
                if (clientConnection1.isPaired()) {
                    chatPairs.remove(clientConnection1.getChatPair());
                    clientConnection1.getChatPair().notifyPair("A connection closed");
                    ClientConnection theOtherClientConnection = clientConnection1.getChatPair().getTheOtherClientConnection(clientConnection1);
                    start(in, theOtherClientConnection.getConnection(), theOtherClientConnection.getClient());
                } else {
                    waiting.remove(clientConnection1);
                }
            }
        });
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