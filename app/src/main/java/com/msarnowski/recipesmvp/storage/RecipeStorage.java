package com.msarnowski.recipesmvp.storage;

import com.msarnowski.recipesmvp.entity.Recipe;

import java.util.ArrayList;

public class RecipeStorage {
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public ArrayList<Recipe> getRecipes() {
        if (!recipes.isEmpty()) {
            return recipes;
        }

        return null;
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }
}
