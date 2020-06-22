package org.wecancodeit.reviews;

import org.hibernate.annotations.MetaValue;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

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
    @ManyToMany
    private Collection<HashTag> hashTags;

    protected Review() {

    }

    public Review(String cheeseName, String texture, String milkSource, String geographicLocation, int userRating, String userReviewComment, CheeseCategory cheeseCategory, HashTag... hashTags) {
        this.cheeseName = cheeseName;
        this.texture = texture;
        this.milkSource = milkSource;
        this.geographicLocation = geographicLocation;
        this.userRating = userRating;
        this.userReviewComment = userReviewComment;
        this.cheeseCategory = cheeseCategory;
        this.hashTags = new ArrayList<>(Arrays.asList(hashTags));
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

    public CheeseCategory getCheeseCategory() {
        return cheeseCategory;
    }

    public String getUserReviewComment() {
        return userReviewComment;
    }

    public long getId() {
        return id;
    }

    public Collection<HashTag> getHashTags() {
        return hashTags;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", cheeseName='" + cheeseName + '\'' +
                ", texture='" + texture + '\'' +
                ", milkSource='" + milkSource + '\'' +
                ", geograhicLocation='" + geographicLocation + '\'' +
                ", userRating='" + userRating + '\'' +
                ", userReviewComment='" + userReviewComment + '\'' +
                ", cheeseCategory='" + cheeseCategory + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return id == review.id &&
                Objects.equals(cheeseName, review.cheeseName) &&
                Objects.equals(texture, review.texture) &&
                Objects.equals(milkSource, review.milkSource) &&
                Objects.equals(geographicLocation, review.geographicLocation) &&
                Objects.equals(userRating, review.userRating) &&
                Objects.equals(userReviewComment, review.userReviewComment) &&
                Objects.equals(cheeseCategory, review.cheeseCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cheeseName, texture, milkSource, geographicLocation, userRating, userReviewComment, cheeseCategory);
    }

    public void addHashTag(HashTag hashTagToAdd) {
        hashTags.add(hashTagToAdd);
    }
}
