package org.wecancodeit.reviews;

import java.util.Collection;

public class CheeseCategory {

    private String cheeseType;
    private Collection<Cheese> cheeses;


    public CheeseCategory(String cheeseType, String nameCheese, Collection<Cheese> cheeses) {
        this.cheeseType = cheeseType;
        this.cheeses = cheeses;
    }


    public String getCheeseType() {
        return cheeseType;
    }

    public Collection<Cheese> getCheeses() {
        return cheeses;
    }

}
