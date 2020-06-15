package org.wecancodeit.reviews;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class CheeseCategoryStorage {
   private Map<String, CheeseCategory> cheeseCategory = new HashMap<>();

    public CheeseCategoryStorage(){
        Review review1 = new Review("Parmesan", "Hard & Gritty", "Cow", "Provinces of Parma",
                4, "Great cheese that has a bit of a nutty taste. Could be used by grating over pastas, added to a soup, " +
                "or eaten on its own as a snack.");
        Review review2 = new Review("Romano", "Hard & Salty", "Sheep", "Tuscany, Italy",
                4,"Sharp and tangy flavor. This is one of Italy's oldest cheese and makes an excellent table cheese.");
        cheeseCategory.put("Hard-Cheese", new CheeseCategory("Hard Cheese", new ArrayList<>(List.of(review1, review2))));
        Review review3 = new Review("Brie", "Soft & Creamy", "Cow", "Province of Brie, France",
                3, "This cheese has a bit of tang. It is excellent paired with wine and grapes.");
        Review review4 = new Review("Mozzarella", "Soft & Creamy", "Water Buffalo", "Naples, Italy",
                3,"This soft cheese comes in small balls and is great on pizza!");
        cheeseCategory.put("Soft-Cheese", new CheeseCategory("Soft Cheese", new ArrayList<>(List.of(review3, review4))));
    }

    public CheeseCategory findCheeseCategoryByType(String cheeseCategoryType) { return cheeseCategory.get(cheeseCategoryType); }

    public Collection<CheeseCategory> findAllCheeseCategories() { return cheeseCategory.values(); }

}
