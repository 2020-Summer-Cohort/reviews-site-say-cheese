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

    public ReviewController(ReviewStorage reviewStorage) {
        this.reviewStorage = reviewStorage;

    }

    @RequestMapping("reviews/{cheeseName}")
    public String showSingleReview(@PathVariable String cheeseName, Model model) {
        model.addAttribute("reviewToDisplay", reviewStorage.findReviewByCheeseName(cheeseName));
        return "review-template";
    }
    @PostMapping("reviews/add")
    public String addReview(String cheeseName, String texture, String milkSource, String geographicLocation, int userRating, String userReviewComment, String cheeseType, long... hashtagIds) {
        CheeseCategory reviewCheeseCategory = cheeseCategoryStorage.findCheeseCategoryByCheeseType(cheeseType);
        Collection<HashTag> reviewHashtags = Arrays.stream(hashtagIds)
                .mapToObj(id->hashTagStorage.findHashtagById(id))
                .collect(Collectors.toSet());
        reviewStorage.save(new Review(cheeseName, texture, milkSource, geographicLocation, userRating, userReviewComment, reviewCheeseCategory, reviewHashtags.toArray(HashTag[]::new)));
        return "redirect:/categories/"+ cheeseType;
}
//    @PostMapping("reviews/delete")
//    public String deleteReview(long reviewId){
//        reviewStorage.deleteReviewById(reviewId);
//        return "redirect:/";
//    }
}



