import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BulkCutOrRegular {

    public HashMap<String, Set<String>> FindBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> bulkRecipes) {
        
        HashMap<String, Set<String>> bestBulkRecipes = new HashMap<>(); //local variable declared in method since temporary result

        for (Map.Entry<String, Set<String>> entry : bulkRecipes.entrySet()) {

            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestBulkRecipes.put(entry.getKey(), entry.getValue());
            }
        }

        return bestBulkRecipes;

    }

    public HashMap<String, Set<String>> FindBestCutRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> cutRecipes) {
        
        HashMap<String, Set<String>> bestCutRecipes = new HashMap<>(); 

        for (Map.Entry<String, Set<String>> entry : cutRecipes.entrySet()) {
            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestCutRecipes.put(entry.getKey(), entry.getValue());
            }
        }

        return bestCutRecipes;

    }

    public HashMap<String, Set<String>> FindBestRegularRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> regularRecipes) {
        
        HashMap<String, Set<String>> bestRegularRecipes = new HashMap<>(); 

        for (Map.Entry<String, Set<String>> entry : regularRecipes.entrySet()) {
            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestRegularRecipes.put(entry.getKey(), entry.getValue());
            }
        }

        return bestRegularRecipes;

    }


}
