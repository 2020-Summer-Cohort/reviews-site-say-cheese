package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface CheeseCategoryRepository extends CrudRepository<CheeseCategory, Long> {

   CheeseCategory findByCheeseType(String cheeseCategoryType);
}
