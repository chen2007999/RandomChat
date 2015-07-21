package models;

import play.mvc.WebSocket;
import java.util.*;

public class ClientConnection {

    private Client client;
    private WebSocket.Out<String> connection;
    private ChatPair chatPair;

    public ClientConnection(Client client, WebSocket.Out<String> connection) {
            this.client = client;
        this.connection = connection;
    }

    public WebSocket.Out<String> getConnection() {
        return connection;
    }

    public Client getClient() {
        return client;
    }

    public void setChatPair(ChatPair chatPair) {
        this.chatPair = chatPair;
    }

    public ChatPair getChatPair() {
        return chatPair;
    }

    public boolean isPaired() {
        return chatPair != null;
    }

    public void notifyClosed() {
       connection.write("The other user just left, waiting to be connected to the next user.");
    }


}
