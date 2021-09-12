package guru.recipe.Practice.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * author: jingcqu
 * on: 11/09/2021
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

    public Category(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipeSet() {
        return recipes;
    }

    public void setRecipeSet(Set<Recipe> recipeSet) {
        this.recipes = recipeSet;
    }
}
