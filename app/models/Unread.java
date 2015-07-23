package models;

import play.db.ebean.*;

import java.lang.Long;
import java.util.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Id;
import java.lang.String;
import java.util.List;

@Entity
public class Unread extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "clientEmail")
    public String clientEmail;

    @Column(name = "friendRequestClientEmail")
    public String friendRequestClientEmail;



    public void setClientEmailEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public void setFriendRequestClientEmail(String friendRequestClientEmail) {
        this.friendRequestClientEmail = friendRequestClientEmail;
    }

    public String getFriendRequestClientEmail() {
        return friendRequestClientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public  static Finder<Long, Unread> find = new Finder<Long, Unread>(Long.class, Unread.class);



    public static List<Unread> getUnread(Client client) {
        return find.where().eq("clientEmail", client.getEmail()).findList();
    }

    public static int getUnreadNum(Client client) {
        List<Unread> unreads = getUnread(client);
        return unreads.size();
    }


    public static void createUnreadFriendRequest(Client currentClient, String friendRequestClientEmail) {
        Unread unread = new Unread();
        unread.setClientEmail(currentClient.getEmail());
        unread.setFriendRequestClientEmail(friendRequestClientEmail);
        unread.save();
    }

   /* public static void updateUnreadComment(Long commentId) {
        Unread unread = find.where().eq("commentID", commentId).findList().get(0);
        unread.delete();
    }

    public static void updateUnreadTask(Long taskId) {
        Unread unread = find.where().eq("taskId", taskId).findList().get(0);
        unread.delete();
    }

    public static void updateUnreadEvent(Long eventId, Client client) {
        Unread unread = find.where().eq("eventId", eventId).eq("userEmail", client.getEmail()).findList().get(0);
        unread.delete();
    }*/



}