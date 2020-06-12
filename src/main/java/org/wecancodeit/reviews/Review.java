package org.wecancodeit.reviews;

public class Review {

    private String cheeseName;
    private String texture;
    private String milkSource;
    private String geographicLocation;
    private int userRating;
    private String userReviewComment;

    public Review(String cheeseName, String texture, String milkSource, String geographicLocation, int userRating, String userReviewComment) {
        this.cheeseName = cheeseName;
        this.texture = texture;
        this.milkSource = milkSource;
        this.geographicLocation = geographicLocation;
        this.userRating = userRating;
        this.userReviewComment = userReviewComment;
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

    public String getUserReviewComment() {
        return userReviewComment;
    }



}
