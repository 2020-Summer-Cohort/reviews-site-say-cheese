package org.wecancodeit.reviews;

import org.hibernate.annotations.MetaValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String cheeseName;
    private String texture;
    private String milkSource;
    private String geographicLocation;
    private int userRating;
    private String userReviewComment;
@ManyToOne
private CheeseCategory cheeseCategory;

    public Review(String cheeseName, String texture, String milkSource, String geographicLocation, int userRating, String userReviewComment, CheeseCategory cheeseCategory) {
        this.cheeseName = cheeseName;
        this.texture = texture;
        this.milkSource = milkSource;
        this.geographicLocation = geographicLocation;
        this.userRating = userRating;
        this.userReviewComment = userReviewComment;
        this.cheeseCategory = cheeseCategory;
    }

    public String getCheeseName() {
        return cheeseName;
    }

    public String getTexture() {
        return texture;
    }

    public String getMilkSource() {
        return milkSource;
    }

    public String getGeographicLocation() {
        return geographicLocation;
    }

    public int getUserRating() {
        return userRating;
    }

    public CheeseCategory getCheeseCategory() { return cheeseCategory; }

    public String getUserReviewComment() {
        return userReviewComment;
    }


}
