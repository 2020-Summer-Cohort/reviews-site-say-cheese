package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class CheeseCategory {
    @Id
    @GeneratedValue
    private Long id;
    private String cheeseType;
    @OneToMany(mappedBy = "cheeseCategory")
    private Collection<Review> reviews;

    protected CheeseCategory() {
    }

    public CheeseCategory(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public Long getId() {
        return id;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheeseCategory cheeseCategory = (CheeseCategory) o;

        if (id != cheeseCategory.id) return false;
        if (!Objects.equals(cheeseType, cheeseCategory.cheeseType))
            return false;

        return false;
    }

    @Override
    public String toString() {
        return "CheeseCategory{" +
                "id=" + id +
                ", cheeseType='" + cheeseType + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (id^(id>>>32));
        result = 31*result + (cheeseType != null ? cheeseType.hashCode() : 0);
        return result;
    }
}
