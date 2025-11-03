package recipeapp;

import java.util.ArrayList;

/**
 * Stores and manages all recipes in the application.
 * 
 * CURRENT IMPLEMENTATION (Milestone):
 * - Uses hardcoded test data with 10 sample recipes
 * - Recipes are manually created in the initializeRecipes() method
 * - This is temporary test data for demonstration purposes
 * 
 * FUTURE IMPLEMENTATION:
 * - Will be replaced with API integration (e.g., recipe API, database connection)
 * - The class structure is designed to support API integration seamlessly
 * - The getAllRecipes() and addRecipe() methods will remain the same interface
 * - Future: load recipes from external API instead of hardcoded data
 */
public class RecipeDatabase {
    private ArrayList<Recipe> recipes;
    
    /**
     * Constructs a RecipeDatabase and initializes it with hardcoded test recipes.
     * 
     * Process:
     * 1. Initialize empty recipes list
     * 2. Call initializeRecipes() to populate with test data
     * 
     * TODO (Future Enhancement):
     * - Replace initializeRecipes() call with API call to fetch recipes
     * - Example: this.recipes = RecipeAPI.fetchAllRecipes();
     * - Handle API errors and caching appropriately
     */
    public RecipeDatabase() {
        // Initialize empty list to store recipes
        this.recipes = new ArrayList<>();
        // Currently using hardcoded test data - will be replaced with API call in future
        // Populate database with 10 test recipes
        initializeRecipes();
    }
    
