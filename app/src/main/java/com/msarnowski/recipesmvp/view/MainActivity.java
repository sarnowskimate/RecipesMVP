package com.msarnowski.recipesmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.msarnowski.recipesmvp.R;
import com.msarnowski.recipesmvp.entity.Recipe;
import com.msarnowski.recipesmvp.presentation.RecipePresenter;
import com.msarnowski.recipesmvp.presentation.RecipeView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecipeView {
    private RecipePresenter recipePresenter = new RecipePresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipePresenter.onAttach(this);

        Button btnRefresh = findViewById(R.id.button);
        CheckBox isWithMeatCheckBox = findViewById(R.id.checkBox);

        View.OnClickListener listener = v -> {
            recipePresenter.refreshRecipes(!isWithMeatCheckBox.isChecked());
        };

        btnRefresh.setOnClickListener(listener);
    }

    @Override
    protected void onDestroy() {
        recipePresenter.onDetach();
        super.onDestroy();
    }

    @Override
    public void updateRecipes(ArrayList<Recipe> recipes) {
        TextView tvRecipes = findViewById(R.id.textView);
        String text = "";

        for (Recipe recipe : recipes) {
            text += recipe.getName() + ":\n" + recipe.getDescription() + "\n\n";
        }

        tvRecipes.setText(text);
    }
}