package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheeseCategoryController {

    private CheeseCategoryStorage cheeseCategoryStorage;

    public CheeseCategoryController(CheeseCategoryStorage cheeseCategoryStorage) {
        this.cheeseCategoryStorage = cheeseCategoryStorage;
    }

    @RequestMapping("categories/{cheeseCategory}")
    public String showSingleCheeseType(@PathVariable String cheeseCategory, Model model) {
        model.addAttribute("cheesecategory", cheeseCategoryStorage.findCheeseCategoryByType((cheeseCategory)));
        return "category-template";
    }

    @RequestMapping("categories")
    public String showAllCheeseTypes(Model model) {
        model.addAttribute("cheesecategory", cheeseCategoryStorage.findAllCheeseCategories());
        return "index-template";
    }


}
