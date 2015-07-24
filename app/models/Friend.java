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

    public void createFriend(Client client, String friendEmail) {
        Friend friend = new Friend();
        friend.setEmail(client.getEmail());
        friend.setPairedEmail(friendEmail);
        friend.save();
    }


}
