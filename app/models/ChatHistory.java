package models;

import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class ChatHistory extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "fromClient")
    public String fromClient;

    @Column(name = "toClient")
    public String toClient;

    @Column(name = "sentTime")
    public Timestamp sentTime;

    @Column(name = "content")
    public String content;

    public void setFrom(String fromClient) {
        this.fromClient = fromClient;
    }

    public void setTo(String toClient) {
        this.toClient = toClient;
    }

    public void setSentTime(Timestamp sentTime) {
        this.sentTime = sentTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFromClient() {
        return fromClient;
    }

    public Timestamp getSentTime() {
        return sentTime;
    }

    public static void createNewHistory(String email, String friendEmail, String content, Timestamp sentTime) {
        ChatHistory chatHistory = new ChatHistory();
        chatHistory.setFrom(email);
        chatHistory.setTo(friendEmail);
        chatHistory.setContent(content);
        chatHistory.setSentTime(sentTime);
        chatHistory.save();
    }

    public static List<String> findHistory(String email, String clientEmail) {
        List<ChatHistory> historyA = find.where().eq("fromClient", email).eq("toClient", clientEmail).findList();
        List<ChatHistory> historyB = find.where().eq("toClient", email).eq("fromClient", clientEmail).findList();
        historyA.addAll(historyB);
        List<String> result = new ArrayList<>();

        while(!historyA.isEmpty()) {
            ChatHistory toAdd = historyA.get(0);
            for (ChatHistory c : historyA) {
                if (c.getSentTime().before(toAdd.getSentTime())) {
                    toAdd = c;
                }
            }
            result.add(Client.findClientByEmail(toAdd.getFromClient()).getName() + ": " + toAdd.getContent());
            historyA.remove(toAdd);
        }
        return result;
    }

    public static Model.Finder<String, ChatHistory> find = new Model.Finder<String, ChatHistory>(String.class, ChatHistory.class);

}
