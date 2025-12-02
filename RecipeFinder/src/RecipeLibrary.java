import java.util.HashMap;
import java.util.Set;

public class RecipeLibrary {
    private HashMap<String, Set<String>> cutRecipes;
    private HashMap<String, Set<String>> bulkRecipes;

    public RecipeLibrary() { //Constructor: creating instance of HashMap class in cutRecipes and bulkRecipes
        cutRecipes = new HashMap<>(); 
        bulkRecipes = new HashMap<>();
    }

    public HashMap<String, Set<String>> CutRecipes() {

        cutRecipes.put("Protein Yogurt", Set.of("greek yogurt", "whey", "blueberries"));
        cutRecipes.put("Chicken Broccoli and Rice", Set.of("chicken", "garlic", "salt", "rice", "broccoli"));
        cutRecipes.put("Oven Baked Pink Salmon", Set.of("salmon", "garlic", "black pepper", "salt"));

        return cutRecipes; 

    }

    public HashMap<String, Set<String>> BulkRecipes() {

        bulkRecipes.put("Spicy Pork Curry", Set.of("curry powder", "pork", "rice", "carrots", "potatoes"));
        bulkRecipes.put("Ham Cheese Sandwich", Set.of("ham", "cheese", "bread", "mayonnaise"));
        bulkRecipes.put("Pan Fried Sockeye Salmon", Set.of("butter", "salmon", "garlic"));
        bulkRecipes.put("Fried Eggs and Rice", Set.of("eggs", "rice", "oil"));
        bulkRecipes.put("Ground Beef Tacos", Set.of("tortillas", "ground beef", "shredded cheese"));

        return bulkRecipes;

    }


}
