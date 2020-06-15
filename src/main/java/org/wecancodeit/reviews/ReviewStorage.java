package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReviewStorage {
    Map<String, Review> reviews = new HashMap<>();

    public ReviewStorage(){
        Review review1 = new Review("Parmesan", "Hard & Gritty", "Cow", "Provinces of Parma",
                4, "Great cheese that has a bit of a nutty taste. Could be used by grating over pastas, added to a soup, " +
                "or eaten on its own as a snack.");
        Review review2 = new Review("Romano", "Hard & Salty", "Sheep", "Tuscany, Italy",
                4,"Sharp and tangy flavor. This is one of Italy's oldest cheese and makes an excellent table cheese.");
        Review review3 = new Review("Brie", "Soft & Creamy", "Cow", "Province of Brie, France",
                3, "This cheese has a bit of tang. It is excellent paired with wine and grapes.");
        Review review4 = new Review("Mozzarella", "Soft & Creamy", "Water Buffalo", "Naples, Italy",
                3,"This soft cheese comes in small balls and is great on pizza!");
        reviews.put(review1.getCheeseName(), review1);
        reviews.put(review2.getCheeseName(), review2);
        reviews.put(review3.getCheeseName(), review3);
        reviews.put(review4.getCheeseName(), review4);
    }
    }
