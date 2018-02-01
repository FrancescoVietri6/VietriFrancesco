package com.dao;

public interface RecipeDaoInterface {
	
	public RecipeModel findRecipeById(String id);
	public List<RecipeModel> getRecipesForAuthor(String idAuthor);
	
}
