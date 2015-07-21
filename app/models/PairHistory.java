package models;

import play.db.ebean.*;

import javax.persistence.*;
import javax.persistence.Column;


@Entity
public class PairHistory extends Model {


    @Column(name = "email")
    public String email;


    public String getEmail() {
        return email;
    }

    @Column(name = "pairedId")
    public String pairedId;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPairedId(String pairedId) {
        this.pairedId = pairedId;
    }

    public String getPairedId() {
        return pairedId;
    }

    public  static Finder<String, PairHistory> find = new Finder<String, PairHistory>(String.class, PairHistory.class);

    public static void createPairHistory(Client client1, Client client2) {
        PairHistory pairHistory = new PairHistory();
        pairHistory.setEmail(client1.getEmail());
        pairHistory.setPairedId(client2.getEmail());
        pairHistory.save();
    }

    public static boolean inHistory(Client client1, Client client2) {
        return find.where().eq("email", client1.getEmail()).eq("pairedId", client2.getEmail()).findList().size() != 0;
       /* List<PairHistory> pairings = find.where().eq("email", client1.getEmail()).findList();
        for(PairHistory p : pairings) {
            if (p.getPairedId().equals(client2.getEmail())) {
                return true;
            }
        }
        return false;*/
    }

}
