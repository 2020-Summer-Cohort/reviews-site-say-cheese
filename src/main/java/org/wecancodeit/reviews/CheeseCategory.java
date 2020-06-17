package org.wecancodeit.reviews;

import java.util.Collection;

public class CheeseCategory {

    private String cheeseType;
//    private Collection<Review> reviews;

    public CheeseCategory(String cheeseType){
//    public CheeseCategory(String cheeseType, Collection<Review> reviews) {
        this.cheeseType = cheeseType;
//        this.reviews = reviews  ;
    }


    public String getCheeseType() {
        return cheeseType;
    }

//    public Collection<Review> getReviews() {
//        return reviews;
//    }

}
