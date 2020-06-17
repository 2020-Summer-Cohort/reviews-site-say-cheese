package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long>{

    Review findByCheeseName(String cheeseName);
}

