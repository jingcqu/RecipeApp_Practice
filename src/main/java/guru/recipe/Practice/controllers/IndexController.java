package guru.recipe.Practice.controllers;

import guru.recipe.Practice.models.Category;
import guru.recipe.Practice.models.UnitOfMeasure;
import guru.recipe.Practice.repositories.CategoryRepository;
import guru.recipe.Practice.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * author: jingcqu
 * on: 10/09/2021
 */
@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/index", "", "/"})
    public String getIndexPage(){
        //System.out.println("Some aodshfsosaudnf");
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Cat id is:" + categoryOptional.get().getId());
        System.out.println("UOM id is:" + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
