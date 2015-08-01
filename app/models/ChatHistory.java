package models;

import play.db.ebean.Model;

import javax.persistence.Column;
import java.sql.Timestamp;

public class ChatHistory {

    @Column(name = "from")
    public String from;

    @Column(name = "to")
    public String to;

    @Column(name = "time")
    public Timestamp time;

    @Column(name = "content")
    public String content;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static Model.Finder<String, ChatHistory> find = new Model.Finder<String, ChatHistory>(String.class, ChatHistory.class);

}
