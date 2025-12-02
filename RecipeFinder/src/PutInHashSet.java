import java.util.Arrays;
import java.util.HashSet;

public class PutInHashSet {

    private HashSet<String> ingredients;

    public HashSet<String> inputInHashSet(String ingredientsInput) {
        String[] ingredientArray = ingredientsInput.toLowerCase().split(","); // make lowercase
        
        this.ingredients = new HashSet<>();
        for (String ingredient : ingredientArray) {
            ingredients.add(ingredient.trim()); // remove leading/trailing spaces
        }
        
        return ingredients;
    }
}