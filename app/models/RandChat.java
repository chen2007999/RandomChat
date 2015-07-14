package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class RandChat {

    // collect all websockets here
    private static List<WebSocket.Out<String>> waiting = new ArrayList<WebSocket.Out<String>>();

    public static void start(WebSocket.In<String> in, WebSocket.Out<String> out){

        waiting.add(out);

        if(waiting.size() >= 2) {
            waiting.remove(out);

            Random rand = new Random();
            int index1 = rand.nextInt(waiting.size());
            WebSocket.Out<String> client1 = waiting.get(index1);

            waiting.remove(index1);

            ChatPair chatPair = new ChatPair(out, client1);
            chatPair.start(in);

        }


    }


}