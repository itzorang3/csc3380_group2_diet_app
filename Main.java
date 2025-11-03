package recipeapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main console interface for the Recipe Recommendation App.
 * Handles user input, recipe matching, and displays results.
 */
public class Main {
    
    // Minimum match percentage threshold for displaying recipes (70% = user has 70% of recipe's ingredients)
    private static final double MATCH_THRESHOLD = 70.0;
    
    /**
     * Main method that runs the recipe recommendation application.
     * Step-by-step process:
     * 1. Initialize components 
     * 2. Get user ingredients from console input
     * 3. Parse and validate ingredient list
     * 4. Find matching recipes 
     * 5. Display results with match percentages and missing ingredients
     * 
     * @param args command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Initialize core components
        // Scanner for reading user input from the console
        Scanner scanner = new Scanner(System.in);
        
        // RecipeDatabase contains all available recipes (currently hardcoded with 10 test recipes)
        RecipeDatabase database = new RecipeDatabase();
        
        // RecipeMatcher handles the matching algorithm and calculations
        RecipeMatcher matcher = new RecipeMatcher();
        
        // Display welcome message
        System.out.println("=== Recipe Recommendation App ===\n");
        
        // Get user ingredients from console input
        // Inform user about ingredient naming requirements (singular form required *for now*)
        System.out.println("Note: Enter ingredient names exactly as they appear (singular form).");
        System.out.print("Enter your ingredients (comma-separated): ");
        String input = scanner.nextLine().trim();
        
        // Parse the comma-separated input string into Ingredient objects
        // Converts "apple, sugar, flour" into an ArrayList of Ingredient objects
        // Each ingredient is normalized (lowercase, trimmed)
        ArrayList<Ingredient> userIngredients = parseIngredients(input);
        
        // Validate that the user provided at least one ingredient
        // If not, exit program 
        if (userIngredients.isEmpty()) {
            System.out.println("No ingredients provided. Exiting.");
            scanner.close();
            return;
        }
        
        // Close the scanner!
        scanner.close();
        
        // Find ALL recipes and calculate their match percentages
        // Use 0% threshold to get all recipes, then sort and display them
        // Allows us to show the closest matches even if they don't meet the 70% threshold
        ArrayList<RecipeMatch> allMatches = matcher.findMatches(database, userIngredients, 0.0);
        
        // Filter out recipes with 0% match (no matching ingredients)
        // Keep only recipes where user has at least one ingredient in common
        ArrayList<RecipeMatch> filteredMatches = new ArrayList<>();
        for (RecipeMatch match : allMatches) {
            if (match.getMatchPercentage() > 0.0) {
                filteredMatches.add(match);
            }
        }
        
        // Display the results to the user
        System.out.println("\n=== Recipe Recommendations ===");
        System.out.println("Your Ingredients: " + formatIngredients(userIngredients));
        System.out.println("Recommended Threshold: " + MATCH_THRESHOLD + "% (recipes at or above this are highly recommended)");
        System.out.println();
        
        // Check if any recipes were found
        if (filteredMatches.isEmpty()) {
            // No recipes with matching ingredients - suggestions to fix
            System.out.println("No recipes found with matching ingredients.");
            System.out.println("Try:");
            System.out.println("  - Adding more ingredients to your list");
            System.out.println("  - Using more common ingredients");
            System.out.println("  - Checking that your ingredient names are spelled correctly");
        } else {
            // Separate recipes for thresholds 
            ArrayList<RecipeMatch> recommendedMatches = new ArrayList<>();
            ArrayList<RecipeMatch> otherMatches = new ArrayList<>();
            
            for (RecipeMatch match : filteredMatches) {
                if (match.getMatchPercentage() >= MATCH_THRESHOLD) {
                    recommendedMatches.add(match);
                } else {
                    otherMatches.add(match);
                }
            }
            
            // Display recommended recipes first (70% and above)
            if (!recommendedMatches.isEmpty()) {
                System.out.println("=== Highly Recommended Recipes (>=" + MATCH_THRESHOLD + "% match) ===");
                System.out.println("Found " + recommendedMatches.size() + " recipe(s):\n");
                
                // Display each recipe
                for (int i = 0; i < recommendedMatches.size(); i++) {
                    RecipeMatch match = recommendedMatches.get(i);
                    displayRecipeMatch(match, i + 1, matcher, userIngredients, true);
                }
            }
            
            // Display the other recipes (below 70%, but with at least one matching ingredient)
            if (!otherMatches.isEmpty()) {
                if (!recommendedMatches.isEmpty()) {
                    System.out.println();
                }
                System.out.println("=== Other Close Matches (<" + MATCH_THRESHOLD + "% match) ===");
                System.out.println("Found " + otherMatches.size() + " recipe(s) that are close but need more ingredients:\n");
                
                // Display each close matching recipe
                for (int i = 0; i < otherMatches.size(); i++) {
                    RecipeMatch match = otherMatches.get(i);
                    displayRecipeMatch(match, i + 1, matcher, userIngredients, false);
                }
            }
        }
    }
    
    /**
     * Parses a comma-separated string of ingredients into an ArrayList of Ingredient objects.
     * 
     * Process:
     * 1. Check if input is null or empty, return empty list if so
     * 2. Split the input string by commas to separate individual ingredients
     * 3. For each part: trim and create an Ingredient object
     * 4. Ingredient constructor automatically normalizes the name (lowercase, trimmed)
     * 5. Skip any empty strings that might result from splitting
     * 
     * Example: "apple, sugar, flour" -> [Ingredient("apple"), Ingredient("sugar"), Ingredient("flour")]
     * 
     * @param input the comma-separated ingredient string from user input
     * @return a list of Ingredient objects representing the user's available ingredients
     */
    private static ArrayList<Ingredient> parseIngredients(String input) {
        // Initialize empty list to store parsed ingredients
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        
        // Validate input: return empty list if input is null
        if (input == null || input.trim().isEmpty()) {
            return ingredients;
        }
        
        // Split the input string by commas to separate individual ingredients
        // "apple, sugar, flour" becomes ["apple", " sugar", " flour"]
        String[] parts = input.split(",");
        
        // Process each ingredient string
        for (String part : parts) {
            // Remove extra spaces from each ingredient name
            String trimmed = part.trim();
            
            // Only add non-empty ingredients 
            if (!trimmed.isEmpty()) {
                // Create Ingredient object - constructor normalizes name (lowercase, trimmed)
                ingredients.add(new Ingredient(trimmed));
            }
        }
        
        return ingredients;
    }
    
