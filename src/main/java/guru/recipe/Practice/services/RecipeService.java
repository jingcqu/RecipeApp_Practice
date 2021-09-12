package guru.recipe.Practice.services;

import guru.recipe.Practice.models.Recipe;

import java.util.Set;

/**
 * author: jingcqu
 * on: 11/09/2021
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
