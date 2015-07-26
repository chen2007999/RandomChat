package models;


public class InterestLikes {

    public String interest;
    public int likes;

    public InterestLikes(String interest, int likes) {
        this.interest = interest;
        this.likes = likes;
    }

    public String getInterest() {
        return interest;
    }

    public int getLikes() {
        return likes;
    }
}
