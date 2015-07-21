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

    @Column(name = "firendId")
    public String firendId;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPairedId(String firendId) {
        this.firendId = firendId;
    }

    public String getFirendId() {
        return firendId;
    }
}
