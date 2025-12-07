import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Input input = new Input(); //creating new instance of Input class to be able to acesss it from diffrent class
        PutInHashSet putInHashSet = new PutInHashSet(); //creating new instance of PutInHashSet class to access its methods
        RecipeLibrary recipeLibrary = new RecipeLibrary(); //creating new instance of RecipeLibrary class to access recipe data
        BulkCutOrRegular bulkCutOrRegular = new BulkCutOrRegular(); //creating new instance of BulkCutOrRegular class to access matching methods
        WhichLibrary whichLibrary = new WhichLibrary(); //creating new instance of WhichLibrary class to access library selection method

        String ingredientsInput = input.getIngredients(); //user input of ingredients in getIngredients class stored in string ingredientsInput for local access

        char bulkCutOrRegularInput = input.getBulkOrCut(); //user input of bulk or cut in getIngredients class stored in char BulkOrCut for local access

        HashSet<String> ingredientsInHashSet = putInHashSet.inputInHashSet(ingredientsInput);
        //takes ingredientsInput passes it through inputInHashSet method -method in PutInHashSet- argument. Makes Hashset from user input

        HashMap<String, Recipe> bulkRecipes = recipeLibrary.BulkRecipes(); //getting bulk recipes hashmap from recipeLibrary
        HashMap<String, Recipe> cutRecipes = recipeLibrary.CutRecipes(); //getting cut recipes hashmap from recipeLibrary
        HashMap<String, Recipe> regularRecipes = recipeLibrary.RegularRecipes(); //getting regular recipes hashmap from recipeLibrary

        HashMap<String, Recipe> bestBulk = bulkCutOrRegular.FindBestBulkRecipes(ingredientsInHashSet, bulkRecipes); //finding best matching bulk recipes based on user ingredients
        HashMap<String, Recipe> bestCut = bulkCutOrRegular.FindBestCutRecipes(ingredientsInHashSet, cutRecipes); //finding best matching cut recipes based on user ingredients
        HashMap<String, Recipe> bestRegular = bulkCutOrRegular.FindBestRegularRecipes(ingredientsInHashSet, regularRecipes); //finding best matching regular recipes based on user ingredients

        HashMap<String, Recipe> finalResults = whichLibrary.ChooseLibrary(bulkCutOrRegularInput, bestBulk, bestCut, bestRegular); //choosing which recipe library to return based on user selection

        if (finalResults.isEmpty()) { //if no recipes match user ingredients
            System.out.println("No recipes match your ingredients.");
        } else { //if recipes match user ingredients
            System.out.println("Your best matching recipes:");
            for (Recipe recipe : finalResults.values()) { //for each recipe in finalResults hashmap
                System.out.println(recipe.toString()); //display recipe with macro information using toString method
                System.out.println(); // blank line between recipes
            }
        }

        input.close(); //calls close method from input class which closes the scanner

    }
}
