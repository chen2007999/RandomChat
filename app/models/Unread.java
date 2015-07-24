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

    public static List<Client> getUnreadFriendRequest(Client client) {
        List<Unread> unreads = getUnread(client);
        List<Client> friendRequestEmails = new ArrayList<Client>();
        for(Unread unread : unreads) {
            String friendRequestEmail = unread.getFriendRequestClientEmail();
            if(friendRequestEmail != null) {
                friendRequestEmails.add(Client.findClientByEmail(friendRequestEmail));
            }
        }
        return friendRequestEmails;
    }


    public static int getUnreadNum(Client client) {
        List<Unread> unreads = getUnread(client);
        return unreads.size();
    }


    public static void createUnreadFriendRequest(Client friendRequestClient, String clientEmail) {
        Unread unread = new Unread();
        unread.setClientEmail(clientEmail);
        unread.setFriendRequestClientEmail(friendRequestClient.getEmail());
        unread.save();
    }

    public static void updateUnreadFriendRequest(String friendRequestClientEmail) {
        Unread unread = find.where().eq("friendRequestClientEmail", friendRequestClientEmail).findList().get(0);
        unread.delete();
    }

    public static boolean friendRequestReceived(Client client1, Client client2) {
        return find.where().eq("clientEmail", client1.getEmail()).eq("friendRequestClientEmail", client2.getEmail()).findList().size() != 0;
    }

}