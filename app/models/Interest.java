package models;

import play.db.ebean.*;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Column;
import java.lang.String;

@Entity
public class Interest extends Model {


    @Column(name = "interest")
    public String interest;

    @Column(name = "description")
    public String description;

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Finder<String, Interest> find = new Finder<String, Interest>(String.class, Interest.class);

    public static void createInterest(String interest, String description) {
        Interest newInterest = new Interest();
        newInterest.setInterest(interest);
        newInterest.setDescription(description);
        newInterest.save();
    }

    public static List<String> allInterests() {
        List<Interest> interestList = find.all();
        List<String> allInterests = new ArrayList<String>();
        for(Interest i : interestList) {
            allInterests.add(i.getInterest());
        }
        return allInterests;
    }
}