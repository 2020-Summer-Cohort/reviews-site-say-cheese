package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HashTagController {
    private HashTagRepository hashTagRepo;
    private ReviewStorage reviewStorage;

    public HashTagController(HashTagRepository hashTagRepo, ReviewStorage reviewStorage) {
        this.hashTagRepo = hashTagRepo;
        this.reviewStorage = reviewStorage;
    }

    @GetMapping("hashTags/{id}")
    public String showSingleHashTag(@PathVariable Long id, Model model) {
        model.addAttribute("hashTag", hashTagRepo.findById(id).get());
        return "hashTag-template";
    }

    @PostMapping("hashTags/add")
    public String addHashTag(String hashTag, String reviewName) {
        Review reviewToAddHashTag = reviewStorage.findReviewByCheeseName(reviewName);
        HashTag hashTagToAdd = new HashTag(hashTag);
        hashTagRepo.save(hashTagToAdd);
        reviewToAddHashTag.addHashTag(hashTagToAdd);
        reviewStorage.save(reviewToAddHashTag);
        return "redirect:/reviews/" + reviewName;
    }


}
