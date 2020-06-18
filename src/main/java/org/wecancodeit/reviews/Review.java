package org.wecancodeit.reviews;

import org.hibernate.annotations.MetaValue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

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

protected Review(){

}
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


@Override
public String toString(){
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
public int hashCode(){ return Objects.hash(id, cheeseName, texture, milkSource, geographicLocation, userRating, userReviewComment, cheeseCategory);}

}
