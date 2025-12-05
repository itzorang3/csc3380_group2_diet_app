import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WhichLibrary {

    BulkCutOrRegular bulkCutOrRegular = new BulkCutOrRegular();
    RecipeLibrary recipeLibrary = new RecipeLibrary();

    HashMap<String, Set<String>> cutRecipeLibrary = recipeLibrary.CutRecipes();
    HashMap<String, Set<String>> bulkRecipeLibrary = recipeLibrary.BulkRecipes();
    HashMap<String, Set<String>> regularRecipeLibrary = recipeLibrary.RegularRecipes();

    public void whichLibrary(HashSet<String> ingredientsInHashSet, char bulkCutOrRegularInput) {

        HashMap<String, Set<String>> bestCutRecipes = new HashMap<>();
        HashMap<String, Set<String>> bestBulkRecipes = new HashMap<>();
        HashMap<String, Set<String>> bestRegularRecipes = new HashMap<>();

        if (bulkCutOrRegularInput == 'c'|| bulkCutOrRegularInput == 'C') {

            bestCutRecipes = bulkCutOrRegular.FindBestCutRecipes(ingredientsInHashSet, cutRecipeLibrary);
            System.out.printf("Your best recipes: %n" +bestCutRecipes);
            return;

        }

        else if (bulkCutOrRegularInput == 'b'|| bulkCutOrRegularInput == 'B') {

            bestBulkRecipes = bulkCutOrRegular.FindBestBulkRecipes(ingredientsInHashSet, bulkRecipeLibrary);
            System.out.printf("Your best recipes: %n" +bestBulkRecipes);
            return;

        }

        else if (bulkCutOrRegularInput == 'r'|| bulkCutOrRegularInput == 'R') {

            bestRegularRecipes = bulkCutOrRegular.FindBestRegularRecipes(ingredientsInHashSet, cutRecipeLibrary);
            bulkCutOrRegular.FindBestRegularRecipes(ingredientsInHashSet, regularRecipeLibrary);
            System.out.printf("Your best recipes: %n" +bestRegularRecipes);

        }
         
        System.out.println("Select a valid option. Either [B] for bulk, [C] for cut, or [R] for regular recipes.");
        System.exit(0);
    }

}
