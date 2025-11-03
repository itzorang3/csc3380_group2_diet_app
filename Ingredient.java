package recipeapp;

/**
 * Represents a single ingredient in a recipe.
 * All ingredient names are normalized to lowercase and trimmed for consistent matching.
 */
public class Ingredient {
    // Ingredient name (stored in lowercase, trimmed format for matching)
    private String name;
    
    /**
     * Constructs an Ingredient with the given name.
     * 
     * Process:
     * 1. Takes the input name (can be any case, with spaces)
     * 2. Converts to lowercase for case-insensitive matching
     * 3. Trims whitespace to handle user input errors
     * 
     * Example: "Apple " -> "apple", "SUGAR" -> "sugar"
     * 
     * @param name the ingredient name (will be normalized)
     */
    public Ingredient(String name) {
        // Normalize the name: convert to lowercase and remove leading/trailing spaces
        // This ensures consistent matching regardless of how user inputs the ingredient
        this.name = name.toLowerCase().trim();
    }
    
    /**
     * Gets the ingredient name.
     * 
     * @return the normalized ingredient name (lowercase, trimmed)
     */
    public String getName() {
        return name;
    }
    
    /**
     * Compares this ingredient to another object for equality.
     * 
     * Process:
     * 1. Check if same object reference (fast path)
     * 2. Check if other object is null or different type
     * 3. Compare normalized names using String.equals()
     * 
     * Two ingredients are equal if they have the same normalized name.
     * Example: Ingredient("Apple") equals Ingredient("apple") -> true
     * 
     * @param obj the object to compare
     * @return true if the objects are equal (same normalized name), false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Fast path: same object reference
        if (this == obj) {
            return true;
        }
        // Check if other object is null or different type
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Cast to Ingredient and compare normalized names
        Ingredient that = (Ingredient) obj;
        return name != null ? name.equals(that.name) : that.name == null;
    }
    
    /**
     * Returns a hash code for this ingredient.
     * 
     * Used for efficient storage in HashSet and HashMap.
     * Must be consistent with equals() - same name produces same hash code.
     * 
     * @return the hash code based on the ingredient name
     */
    @Override
    public int hashCode() {
        // Use name's hash code (or 0 if name is null)
        return name != null ? name.hashCode() : 0;
    }
    
    /**
     * Returns a string representation of this ingredient.
     * 
     * Simply returns the normalized ingredient name.
     * 
     * @return the ingredient name as a string
     */
    @Override
    public String toString() {
        return name;
    }
}

