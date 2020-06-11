package org.wecancodeit.reviews;

import java.util.Collection;

public class CheeseCategory {

    private String nameCheese;
    private String cheeseType;
    private Collection<Cheeses> Cheeses;


    public CheeseCategory(String cheeseType, String nameCheese, Collection<Cheeses> cheeses) {
        this.cheeseType = cheeseType;
        this.nameCheese = nameCheese;
        Cheeses = cheeses;
    }



    public String getCheeseType() {
        return cheeseType;
    }

    public String getNameCheese() {
        return nameCheese;
    }

    public Collection<Cheeses> getCheeses() {
        return Cheeses;
    }

}
