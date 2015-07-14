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
            Random rand = new Random();
            int index1 = rand.nextInt(waiting.size());
            int index2 = rand.nextInt(waiting.size());
            while(index1 == index2) {
                index2 = rand.nextInt(waiting.size());
            }
            ChatPair chatPair = new ChatPair(waiting.get(index1), waiting.get(index2));
            chatPair.start(in);

        }


    }


}