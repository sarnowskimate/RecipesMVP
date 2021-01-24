package com.msarnowski.recipesmvp.repository;

import com.msarnowski.recipesmvp.entity.Recipe;
import com.msarnowski.recipesmvp.storage.RecipeStorage;

import java.util.ArrayList;

public class RecipeRepository {
    private RecipeStorage recipeStorage = new RecipeStorage();

    { // example of 3 meat and vegan recipes
        this.recipeStorage.add(new Recipe("Buffalo Tofu Tenders", "Fried tofu tenders tossed in spicy buffalo sauce and served with vegan ranch. Comes with celery and carrot dipping.", false));
        this.recipeStorage.add(new Recipe("Rosemery Breadsticks", "Five grilled garlicky rosemary breadsticks, served with a spicy marinara sauce for dipping.", false));
        this.recipeStorage.add(new Recipe("Texas Nachos", "Tortilla chips smothered in vegan cheddar and tofu sour \"cream\" topped with black and red beans, salsa and pickled jalapeños.", false));
        this.recipeStorage.add(new Recipe("Gnocchi Fantasia", "Gnochhi tossed with chicken, chopped tomatoes, zucchini and artichokes in a spicy garlic and oil sauce.", true));
        this.recipeStorage.add(new Recipe("Cannelloni Casarecci", "Meat filled cannelloni baked in a blush sauce and topped with provolence cheese.", true));
        this.recipeStorage.add(new Recipe("Lobster Ravioli", "Jumbo lump crab and asparagus sauteed in a blush sauce tossed with lobster filled ravioli.", true));
    }

    public ArrayList<Recipe> getRecipes() {
        return recipeStorage.getRecipes();
    }
}
