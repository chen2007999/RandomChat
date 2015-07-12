package models;


import play.libs.F;
import play.mvc.WebSocket;

public class ChatPair {

    private static WebSocket.Out<String> client1;
    private static WebSocket.Out<String> client2;


    public ChatPair(WebSocket.Out<String> client1, WebSocket.Out<String> client2) {
        this.client1 = client1;
        this.client2 = client2;
    }

    public static WebSocket.Out<String> getClient1() {
        return client1;
    }

    public static WebSocket.Out<String> getClient2() {
        return client2;
    }


    public static void start(WebSocket.In<String> in){

        in.onMessage(new F.Callback<String>(){
            public void invoke(String event){
                notifyPair(event);
            }
        });

        in.onClose(new F.Callback0(){
            public void invoke(){
               notifyPair("A connection closed");
            }
        });
    }

    // Iterate connection list and write incoming message
    public static void notifyPair(String message){
        getClient1().write(message);
        getClient2().write(message);
    }
}
