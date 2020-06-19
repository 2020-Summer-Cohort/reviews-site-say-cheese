package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.ScheduledExecutorService;

@Controller 
public class ReviewController {

    ReviewStorage reviewStorage;

    public ReviewController(ReviewStorage reviewStorage){
        this.reviewStorage = reviewStorage;

    }

@RequestMapping("reviews/{cheeseName}")
    public String showSingleReview(@PathVariable String cheeseName, Model model){
        model.addAttribute("reviewToDisplay",reviewStorage.findReviewByCheeseName(cheeseName));
        return "review-template";
}

}




