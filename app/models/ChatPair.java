package models;


import play.libs.F;
import play.mvc.WebSocket;

public class ChatPair {

    private static ClientConnection clientConnection1;
    private static ClientConnection clientConnection2;


    public ChatPair(ClientConnection clientConnection1, ClientConnection clientConnection2) {
        this.clientConnection1 = clientConnection1;
        this.clientConnection2 = clientConnection2;
    }

    public static ClientConnection getClientConnection1() {
        return clientConnection1;
    }

    public static ClientConnection getClientConnection2() {
        return clientConnection2;
    }




    public static void start(WebSocket.In<String> in, WebSocket.Out<String> out){

        in.onMessage(new F.Callback<String>() {
            public void invoke(String event) {
                notifyPair(event);
            }
        });


        in.onClose(new F.Callback0(){
            public void invoke(){
                clientConnection1 = null;
                clientConnection2 = null;
               notifyPair("A connection closed");
            }
        });
    }

    // Iterate connection list and write incoming message
    public static void notifyPair(String message){
        getClientConnection1().getConnection().write(message);
        getClientConnection2().getConnection().write(message);
    }
}
