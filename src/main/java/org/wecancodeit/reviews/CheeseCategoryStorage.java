package org.wecancodeit.reviews;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CheeseCategoryStorage {

    private Map<String, CheeseCategory> cheeseCategory = new HashMap<>();



    public CheeseCategory findCheeseCategoryByType(String cheeseCategoryType) { return cheeseCategory.get(cheeseCategoryType); }

    public Collection<CheeseCategory> findAllCheeseCategories() { return cheeseCategory.values(); }
}