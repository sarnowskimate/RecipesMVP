package com.msarnowski.recipesmvp.presentation;

import com.msarnowski.recipesmvp.domain.GetRecipes;

public class RecipePresenter { // Presenter
    private GetRecipes getRecipes = new GetRecipes();
    private RecipeView recipeView;

    public void onAttach(RecipeView recipeView) {
        this.recipeView = recipeView;
    }

    public void onDetach() {
        recipeView = null;
    }

    public void refreshRecipes(Boolean isWithMeat) {
        recipeView.updateRecipes(getRecipes.getRecipes(isWithMeat));
    }
}