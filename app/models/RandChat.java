package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class RandChat {

    // collect all websockets here
    private static List<ClientConnection> waiting = new ArrayList<ClientConnection>();

    public static String start(WebSocket.In<String> in, WebSocket.Out<String> out, Client client){

        ClientConnection clientConnection1 = new ClientConnection(client, out);
        waiting.add(clientConnection1);

        if(waiting.size() >= 2) {
            waiting.remove(out);

            Random rand = new Random();
            int index2 = rand.nextInt(waiting.size());
            ClientConnection clientConnection2 = waiting.get(index2);

            waiting.remove(clientConnection2);

            ChatPair chatPair = new ChatPair(clientConnection1, clientConnection2);
            chatPair.start(in);
            return clientConnection2.getClient().getName();
        }

        return "currently no matching";
    }


}