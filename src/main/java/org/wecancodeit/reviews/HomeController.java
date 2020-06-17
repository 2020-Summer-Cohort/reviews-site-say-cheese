package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private CheeseCategoryStorage cheeseCategoryStorage;
    public HomeController(CheeseCategoryStorage cheeseCategoryStorage) {
        this.cheeseCategoryStorage = cheeseCategoryStorage;
    }
    @RequestMapping({"","/"})
    public String routeToCategories(Model model) {
        model.addAttribute("cheesecategories", cheeseCategoryStorage.findAllCheeseCategories());
        return "index-template";
    }
}
