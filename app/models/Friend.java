package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import play.db.ebean.*;

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

    public void setPairedEmail(String friendEmail) {
        this.friendEmail = friendEmail;
    }

    public String getfriendEmail() {
        return friendEmail;
    }

    public static void createFriend(Client client, String friendEmail) {
        Friend friend = new Friend();
        friend.setEmail(client.getEmail());
        friend.setPairedEmail(friendEmail);
        friend.save();
    }

    public static boolean friendWith(Client client1, Client client2) {
        return find.where().eq("email", client1.getEmail()).eq("friendEmail", client2.getEmail()).findList().size() != 0;
    }

    public static Finder<String, Friend> find = new Finder<String, Friend>(String.class, Friend.class);
}
