package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import play.db.ebean.*;

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


    public static Hashtable<String, Integer> allInteretsWithFigures(List<String> interets) {
        Hashtable<String, Integer> hash = new Hashtable<>();
        for(String i : interets) {
            int figure = find.where().eq("interest", i).findList().size();
            hash.put(i, figure);
        }
        return hash;
    }

}
