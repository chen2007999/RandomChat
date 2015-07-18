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

    public ClientConnection getTheOtherClientConnection(ClientConnection clientConnection) {
        ClientConnection result;
        if(clientConnection.equals(clientConnection1)) {
            result = clientConnection2;
        } else {
            result = clientConnection1;
        }
        return result;
    }

    
    /*public static void start(WebSocket.In<String> in, WebSocket.Out<String> out) {

        new Thread(new ChatPair()).run();


    }*/

    // Iterate connection list and write incoming message
    public static void notifyPair(String message){
        getClientConnection1().getConnection().write(message);
        getClientConnection2().getConnection().write(message);
    }
}
