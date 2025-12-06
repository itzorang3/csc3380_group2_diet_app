import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Input input = new Input(); //creating new instance of Input class to be able to acesss it from diffrent class
        PutInHashSet putInHashSet = new PutInHashSet(); //creating new instance of PutInHashSet class to access its methods
        RecipeLibrary recipeLibrary = new RecipeLibrary();
        BulkCutOrRegular bulkCutOrRegular = new BulkCutOrRegular();
        WhichLibrary whichLibrary = new WhichLibrary();

        String ingredientsInput = input.getIngredients(); //user input of ingredients in getIngredients class stored in string ingredientsInput for local access

        char bulkCutOrRegularInput = input.getBulkOrCut(); //user input of bulk or cut in getIngredients class stored in char BulkOrCut for local access

        HashSet<String> ingredientsInHashSet = putInHashSet.inputInHashSet(ingredientsInput);
        //takes ingredientsInput passes it through inputInHashSet method -method in PutInHashSet- argument. Makes Hashset from user input

        HashMap<String, Set<String>> bulkRecipes = recipeLibrary.BulkRecipes();
        HashMap<String, Set<String>> cutRecipes = recipeLibrary.CutRecipes();
        HashMap<String, Set<String>> regularRecipes = recipeLibrary.RegularRecipes();

        HashMap<String, Set<String>> bestBulk = bulkCutOrRegular.FindBestBulkRecipes(ingredientsInHashSet, bulkRecipes);
        HashMap<String, Set<String>> bestCut = bulkCutOrRegular.FindBestCutRecipes(ingredientsInHashSet, cutRecipes);
        HashMap<String, Set<String>> bestRegular = bulkCutOrRegular.FindBestRegularRecipes(ingredientsInHashSet, regularRecipes);

        HashMap<String, Set<String>> finalResults = whichLibrary.ChooseLibrary(bulkCutOrRegularInput, bestBulk, bestCut, bestRegular);

        if (finalResults.isEmpty()) {
            System.out.println("No recipes match your ingredients.");
        } else {
            System.out.println("Your best matching recipes:");
            System.out.println(finalResults);
        }

        input.close();




        input.close(); //calls close method from input class which closes the scanner

    }
}
