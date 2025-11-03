import java.util.*;

public class RecipeFinder {

    public static HashSet<String> scanner() { //scanner stores user input into hashset
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashSet<String> Ingredients = new HashSet<>(Arrays.asList(input.split(",")));

        scanner.close();
        return Ingredients;
    }

    public static void Question() { //interaction with user by just asking question and storing answer into hashset
        System.out.println("SEPARATE THE INGREDIENTS WITH COMMAS & ONLY USE SPACES FOR SPECIFIC WORDS");
        System.out.println("e.g. pickles,pickled ginger,apples");
        System.out.println("Enter the ingredients: ");
    }

    public static HashMap<String, Set<String>> Recipes() { //collection of recipes stored in hashmaps
        HashMap<String, Set<String>> Recipes = new HashMap<>();
        Recipes.put("Peanut Butter Sandwich", new HashSet<>(Arrays.asList("bread", "peanut butter", "jelly")));
        Recipes.put("Ham Cheese Sandwich", new HashSet<>(Arrays.asList("ham", "cheese", "bread")));
        Recipes.put("Pan Fried Salmon", new HashSet<>(Arrays.asList("butter", "salmon", "garlic")));

        return Recipes;
    }
//moves Recipes into hashset and finds which recipe shares ingredients from user input 
    public static HashSet<String> BestRecipes(HashSet<String> Ingredients, HashMap<String, Set<String>> Recipes) { 
        HashSet<String> BestRecipes = new HashSet<>();
        
        for (Map.Entry<String, Set<String>> entry : Recipes.entrySet()) {
        Set<String> temp = new HashSet<>(entry.getValue());
        temp.retainAll(Ingredients);

        if (temp.size() > 0) {
            BestRecipes.add(entry.getKey());
        }
    }


        return BestRecipes;
    }


    public static void main(String[] args) {

        RecipeFinder.Question();

        HashSet<String> Ingredients = scanner();

        HashSet<String> best = BestRecipes(Ingredients, Recipes());
        System.out.println("Recipes you can make with your ingredients: " + best);
 
    }

}



