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

    public static boolean alreadyLiked(String interest, String clientEmail) {
        return find.where().eq("interest", interest).eq("clientEmail", clientEmail).findList().size() != 0;
    }

    public static List<InterestLikes> findInterestsOfAClient(String clientEmail) {
        List<ClientInterest> clientInterests = find.where().eq("clientEmail", clientEmail).findList();
        List<String> interests = new ArrayList<>();
        for(ClientInterest ci : clientInterests) {
            interests.add(ci.getInterest());
        }
        return allInteretsWithLikes(interests);
    }

    public static List<InterestLikes> allInteretsWithLikes(List<String> interests) {
        List<InterestLikes> result = new ArrayList<>();
        for(String i : interests) {
            int likes = find.where().eq("interest", i).findList().size();
            InterestLikes interestLikes = new InterestLikes(i, likes);
            result.add(interestLikes);
        }
        List<InterestLikes> sortedResult = new ArrayList<>();
        int size = result.size();
        while(sortedResult.size() != size) {
            InterestLikes var = null;
            int likes = -1;
            for (InterestLikes interestLikes : result) {
                if (interestLikes.getLikes() > likes) {
                    likes = interestLikes.getLikes();
                    var = interestLikes;
                }
            }
            sortedResult.add(var);
            result.remove(var);
        }
        return sortedResult;
    }

    public static boolean hasCommonInterest(Client c1, Client c2) {
        List<InterestLikes> i1 = findInterestsOfAClient(c1.getEmail());
        List<InterestLikes> i2 = findInterestsOfAClient(c2.getEmail());
        for(InterestLikes i : i1) {
            if(i2.contains(i)) {
                return true;
            }
        }
        return false;
    }

}
