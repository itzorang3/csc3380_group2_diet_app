import java.util.HashMap;
import java.util.Set;

public class WhichLibrary {

    BulkCutOrRegular bulkCutOrRegular = new BulkCutOrRegular();
    RecipeLibrary recipeLibrary = new RecipeLibrary();

    HashMap<String, Set<String>> cutRecipeLibrary = recipeLibrary.CutRecipes();
    HashMap<String, Set<String>> bulkRecipeLibrary = recipeLibrary.BulkRecipes();
    HashMap<String, Set<String>> regularRecipeLibrary = recipeLibrary.RegularRecipes();

    public HashMap<String, Set<String>> ChooseLibrary(char bulkCutOrRegularInput, HashMap<String, Set<String>> bestBulk, HashMap<String, Set<String>> bestCut, HashMap<String, Set<String>> bestRegular) {

        HashMap<String, Set<String>> bestCutRecipes = new HashMap<>(); //local variables to method since temporary
        HashMap<String, Set<String>> bestBulkRecipes = new HashMap<>();
        HashMap<String, Set<String>> bestRegularRecipes = new HashMap<>();

        if (bulkCutOrRegularInput == 'c'|| bulkCutOrRegularInput == 'C') {
            
            return bestCutRecipes;

        }

        else if (bulkCutOrRegularInput == 'b'|| bulkCutOrRegularInput == 'B') {
            
            return bestBulkRecipes;

        }

        else if (bulkCutOrRegularInput == 'r'|| bulkCutOrRegularInput == 'R') {
            
            return bestRegularRecipes;

        }
         
        return new HashMap<>();
    }

}
