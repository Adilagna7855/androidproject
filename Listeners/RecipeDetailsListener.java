package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void dipFetch(RecipeDetailsResponse response,String message);
    void didError(String message);
}
