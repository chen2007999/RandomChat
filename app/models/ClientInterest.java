package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import play.db.ebean.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Entity
public class ClientInterest extends Model{


    @Column(name = "interest")
    public String interest;


    @Column(name = "clientEmail")
    public String clientEmail;

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public static Finder<String, ClientInterest> find = new Finder<String, ClientInterest>(String.class, ClientInterest.class);

    public static void createClientInterest(String interest, String clientEmail) {
        ClientInterest clientInterest = new ClientInterest();
        clientInterest.setInterest(interest);
        clientInterest.setClientEmail(clientEmail);
        clientInterest.save();
    }

    public static int findLikesNumOfAnInterest(String interest) {
        return find.where().eq("interest", interest).findList().size();
    }

    public static List<InterestLikes> allInteretsWithLikes(List<String> interets) {
        List<InterestLikes> result = new ArrayList<>();
        for(String i : interets) {
            int likes = find.where().eq("interest", i).findList().size();
            InterestLikes interestLikes = new InterestLikes(i, likes);
            result.add(interestLikes);
        }

        return result;
    }

}
