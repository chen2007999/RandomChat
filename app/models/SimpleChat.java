package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class SimpleChat{

    // collect all websockets here
    private static List<WebSocket.Out<String>> waiting = new ArrayList<WebSocket.Out<String>>();

    public static void start(WebSocket.In<String> in, WebSocket.Out<String> out){

        waiting.add(out);
        ChatPair chatPair;

        if(waiting.size() >= 2) {
            Random rand = new Random();
            int index1 = rand.nextInt(waiting.size());
            int index2 = rand.nextInt(waiting.size());
            while(index1 == index2) {
                index2 = rand.nextInt(waiting.size());
            }
            chatPair = new ChatPair(waiting.get(index1), waiting.get(index2));

            in.onMessage(new Callback<String>(){
                public void invoke(String event){
                    SimpleChat.notifyPair(event, chatPair);
                }
            });

            in.onClose(new Callback0(){
                public void invoke(){
                    SimpleChat.notifyPair("A connection closed", chatPair);
                }
            });
        }


    }

    // Iterate connection list and write incoming message
    public static void notifyPair(String message, ChatPair chatPair){
        chatPair.getClient1().write(message);
        chatPair.getClient2().write(message);
    }
}