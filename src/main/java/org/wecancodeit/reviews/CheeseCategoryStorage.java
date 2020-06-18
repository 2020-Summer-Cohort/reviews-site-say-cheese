package org.wecancodeit.reviews;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CheeseCategoryStorage {

    private CheeseCategoryRepository cheeseCategoryRepo;

    public CheeseCategoryStorage(CheeseCategoryRepository cheeseCategoryRepo) {
        this.cheeseCategoryRepo = cheeseCategoryRepo;
    }

    public CheeseCategory findCheeseCategoryByType(String cheeseCategoryType) { return cheeseCategoryRepo.findByCheeseType(cheeseCategoryType); }

    public Iterable<CheeseCategory> findAllCheeseCategories() { return cheeseCategoryRepo.findAll();}
}