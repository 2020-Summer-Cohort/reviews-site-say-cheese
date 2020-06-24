package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class HashTag {
    @Id
    @GeneratedValue
    private Long id;
    private String hashTag;
    @ManyToMany(mappedBy = "hashTags")
    private Collection<Review> reviews;

    protected HashTag() {}

    public HashTag(String hashTag) {
        this.hashTag = hashTag;
    }

    public Long getId() {
        return id;
    }

    public String getHashTag() {
        return hashTag;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTag hashTag = (HashTag) o;
        return id == hashTag.id &&
                Objects.equals(hashTag,hashTag.hashTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hashTag);
    }

    @Override
    public String toString() {
        return "HashTag{" +
                "id=" + id +
                ", hashTag='" + hashTag + '\'' +
                '}';
    }
}
