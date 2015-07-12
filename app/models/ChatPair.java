package models;


import play.mvc.WebSocket;

public class ChatPair {

    private WebSocket.Out<String> client1;
    private WebSocket.Out<String> client2;


    public ChatPair(WebSocket.Out<String> client1, WebSocket.Out<String> client2) {
        this.client1 = client1;
        this.client2 = client2;
    }

    public WebSocket.Out<String> getClient1() {
        return client1;
    }

    public WebSocket.Out<String> getClient2() {
        return client2;
    }
}