    /**
     * Initializes the database with hardcoded sample recipes.
     * 
     * TEMPORARY IMPLEMENTATION:
     * - Contains 10 hardcoded test recipes for milestone demonstration
     * - Recipes are manually created with ingredients, calories, and protein
     * - Used for testing and demonstration purposes only
     * 
     * FUTURE REPLACEMENT:
     * - This entire method will be replaced with API integration
     * - Instead of hardcoded recipes, will fetch from recipe API
     * - Example: recipes = RecipeAPI.getRecipesByIngredients(userIngredients)
     * - API will provide dynamic, up-to-date recipe data
     * 
     * TODO: Remove this method once API integration is complete
     */
    private void initializeRecipes() {
        // Recipe 1: Apple Pie
        ArrayList<Ingredient> applePieIngredients = new ArrayList<>();
        applePieIngredients.add(new Ingredient("apple"));
        applePieIngredients.add(new Ingredient("sugar"));
        applePieIngredients.add(new Ingredient("flour"));
        applePieIngredients.add(new Ingredient("butter"));
        applePieIngredients.add(new Ingredient("cinnamon"));
        recipes.add(new Recipe("Apple Pie", applePieIngredients, 450, 5.5));
        
        // Recipe 2: Caesar Salad
        ArrayList<Ingredient> caesarSaladIngredients = new ArrayList<>();
        caesarSaladIngredients.add(new Ingredient("lettuce"));
        caesarSaladIngredients.add(new Ingredient("chicken"));
        caesarSaladIngredients.add(new Ingredient("parmesan"));
        caesarSaladIngredients.add(new Ingredient("croutons"));
        caesarSaladIngredients.add(new Ingredient("caesar dressing"));
        recipes.add(new Recipe("Caesar Salad", caesarSaladIngredients, 320, 28.0));
        
        // Recipe 3: Fruit Smoothie
        ArrayList<Ingredient> smoothieIngredients = new ArrayList<>();
        smoothieIngredients.add(new Ingredient("banana"));
        smoothieIngredients.add(new Ingredient("strawberry"));
        smoothieIngredients.add(new Ingredient("yogurt"));
        smoothieIngredients.add(new Ingredient("honey"));
        recipes.add(new Recipe("Fruit Smoothie", smoothieIngredients, 250, 12.0));
        
        // Recipe 4: Pasta Carbonara
        ArrayList<Ingredient> pastaIngredients = new ArrayList<>();
        pastaIngredients.add(new Ingredient("pasta"));
        pastaIngredients.add(new Ingredient("eggs"));
        pastaIngredients.add(new Ingredient("bacon"));
        pastaIngredients.add(new Ingredient("parmesan"));
        pastaIngredients.add(new Ingredient("garlic"));
        recipes.add(new Recipe("Pasta Carbonara", pastaIngredients, 520, 22.5));
        
        // Recipe 5: Greek Salad
        ArrayList<Ingredient> greekSaladIngredients = new ArrayList<>();
        greekSaladIngredients.add(new Ingredient("tomato"));
        greekSaladIngredients.add(new Ingredient("cucumber"));
        greekSaladIngredients.add(new Ingredient("feta"));
        greekSaladIngredients.add(new Ingredient("olive"));
        greekSaladIngredients.add(new Ingredient("olive oil"));
        recipes.add(new Recipe("Greek Salad", greekSaladIngredients, 280, 10.0));
        
        // Recipe 6: Chocolate Chip Cookies
        ArrayList<Ingredient> cookieIngredients = new ArrayList<>();
        cookieIngredients.add(new Ingredient("flour"));
        cookieIngredients.add(new Ingredient("sugar"));
        cookieIngredients.add(new Ingredient("butter"));
        cookieIngredients.add(new Ingredient("egg"));
        cookieIngredients.add(new Ingredient("chocolate chips"));
        cookieIngredients.add(new Ingredient("vanilla"));
        recipes.add(new Recipe("Chocolate Chip Cookies", cookieIngredients, 480, 6.0));
        
        // Recipe 7: Grilled Chicken
        ArrayList<Ingredient> chickenIngredients = new ArrayList<>();
        chickenIngredients.add(new Ingredient("chicken"));
        chickenIngredients.add(new Ingredient("olive oil"));
        chickenIngredients.add(new Ingredient("salt"));
        chickenIngredients.add(new Ingredient("pepper"));
        chickenIngredients.add(new Ingredient("garlic"));
        recipes.add(new Recipe("Grilled Chicken", chickenIngredients, 280, 35.0));
        
        // Recipe 8: Vegetable Stir Fry
        ArrayList<Ingredient> stirFryIngredients = new ArrayList<>();
        stirFryIngredients.add(new Ingredient("broccoli"));
        stirFryIngredients.add(new Ingredient("carrot"));
        stirFryIngredients.add(new Ingredient("bell pepper"));
        stirFryIngredients.add(new Ingredient("soy sauce"));
        stirFryIngredients.add(new Ingredient("garlic"));
        stirFryIngredients.add(new Ingredient("ginger"));
        recipes.add(new Recipe("Vegetable Stir Fry", stirFryIngredients, 200, 8.0));
        
        // Recipe 9: Avocado Toast
        ArrayList<Ingredient> avocadoToastIngredients = new ArrayList<>();
        avocadoToastIngredients.add(new Ingredient("bread"));
        avocadoToastIngredients.add(new Ingredient("avocado"));
        avocadoToastIngredients.add(new Ingredient("salt"));
        avocadoToastIngredients.add(new Ingredient("pepper"));
        avocadoToastIngredients.add(new Ingredient("lemon"));
        recipes.add(new Recipe("Avocado Toast", avocadoToastIngredients, 350, 10.5));
        
        // Recipe 10: Omelette
        ArrayList<Ingredient> omeletteIngredients = new ArrayList<>();
        omeletteIngredients.add(new Ingredient("egg"));
        omeletteIngredients.add(new Ingredient("cheese"));
        omeletteIngredients.add(new Ingredient("butter"));
        omeletteIngredients.add(new Ingredient("mushroom"));
        omeletteIngredients.add(new Ingredient("onion"));
        recipes.add(new Recipe("Omelette", omeletteIngredients, 320, 18.0));
    }
    
    /**
     * Gets all recipes in the database.
     * 
     * Process:
     * 1. Return a defensive copy of the recipes list
     * 2. Prevents external code from modifying the internal list
     * 
     * NOTE: This method's interface will remain the same after API integration.
     * The implementation may change (e.g., caching, pagination) but the return type
     * and behavior will be consistent.
     * 
     * @return a copy of the recipes list
     */
    public ArrayList<Recipe> getAllRecipes() {
        // Return defensive copy to prevent external modification
        return new ArrayList<>(recipes);
    }
    
    /**
     * Adds a new recipe to the database.
     * 
     * Process:
     * 1. Add recipe to internal ArrayList
     * 2. Recipe is stored in memory (not persisted)
     * 
     * CURRENT USE: Adds to local ArrayList (in-memory storage)
     * 
     * FUTURE ENHANCEMENT:
     * - May integrate with API to save recipes remotely
     * - Could save to database or send to recipe API endpoint
     * - Useful for user-submitted recipes or favorites
     * 
     * @param recipe the recipe to add to the database
     */
    public void addRecipe(Recipe recipe) {
        // Add recipe to internal list (currently in-memory only)
        recipes.add(recipe);
    }
}

