package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class RandChat {

    // collect all websockets here
    private static List<ClientConnection> waiting = new ArrayList<ClientConnection>();


    public  static String start(WebSocket.In<String> in, WebSocket.Out<String> out, Client client){
        ClientConnection clientConnection1 = new ClientConnection(client, out);
        if(waiting.isEmpty()) {
            waiting.add(clientConnection1);
        } else {
            boolean notAdded = true;
            for(ClientConnection w : waiting) {
                if(w.getClient() == client) {
                    notAdded = false;
                }
            }
            if(notAdded) {
                waiting.add(clientConnection1);
            }
        }

        /*if(waiting.size() >= 2) {
            waiting.remove(clientConnection1);

            Random rand = new Random();
            int index2 = rand.nextInt(waiting.size());
            ClientConnection clientConnection2 = waiting.get(index2);

            waiting.remove(clientConnection2);

            ChatPair chatPair = new ChatPair(clientConnection1, clientConnection2);
            chatPair.start(in, out);
            return clientConnection2.getClient().getName();
        }*/

        return "currently no matching";
    }


    public static String pairing(WebSocket.In<String> in, WebSocket.Out<String> out, Client client) {
        if(waiting.size() >= 2) {
            ClientConnection clientConnection1 = new ClientConnection(client, out);
            waiting.remove(clientConnection1);

            Random rand = new Random();
            int index2 = rand.nextInt(waiting.size());
            ClientConnection clientConnection2 = waiting.get(index2);

            waiting.remove(clientConnection2);

            ChatPair chatPair = new ChatPair(clientConnection1, clientConnection2);
            chatPair.start(in, out);
            return clientConnection2.getClient().getName();
        }

        return "currently no matching";
    }



    public static List<String> getWaiting() {
        List<String> result = new ArrayList<String>();
        for(ClientConnection c : waiting) {
            result.add(c.getClient().getEmail());
        }
        return result;
    }
}