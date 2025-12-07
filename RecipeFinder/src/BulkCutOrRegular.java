import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BulkCutOrRegular {

    public HashMap<String, Recipe> FindBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Recipe> bulkRecipes) {
        
        HashMap<String, Recipe> bestBulkRecipes = new HashMap<>(); //local variable declared in method since temporary result

        for (Map.Entry<String, Recipe> entry : bulkRecipes.entrySet()) { //for every hasmap pair(key= recipe name/value=Recipe object)

            Set<String> temp = new HashSet<>(entry.getValue().getIngredients()); //creates new variable temp that is a Set which is an object of the hashset class
            //which then puts the ingredient values from the Recipe object inside the hashset object
            temp.retainAll(ingredientsInHashSet); //hashset temp compares with hashset ingredientsInHashSet for matching ingredients

            if (temp.size() > 0) { //if there is any matching ingredients
                bestBulkRecipes.put(entry.getKey(), entry.getValue()); //put our matching pairs into bestBulkRecipes
            }
        }

        return bestBulkRecipes;

    }

    public HashMap<String, Recipe> FindBestCutRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Recipe> cutRecipes) {
        
        HashMap<String, Recipe> bestCutRecipes = new HashMap<>(); //local variable declared in method since temporary result

        for (Map.Entry<String, Recipe> entry : cutRecipes.entrySet()) { //for every hasmap pair(key= recipe name/value=Recipe object)
            Set<String> temp = new HashSet<>(entry.getValue().getIngredients()); //creates new variable temp that is a Set which is an object of the hashset class
            //which then puts the ingredient values from the Recipe object inside the hashset object
            temp.retainAll(ingredientsInHashSet); //hashset temp compares with hashset ingredientsInHashSet for matching ingredients

            if (temp.size() > 0) { //if there is any matching ingredients
                bestCutRecipes.put(entry.getKey(), entry.getValue()); //put our matching pairs into bestCutRecipes
            }
        }

        return bestCutRecipes;

    }

    public HashMap<String, Recipe> FindBestRegularRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Recipe> regularRecipes) {
        
        HashMap<String, Recipe> bestRegularRecipes = new HashMap<>(); //local variable declared in method since temporary result

        for (Map.Entry<String, Recipe> entry : regularRecipes.entrySet()) { //for every hasmap pair(key= recipe name/value=Recipe object)
            Set<String> temp = new HashSet<>(entry.getValue().getIngredients()); //creates new variable temp that is a Set which is an object of the hashset class
            //which then puts the ingredient values from the Recipe object inside the hashset object
            temp.retainAll(ingredientsInHashSet); //hashset temp compares with hashset ingredientsInHashSet for matching ingredients

            if (temp.size() > 0) { //if there is any matching ingredients
                bestRegularRecipes.put(entry.getKey(), entry.getValue()); //put our matching pairs into bestRegularRecipes
            }
        }

        return bestRegularRecipes;

    }


}
