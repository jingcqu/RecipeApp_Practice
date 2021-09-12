package guru.recipe.Practice.repositories;

import guru.recipe.Practice.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * author: jingcqu
 * on: 11/09/2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
