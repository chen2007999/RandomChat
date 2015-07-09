package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class RandChat {

    private static List<WebSocket.Out<String>> connections = new ArrayList<WebSocket.Out<String>>();

    public static void start(WebSocket.In<String> in, WebSocket.Out<String> out) {

        connections.add(out);

        in.onMessage(new Callback<String>(){
            public void invoke(String event){
                RandChat.notifyAll(event);
            }
        });

        in.onClose(new Callback0(){
            public void invoke(){
                RandChat.notifyAll("A connection closed");
            }
        });

    }

    // Iterate connection list and write incoming message
    public static void notifyAll(String message){
        for (WebSocket.Out<String> out : connections) {
            out.write(message);
        }
    }
}
