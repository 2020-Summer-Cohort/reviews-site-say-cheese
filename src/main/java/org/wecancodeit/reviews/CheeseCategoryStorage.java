package org.wecancodeit.reviews;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CheeseCategoryStorage {

   private CheeseCategoryRepository cheeseCategoryRepo;

    public CheeseCategoryStorage(CheeseCategoryRepository cheeseCategoryRepo) {
        this.cheeseCategoryRepo = cheeseCategoryRepo;
    }

    public CheeseCategory findCheeseCategoryByCheeseType(String cheeseType) { return cheeseCategoryRepo.findByCheeseType(cheeseType); }

    public CheeseCategory findCheeseCategoryById(long id) {

            Optional<CheeseCategory> cheeseCategoryOptional = cheeseCategoryRepo.findById(id);
            CheeseCategory retrievedCheeseCategory;
            if(cheeseCategoryOptional.isEmpty()) {
                throw new ResourceNotFoundException("Cheese Category not found.");
            }else{
                retrievedCheeseCategory = cheeseCategoryOptional.get();
            }
            return retrievedCheeseCategory;

    }


    public Iterable<CheeseCategory> findAllCheeseCategories() { return cheeseCategoryRepo.findAll();}

//    public void addCheeseCategory(CheeseCategory cheeseCategory){cheeseCategoryRepo.save(cheeseCategory);}
}