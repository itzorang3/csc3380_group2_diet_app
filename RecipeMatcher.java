package recipeapp;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Core matching logic for finding recipes based on user ingredients.
 * Provides methods to calculate match percentages and find matching recipes.
 */
public class RecipeMatcher {
    
    /**
     * Calculates the match percentage between a recipe and user's ingredients.
     * 
     * Algorithm:
     * 1. Count how many recipe ingredients the user has (using equals() for comparison)
     * 2. Divide matching count by total recipe ingredients to get a ratio
     * 3. Multiply by 100 to convert to percentage (0-100)
     * 
     * Formula: (matching ingredients / total recipe ingredients) * 100
     * 
     * Example: Recipe needs [apple, sugar, flour, butter]
     *          User has [apple, sugar]
     *          Match = (2 / 4) * 100 = 50%
     * 
     * @param recipe the recipe to match against
     * @param userIngredients the ingredients the user has available
     * @return the match percentage (0-100), where 100 means user has all ingredients
     */
    public double calculateMatchPercentage(Recipe recipe, ArrayList<Ingredient> userIngredients) {
        // Edge case: recipe with no ingredients has 0% match
        if (recipe.getRequiredIngredients().isEmpty()) {
            return 0.0;
        }
        
        // Count how many recipe ingredients the user has
        // Uses Ingredient.equals() method which compares normalized names
        int matchingCount = 0;
        for (Ingredient recipeIngredient : recipe.getRequiredIngredients()) {
            // Check if user's ingredient list contains this recipe ingredient
            // This uses the equals() method we implemented in Ingredient class
            if (userIngredients.contains(recipeIngredient)) {
                matchingCount++;
            }
        }
        
        // Calculate percentage: (matches / total) * 100
        // Cast to double to ensure floating-point division
        return (matchingCount / (double) recipe.getRequiredIngredients().size()) * 100.0;
    }
    
    /**
     * Finds all recipes that match the user's ingredients above the threshold.
     * 
     * Process:
     * 1. Iterate through all recipes in the database
     * 2. Calculate match percentage for each recipe using calculateMatchPercentage()
     * 3. If match percentage >= threshold, add to results list
     * 4. Sort results by match percentage (highest first) using RecipeMatch's Comparable interface
     * 
     * @param database the recipe database containing all available recipes
     * @param userIngredients the ingredients the user has available
     * @param threshold the minimum match percentage to include (e.g., 70.0 means 70% or higher)
     * @return a sorted list of RecipeMatch objects, sorted by match percentage (highest first)
     */
    public ArrayList<RecipeMatch> findMatches(RecipeDatabase database, ArrayList<Ingredient> userIngredients, double threshold) {
        // Initialize list to store recipes that meet the threshold
        ArrayList<RecipeMatch> matches = new ArrayList<>();
        
        // Step 1: Check each recipe in the database
        for (Recipe recipe : database.getAllRecipes()) {
            // Step 2: Calculate how well this recipe matches the user's ingredients
            double matchPercentage = calculateMatchPercentage(recipe, userIngredients);
            
            // Step 3: Only include recipes that meet or exceed the threshold
            if (matchPercentage >= threshold) {
                // Create a RecipeMatch object pairing the recipe with its match percentage
                matches.add(new RecipeMatch(recipe, matchPercentage));
            }
        }
        
        // Step 4: Sort matches by percentage (highest first)
        // RecipeMatch implements Comparable<RecipeMatch>, so Collections.sort() uses compareTo()
        Collections.sort(matches);
        
        return matches;
    }
    
    /**
     * Finds the ingredients that are missing from the user's list for a given recipe.
     * 
     * Process:
     * 1. Iterate through all ingredients required by the recipe
     * 2. Check if each required ingredient is in the user's ingredient list
     * 3. If not found, add it to the missing ingredients list
     * 4. Return the complete list of missing ingredients
     * 
     * This helps the user know what they need to buy or acquire to make the recipe.
     * 
     * Example: Recipe needs [apple, sugar, flour, butter]
     *          User has [apple, sugar]
     *          Returns [flour, butter]
     * 
     * @param recipe the recipe to check against
     * @param userIngredients the ingredients the user currently has
     * @return a list of Ingredient objects that the recipe needs but the user doesn't have
     */
    public ArrayList<Ingredient> findMissingIngredients(Recipe recipe, ArrayList<Ingredient> userIngredients) {
        // Initialize list to store missing ingredients
        ArrayList<Ingredient> missing = new ArrayList<>();
        
        // Check each ingredient required by the recipe
        for (Ingredient recipeIngredient : recipe.getRequiredIngredients()) {
            // If user doesn't have this ingredient, add it to missing list
            // Uses Ingredient.equals() method for comparison
            if (!userIngredients.contains(recipeIngredient)) {
                missing.add(recipeIngredient);
            }
        }
        
        return missing;
    }
}

