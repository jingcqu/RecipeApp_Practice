package guru.recipe.Practice.repositories;

import guru.recipe.Practice.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * author: jingcqu
 * on: 11/09/2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    @Override
    Optional<Recipe> findById(Long aLong);
}
