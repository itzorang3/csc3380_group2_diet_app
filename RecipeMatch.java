package recipeapp;

/**
 * Wrapper class that pairs a Recipe with its match percentage.
 * Implements Comparable for automatic sorting by match percentage (highest first).
 * Used to store and sort recipe matches based on how well they match user's ingredients.
 */
public class RecipeMatch implements Comparable<RecipeMatch> {
    // The recipe being matched
    private Recipe recipe;
    
    // Match percentage (0-100) indicating how many ingredients user has
    // 100% means user has all ingredients, 0% means no matching ingredients
    private double matchPercentage;
    
    /**
     * Constructs a RecipeMatch with the given recipe and match percentage.
     * 
     * @param recipe the recipe that was matched
     * @param matchPercentage the match percentage (0-100) calculated by RecipeMatcher
     */
    public RecipeMatch(Recipe recipe, double matchPercentage) {
        this.recipe = recipe;
        this.matchPercentage = matchPercentage;
    }
    
    /**
     * Gets the recipe.
     * 
     * @return the Recipe object associated with this match
     */
    public Recipe getRecipe() {
        return recipe;
    }
    
    /**
     * Gets the match percentage.
     * 
     * @return the match percentage (0-100) indicating how well recipe matches user's ingredients
     */
    public double getMatchPercentage() {
        return matchPercentage;
    }
    
    /**
     * Compares this RecipeMatch to another for sorting.
     * 
     * Process:
     * 1. Compare match percentages
     * 2. Sort in descending order (highest match percentage first)
     * 3. Used by Collections.sort() to automatically sort recipe matches
     * 
     * @param other the other RecipeMatch to compare against
     * @return negative if this has higher percentage, positive if lower, 0 if equal
     */
    @Override
    public int compareTo(RecipeMatch other) {
        // Sort in descending order (highest first)
        // Compare other to this (reversed) to get descending order
        return Double.compare(other.matchPercentage, this.matchPercentage);
    }
    
    /**
     * Returns a string representation of this RecipeMatch.
     * 
     * Format: "Recipe Name (XX.X%)"
     * Example: "Apple Pie (85.5%)"
     * 
     * @return formatted string with recipe name and match percentage
     */
    @Override
    public String toString() {
        // Format recipe name with match percentage (1 decimal place)
        return String.format("%s (%.1f%%)", recipe.getName(), matchPercentage);
    }
}

