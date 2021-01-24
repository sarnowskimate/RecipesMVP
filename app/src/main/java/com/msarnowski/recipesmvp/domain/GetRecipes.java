package com.msarnowski.recipesmvp.domain;

import com.msarnowski.recipesmvp.entity.Recipe;
import com.msarnowski.recipesmvp.repository.RecipeRepository;

import java.util.ArrayList;

public class GetRecipes { // Interactor
    private RecipeRepository recipeRepository = new RecipeRepository();

    public ArrayList<Recipe> getRecipes(boolean isWithMeat) {
        ArrayList<Recipe> filteredRecipes = new ArrayList<>();
        ArrayList<Recipe> recipes = recipeRepository.getRecipes();

        for (Recipe recipe : recipes) {
            if (recipe.getIsWithMeat() == isWithMeat) {
                filteredRecipes.add(recipe);
            }
        }

        return filteredRecipes;
    }
}
