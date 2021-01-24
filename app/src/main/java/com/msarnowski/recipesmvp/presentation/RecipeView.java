package com.msarnowski.recipesmvp.presentation;

import com.msarnowski.recipesmvp.entity.Recipe;

import java.util.ArrayList;

public interface RecipeView { // Inteface
    void updateRecipes(ArrayList<Recipe> recipes);
}