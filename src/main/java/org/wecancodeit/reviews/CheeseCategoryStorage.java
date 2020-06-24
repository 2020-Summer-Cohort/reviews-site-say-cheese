package org.wecancodeit.reviews;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CheeseCategoryStorage {

   private final CheeseCategoryRepository cheeseCategoryRepo;

    public CheeseCategoryStorage(CheeseCategoryRepository cheeseCategoryRepo) {
        this.cheeseCategoryRepo = cheeseCategoryRepo;
    }

    public CheeseCategory findCheeseCategoryByCheeseType(String cheeseCategoryType) { return cheeseCategoryRepo.findByCheeseType(cheeseCategoryType); }

    public Iterable<CheeseCategory> findAllCheeseCategories() { return cheeseCategoryRepo.findAll();}

//    public void addCheeseCategory(CheeseCategory cheeseCategory){cheeseCategoryRepo.save(cheeseCategory);}
}