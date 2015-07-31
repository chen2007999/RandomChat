package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import play.db.ebean.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Friend extends Model{


    @Column(name = "email")
    public String email;


    public String getEmail() {
        return email;
    }

    @Column(name = "friendEmail")
    public String friendEmail;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFriendEmail(String friendEmail) {
        this.friendEmail = friendEmail;
    }

    public String getfriendEmail() {
        return friendEmail;
    }

    public static void createFriend(Client client, String friendEmail) {
        Friend friend = new Friend();
        friend.setEmail(client.getEmail());
        friend.setFriendEmail(friendEmail);
        friend.save();
    }

    public static boolean friendWith(Client client1, Client client2) {
        return find.where().eq("email", client1.getEmail()).eq("friendEmail", client2.getEmail()).findList().size() != 0;
    }

    public static List<Client> findfriends(Client client) {
        List<Friend> friends = find.where().eq("email", client.getEmail()).findList();
        List<Client> result = new ArrayList<>();
        for(Friend f : friends) {
            result.add(Client.findClientByEmail(f.getfriendEmail()));
        }
        return result;
    }

    public static Finder<String, Friend> find = new Finder<String, Friend>(String.class, Friend.class);
}
