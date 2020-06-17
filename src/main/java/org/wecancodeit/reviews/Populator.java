package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Access;
import java.util.ArrayList;
import java.util.List;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CheeseCategoryRepository cheeseCategoryRepo;
    @Autowired
    ReviewRepository reviewRepo;

    @Override
    public void run(String... args) throws Exception {
        CheeseCategory hardCheese = new CheeseCategory("Hard Cheese");
        CheeseCategory softCheese = new CheeseCategory("Soft Cheese");
        cheeseCategoryRepo.save(hardCheese);
        cheeseCategoryRepo.save(softCheese);

        Review review1 = new Review("Parmesan", "Hard & Gritty", "Cow", "Provinces of Parma",
                4, "Great cheese that has a bit of a nutty taste. Could be used by grating over pastas, added to a soup, " +
                "or eaten on its own as a snack.", hardCheese);
        Review review2 = new Review("Romano", "Hard & Salty", "Sheep", "Tuscany, Italy",
                4,"Sharp and tangy flavor. This is one of Italy's oldest cheese and makes an excellent table cheese.", hardCheese);
        Review review3 = new Review("Brie", "Soft & Creamy", "Cow", "Province of Brie, France",
                3, "This cheese has a bit of tang. It is excellent paired with wine and grapes.",softCheese);
        Review review4 = new Review("Mozzarella", "Soft & Creamy", "Water Buffalo", "Naples, Italy",
                3,"This soft cheese comes in small balls and is great on pizza!", softCheese);
        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);

    }




}