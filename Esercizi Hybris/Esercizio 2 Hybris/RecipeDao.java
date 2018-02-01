package com.dao.imp;

public class RecipeDao extends DefaultGenericDao implements RecipeDaoInterface{
	
	public RecipeModel findRecipeById(String id) {
		
		String queryStr = "SELECT{PK} FROM{Recipe} WHERE {id} = ?id";
		
		FlexibleSearchQuery fsq= newFlexibleSearchQuery(queryStr );
		
		fsq.addQueryParameter("id", id);
		
		SearchResult<RecipeModel> result= getFlexibleSearchService().search( fsq );
		
		RecipeModel recipe = result.getResult();
		
		return recipe;
	}
	
	public List<RecipeModel> getRecipesForAuthor(String idAuthor) {
		
		String queryStr = "SELECT{PK} FROM{Recipe as r join Author as a on r.authors=a.idAuthors} WHERE {a.idAuthors} = ?idAuthors";
		
		FlexibleSearchQuery fsq= newFlexibleSearchQuery(queryStr );
		
		fsq.addQueryParameter("idAuthors", idAuthors);
		
		SearchResult<RecipeModel> result= getFlexibleSearchService().search( fsq );
		
		List<RecipeModel> recipes = result.getResult();
		
		return recipes;
		
	}
}
