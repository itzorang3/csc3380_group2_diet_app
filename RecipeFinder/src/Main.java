import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Input input = new Input(); //creating new instance of Input class to be able to acesss it from diffrent class
        PutInHashSet putInHashSet = new PutInHashSet(); //creating new instance of PutInHashSet class to access its methods
        BulkCutOrRegular bulkCutOrRegular = new BulkCutOrRegular();
        RecipeLibrary recipeLibrary = new RecipeLibrary();

        String ingredientsInput = input.getIngredients(); //user input of ingredients in getIngredients class stored in string ingredientsInput for local access

        char bulkCutOrRegularInput = input.getBulkOrCut(); //user input of bulk or cut in getIngredients class stored in char BulkOrCut for local access

        HashSet<String> ingredientsInHashSet = putInHashSet.inputInHashSet(ingredientsInput);
        //takes ingredientsInput passes it through inputInHashSet method -method in PutInHashSet- argument. Makes Hashset from user input

        HashMap<String, Set<String>> cutRecipeLibrary = recipeLibrary.CutRecipes();
        HashMap<String, Set<String>> bulkRecipeLibrary = recipeLibrary.BulkRecipes();
        HashMap<String, Set<String>> regularRecipeLibrary = recipeLibrary.RegularRecipes();

        if (bulkCutOrRegularInput == 'c'|| bulkCutOrRegularInput == 'C') {

            HashMap<String, Set<String>> bestCutRecipes = bulkCutOrRegular.FindBestCutRecipes(ingredientsInHashSet, cutRecipeLibrary);
            System.out.println("Your best recipes:");
            System.out.println(bestCutRecipes);

        }

        if (bulkCutOrRegularInput == 'b'|| bulkCutOrRegularInput == 'B') {

            HashMap<String, Set<String>> bestBulkRecipes = bulkCutOrRegular.FindBestBulkRecipes(ingredientsInHashSet, bulkRecipeLibrary);
            System.out.println("Your best recipes:");
            System.out.println(bestBulkRecipes);

        }

        if (bulkCutOrRegularInput == 'r'|| bulkCutOrRegularInput == 'R') {

            HashMap<String, Set<String>> bestRegularRecipes = bulkCutOrRegular.FindBestBulkRecipes(ingredientsInHashSet, regularRecipeLibrary);
            System.out.println("Your best recipes:");
            System.out.println(bestRegularRecipes);

        }


        input.close();

    }
}
