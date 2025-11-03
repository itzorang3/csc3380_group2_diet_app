package recipeapp;

import java.util.ArrayList;

/**
 * Represents a recipe with its name, required ingredients, and nutrition information.
 * Used to store recipe data and compare against user's available ingredients.
 */
public class Recipe {
    // Recipe name (e.g., "Apple Pie", "Caesar Salad")
    private String name;
    
    // List of ingredients required to make this recipe
    // Stored as Ingredient objects for consistent matching
    private ArrayList<Ingredient> requiredIngredients;
    
    // Calorie count for this recipe (for nutrition filtering in future)
    private int calories;
    
    // Protein content in grams (for nutrition filtering in future)
    private double protein;
    
    /**
     * Constructs a Recipe with the given parameters.
     * 
     * Process:
     * 1. Store recipe name
     * 2. Create a copy of the ingredients list (defensive copy to prevent external modification)
     * 3. Store calories and protein values
     * 
     * @param name the recipe name
     * @param ingredients the list of required ingredients (will be copied)
     * @param calories the calorie count for this recipe
     * @param protein the protein content in grams
     */
    public Recipe(String name, ArrayList<Ingredient> ingredients, int calories, double protein) {
        this.name = name;
        // Create a defensive copy of ingredients list to prevent external modification
        this.requiredIngredients = new ArrayList<>(ingredients);
        this.calories = calories;
        this.protein = protein;
    }
    
    /**
     * Gets the recipe name.
     * 
     * @return the recipe name as a string
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the list of required ingredients.
     * 
     * Returns a defensive copy to prevent external modification of the internal list.
     * 
     * @return a copy of the required ingredients list
     */
    public ArrayList<Ingredient> getRequiredIngredients() {
        // Return a copy to prevent external code from modifying our internal list
        return new ArrayList<>(requiredIngredients);
    }
    
    /**
     * Gets the calorie count.
     * 
     * @return the calories as an integer
     */
    public int getCalories() {
        return calories;
    }
    
    /**
     * Gets the protein content.
     * 
     * @return the protein in grams as a double
     */
    public double getProtein() {
        return protein;
    }
    
    /**
     * Checks if this recipe uses the given ingredient.
     * 
     * Process:
     * 1. Uses ArrayList.contains() to check if ingredient exists in recipe
     * 2. Relies on Ingredient.equals() for comparison (normalized name matching)
     * 
     * @param ingredient the ingredient to check
     * @return true if the recipe uses this ingredient, false otherwise
     */
    public boolean hasIngredient(Ingredient ingredient) {
        // Uses Ingredient.equals() which compares normalized names
        return requiredIngredients.contains(ingredient);
    }
    
    /**
     * Returns a string representation of this recipe.
     * 
     * Process:
     * 1. Build recipe name
     * 2. Build comma-separated ingredient list
     * 3. Add nutrition information (calories and protein)
     * 
     * @return formatted recipe information as a multi-line string
     */
    @Override
    public String toString() {
        // Use StringBuilder for efficient string concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("Recipe: ").append(name).append("\n");
        sb.append("Ingredients: ");
        
        // Add each ingredient name separated by commas
        for (int i = 0; i < requiredIngredients.size(); i++) {
            // Add comma before each ingredient except the first one
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(requiredIngredients.get(i).getName());
        }
        sb.append("\n");
        // Add nutrition information
        sb.append("Calories: ").append(calories).append(", Protein: ").append(protein).append("g");
        return sb.toString();
    }
}

