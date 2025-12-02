import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BulkCutOrRegular {

public HashSet<String> FindBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> bulkRecipes) {
    HashSet<String> bestBulkRecipes = new HashSet<>(); // LOCAL variable
    
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
    HashSet<String> bestCutRecipes = new HashSet<>(); // LOCAL variable
    
    for (Map.Entry<String, Set<String>> entry : cutRecipes.entrySet()) {
        Set<String> temp = new HashSet<>(entry.getValue());
        temp.retainAll(ingredientsInHashSet);
        
        if (temp.size() > 0) {
            bestCutRecipes.add(entry.getKey());
        }
    }
    
    return bestCutRecipes;
}

public void FindAndDisplayBestCutRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> cutRecipes) {
        
        for (Map.Entry<String, Set<String>> entry : cutRecipes.entrySet()) {
            Set<String> recipeIngredients = entry.getValue();
            Set<String> matchedIngredients = new HashSet<>(recipeIngredients);
            matchedIngredients.retainAll(ingredientsInHashSet);
            
            if (matchedIngredients.size() > 0) {
                String recipeName = entry.getKey();
                int matchCount = matchedIngredients.size();
                int totalIngredients = recipeIngredients.size();
                int percentage = (matchCount * 100) / totalIngredients;
                
                System.out.println(recipeName + ": " + matchCount + "/" + totalIngredients + 
                                 " ingredients (" + percentage + "%) - Missing: " + 
                                 getMissingIngredients(recipeIngredients, matchedIngredients));
            }
        }
    }
    
    public void FindAndDisplayBestBulkRecipes(HashSet<String> ingredientsInHashSet, HashMap<String, Set<String>> bulkRecipes) {
        
        for (Map.Entry<String, Set<String>> entry : bulkRecipes.entrySet()) {
            Set<String> recipeIngredients = entry.getValue();
            Set<String> matchedIngredients = new HashSet<>(recipeIngredients);
            matchedIngredients.retainAll(ingredientsInHashSet);
            
            if (matchedIngredients.size() > 0) {
                String recipeName = entry.getKey();
                int matchCount = matchedIngredients.size();
                int totalIngredients = recipeIngredients.size();
                int percentage = (matchCount * 100) / totalIngredients;
                
                System.out.println(recipeName + ": " + matchCount + "/" + totalIngredients + 
                                 " ingredients (" + percentage + "%) - Missing: " + 
                                 getMissingIngredients(recipeIngredients, matchedIngredients));
            }
        }
    }
    
    private Set<String> getMissingIngredients(Set<String> allIngredients, Set<String> matched) {
        Set<String> missing = new HashSet<>(allIngredients);
        missing.removeAll(matched);
        return missing;
    }
}

