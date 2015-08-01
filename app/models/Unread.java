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

    @Column(name = "friendConfirmationClientEmail")
    public String friendConfirmationClientEmail;

    @Column(name = "messageFrom")
    public String messageFrom;

    @Column(name = "unreadMessageNumber")
    public int unreadMessageNumber;

    public String getFriendConfirmationClientEmail() {
        return friendConfirmationClientEmail;
    }

    public void setFriendConfirmationClientEmail(String friendConfirmationClientEmail) {
        this.friendConfirmationClientEmail = friendConfirmationClientEmail;
    }

    public void setClientEmailEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public void setFriendRequestClientEmail(String friendRequestClientEmail) {
        this.friendRequestClientEmail = friendRequestClientEmail;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getFriendRequestClientEmail() {
        return friendRequestClientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public int getUnreadMessageNumber() {
        return unreadMessageNumber;
    }

    public void setUnreadMessageNumber(int unreadMessageNumber) {
        this.unreadMessageNumber = unreadMessageNumber;
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

    public static List<Client> getUnreadFriendConfirmation(Client client) {
        List<Unread> unreads = getUnread(client);
        List<Client> friendRequestEmails = new ArrayList<Client>();
        for(Unread unread : unreads) {
            String friendConfirmationClientEmail = unread.getFriendConfirmationClientEmail();
            if(friendConfirmationClientEmail != null) {
                friendRequestEmails.add(Client.findClientByEmail(friendConfirmationClientEmail));
            }
        }
        return friendRequestEmails;
    }

    public static List<UnreadMessage> getUnreadMessage(Client client) {
        List<Unread> unreads = getUnread(client);
        List<UnreadMessage> messages = new ArrayList<>();
        for(Unread unread : unreads) {
            String messageFrom = unread.getMessageFrom();
            if(messageFrom != null) {
                Client clientToAdd = Client.findClientByEmail(messageFrom);
                int number = unread.getUnreadMessageNumber();
                messages.add(new UnreadMessage(number, clientToAdd.getName(), clientToAdd.getEmail()));
            }
        }
        return messages;
    }


    public static int getUnreadNum(Client client) {
        List<Unread> unreads = getUnread(client);
        return unreads.size();
    }


    public static void createUnreadFriendRequest(Client friendRequestClient, String clientEmail) {
        Unread unread = new Unread();
        unread.setClientEmail(clientEmail);
        unread.setFriendRequestClientEmail(friendRequestClient.getEmail());
        unread.setUnreadMessageNumber(0);
        unread.save();
    }

    public static void updateUnreadFriendRequest(String friendRequestClientEmail) {
        Unread unread = find.where().eq("friendRequestClientEmail", friendRequestClientEmail).findList().get(0);
        unread.delete();
    }

    public static void createUnreadFriendConfirmation(Client friendConfirmationClient, String clientEmail) {
        Unread unread = new Unread();
        unread.setClientEmail(clientEmail);
        unread.setFriendConfirmationClientEmail(friendConfirmationClient.getEmail());
        unread.setUnreadMessageNumber(0);
        unread.save();
    }

    public static void updateUnreadFriendConfirmation(String friendConfirmationClientEmail) {
        Unread unread = find.where().eq("friendConfirmationClientEmail", friendConfirmationClientEmail).findList().get(0);
        unread.delete();
    }

    private static int latestUnreadMessageNumber(Client client) {
        List<Unread> unreads = getUnread(client);
        int result = 0;
        for(Unread unread : unreads) {
            int num = unread.getUnreadMessageNumber();
            if(num != 0 && num > result) {
               result = num;
            }
        }
        return result;
    }

    public static void createUnreadMessage(String clientEmail, String messageFrom) {
        Unread unread = new Unread();
        unread.setClientEmail(clientEmail);
        unread.setMessageFrom(messageFrom);
        unread.setUnreadMessageNumber(latestUnreadMessageNumber(Client.findClientByEmail(clientEmail))+1);
        unread.save();
    }

    public static void updateUnreadMessage(String clientEmail, int unreadMessageNumber) {
        Unread unread = find.where().eq("clientEmail", clientEmail).eq("unreadMessageNumber", unreadMessageNumber).findList().get(0);
        unread.delete();
    }



    public static boolean friendRequestReceived(Client client1, Client client2) {
        return find.where().eq("clientEmail", client1.getEmail()).eq("friendRequestClientEmail", client2.getEmail()).findList().size() != 0;
    }

}