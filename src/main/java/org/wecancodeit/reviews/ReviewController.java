package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Controller 
public class ReviewController {

    ReviewStorage reviewStorage;
    CheeseCategoryStorage cheeseCategoryStorage;
    HashTagStorage hashTagStorage;

    public ReviewController(ReviewStorage reviewStorage,   CheeseCategoryStorage cheeseCategoryStorage, HashTagStorage hashTagStorage) {
        this.reviewStorage = reviewStorage;
        this.cheeseCategoryStorage = cheeseCategoryStorage;
        this.hashTagStorage = hashTagStorage;
    }

    @RequestMapping("reviews/{cheeseName}")
    public String showSingleReview(@PathVariable String cheeseName, Model model) {
        model.addAttribute("reviewToDisplay", reviewStorage.findReviewByCheeseName(cheeseName));
        return "review-template";
    }
    @PostMapping("reviews/add")
    public String addReview(String cheeseName, String texture, String milkSource, String geographicLocation,
                            Integer userRating, String userReviewComment,  long cheeseCategoryId) {
        CheeseCategory reviewCheeseCategory = cheeseCategoryStorage.findCheeseCategoryById(cheeseCategoryId);

        reviewStorage.save(new Review(cheeseName, texture, milkSource, geographicLocation, userRating, userReviewComment,
                reviewCheeseCategory));
        return "redirect:/categories/"+ reviewCheeseCategory.getCheeseType();
}

}



