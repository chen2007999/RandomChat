package models;

import play.mvc.WebSocket;

public class ClientConnection {

    private static Client client;
    private static WebSocket.Out<String> connection;

    public ClientConnection(Client client, WebSocket.Out<String> connection) {
            this.client = client;
        this.connection = connection;
    }

    public static WebSocket.Out<String> getConnection() {
        return connection;
    }

    public static Client getClient() {
        return client;
    }
}
