package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final CheeseCategoryRepository cheeseCategoryRepo;
    private final HashTagRepository hashTagRepo;

    public HomeController(CheeseCategoryRepository cheeseCategoryRepo, HashTagRepository hashTagRepo) {
        this.cheeseCategoryRepo = cheeseCategoryRepo;
        this.hashTagRepo = hashTagRepo;
    }

    @RequestMapping({"","/"})
    public String routeToCategories(Model model) {
        model.addAttribute("cheesecategories", cheeseCategoryRepo.findAll());
        model.addAttribute("hashtags", hashTagRepo.findAll());
        return "index-template";
    }

}
