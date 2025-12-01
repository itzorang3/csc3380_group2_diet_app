import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BulkCutOrRegular {

    private HashSet<String> bestBulkRecipes;
    private HashSet<String> bestCutRecipes;

    public BulkCutOrRegular() {
        bestBulkRecipes = new HashSet<>();
        bestCutRecipes = new HashSet<>();
    }

    public HashSet<String> FindBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> bulkRecipes) {
        
        for (Map.Entry<String, Set<String>> entry : bulkRecipes.entrySet()) {
            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestBulkRecipes.add(entry.getKey());
            }
        }

        return bestBulkRecipes;

    }

    public HashSet<String> FindBestCutRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> cutRecipes) {
        
        for (Map.Entry<String, Set<String>> entry : cutRecipes.entrySet()) {
            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestCutRecipes.add(entry.getKey());
            }
        }

        return bestCutRecipes;

    }




}