    /**
     * Formats a list of ingredients into a readable, comma-separated string.
     * 
     * Process:
     * 1. Return empty string if list is empty
     * 2. Iterate through ingredients and append each name
     * 3. Add commas between ingredients (but not before the first one)
     * 
     * Example: [Ingredient("apple"), Ingredient("sugar"), Ingredient("flour")] 
     *          -> "apple, sugar, flour"
     * 
     * @param ingredients the list of ingredients to format
     * @return a comma-separated string of ingredient names suitable for display
     */
    private static String formatIngredients(ArrayList<Ingredient> ingredients) {
        // Return empty string if no ingredients provided
        if (ingredients.isEmpty()) {
            return "";
        }
        
        // StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();
        
        // Iterate through all ingredients
        for (int i = 0; i < ingredients.size(); i++) {
            // Add comma before each ingredient except the first one
            if (i > 0) {
                sb.append(", ");
            }
            // Append the ingredient name to the string
            sb.append(ingredients.get(i).getName());
        }
        
        return sb.toString();
    }
    
    /**
     * Displays a single recipe match with all its details.
     * Shows recipe name, match percentage, nutrition info, and missing ingredients.
     * 
     * @param match the RecipeMatch object containing recipe and match percentage
     * @param index the index number for display (1, 2, 3, etc.)
     * @param matcher the RecipeMatcher instance to calculate missing ingredients
     * @param userIngredients the user's available ingredients
     * @param isRecommended true if this recipe meets the threshold, false otherwise
     */
    private static void displayRecipeMatch(RecipeMatch match, int index, RecipeMatcher matcher, 
                                         ArrayList<Ingredient> userIngredients, boolean isRecommended) {
        Recipe recipe = match.getRecipe();
        
        // Display recipe name with indicator 
        String prefix = index + ". " + recipe.getName();
        if (isRecommended) {
            prefix += " [RECOMMENDED]";
        }
        System.out.println(prefix);
        
        // Display match percentage
        System.out.println("   Match: " + String.format("%.1f", match.getMatchPercentage()) + "%");
        
        // Display nutrition information (calories and protein for now)
        System.out.println("   Calories: " + recipe.getCalories() + " | Protein: " + recipe.getProtein() + "g");
        
        // Calculate and display missing ingredients for this recipe (if any)
        ArrayList<Ingredient> missing = matcher.findMissingIngredients(recipe, userIngredients);
        if (!missing.isEmpty()) {
            System.out.println("   Missing Ingredients: " + formatIngredients(missing));
        } else {
            // User has all ingredients needed - they can make this recipe!
            System.out.println("   You have all ingredients!");
        }
        System.out.println();
    }
}

