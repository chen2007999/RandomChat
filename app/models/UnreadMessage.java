package models;

public class UnreadMessage {

    public int number;
    public String clientName;
    public String email;

    public UnreadMessage(int number, String clientName, String email) {
        this.number = number;
        this.clientName = clientName;
        this.email = email;
    }
}
