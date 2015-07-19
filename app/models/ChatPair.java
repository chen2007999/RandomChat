package models;

import play.libs.F;
import play.mvc.WebSocket;


public class ChatPair {

    private ClientConnection clientConnection1;
    private ClientConnection clientConnection2;


    public ChatPair(ClientConnection clientConnection1, ClientConnection clientConnection2) {
        this.clientConnection1 = clientConnection1;
        this.clientConnection2 = clientConnection2;
    }

    public ClientConnection getClientConnection1() {
        return clientConnection1;
    }

    public ClientConnection getClientConnection2() {
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

    public void notifyPair(String message){
        getClientConnection1().getConnection().write(message);
        getClientConnection2().getConnection().write(message);
    }

}
