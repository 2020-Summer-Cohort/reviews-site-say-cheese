package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;

@Controller 
public class ReviewController {

    ReviewStorage reviewStorage;
    CheeseCategoryStorage cheeseCategoryStorage;
    public ReviewController(ReviewStorage reviewStorage){
        this.reviewStorage = reviewStorage;

    }

@RequestMapping("reviews/{cheeseName}")
    public String showSingleReview(@PathVariable String cheeseName, Model model){
        model.addAttribute("reviewToDisplay",reviewStorage.findReviewByCheeseName(cheeseName));
        return "review-template";
}
//      this.cheeseName = cheeseName;
//        this.texture = texture;
//        this.milkSource = milkSource;
//        this.geographicLocation = geographicLocation;
//        this.userRating = userRating;
//        this.userReviewComment = userReviewComment;
//        this.cheeseCategory = cheeseCategory;
//        this.hashTags = new ArrayList<>(Arrays.asList(hashTags));
//WE NEED TO ADAPT THIS BEFORE OUR REVIEW WORKS
    @PostMapping("reviews/add")
    public String addReview(String cheeseName, String texture, String milkSource, String geographicLocation, Integer userRating, String userReviewComment, String cheeseCategory, long... hashtagIds) {
        CheeseCategory reviewCheeseCategory = cheeseCategoryStorage.findCheeseCategoryByType(CheeseType); //WIP
//        Collection<Author> bookAuthors = Arrays.stream(authorIds)
//                .mapToObj(id->authorStorage.findAuthorById(id))
//                .collect(Collectors.toSet());
//        bookStorage.save(new Book(title,isbn,description,bookCampus, bookAuthors.toArray(Author[]::new)));
//        return "redirect:/campuses/"+campusName;
}




