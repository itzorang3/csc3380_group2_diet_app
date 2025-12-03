import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BulkCutOrRegular {

    private HashMap<String, Set<String>> bestBulkRecipes; //Reference variable: declare null hashmap variable for bestBulkRecipes
    private HashMap<String, Set<String>> bestCutRecipes; //Reference variable: declare null hashmap variable for bestCutRecipes
    private HashMap<String, Set<String>> bestRegularRecipes;


    public BulkCutOrRegular() { //Constructor:
        this.bestBulkRecipes = new HashMap<>(); //makes new instance of bestBulkRecipes and creates new object of HashMap class
        this.bestCutRecipes = new HashMap<>(); //makes new instance of bestCutRecipes and creates new object of HashMap class
        this.bestRegularRecipes = new HashMap<>();
    }


    public HashMap<String, Set<String>> FindBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> bulkRecipes) {
        
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
        
        for (Map.Entry<String, Set<String>> entry : regularRecipes.entrySet()) {
            Set<String> temp = new HashSet<>(entry.getValue());
            temp.retainAll(ingredientsInHashSet);

            if (temp.size() > 0) {
                bestCutRecipes.put(entry.getKey(), entry.getValue());
            }
        }

        return bestRegularRecipes;

    }


}
