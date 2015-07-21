package models;

import play.db.ebean.*;

import javax.persistence.*;
import javax.persistence.Column;


public class PairHistory extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void createPairHistory(Client client1, Client client2) {
        PairHistory pairHistory = new PairHistory();
        pairHistory.setEmail(client1.getEmail());
        pairHistory.setPairedId(client2.getEmail());
        pairHistory.save();
    }


}
