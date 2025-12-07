import java.util.Set;

public class Recipe {
    private String name; //Reference variable: declaring string variable for recipe name
    private Set<String> ingredients; //Reference variable: declaring Set variable for recipe ingredients
    private int calories; //Reference variable: declaring int variable for calories
    private int protein;      //Reference variable: declaring int variable for protein in grams
    private int carbohydrates; //Reference variable: declaring int variable for carbohydrates in grams
    private int fats;          //Reference variable: declaring int variable for fats in grams
    
    //Constructor: creating instance of Recipe class with name, ingredients set, and macro values
    public Recipe(String name, Set<String> ingredients, int calories, 
                  int protein, int carbohydrates, int fats) {
        this.name = name; //assigning name parameter to instance variable name
        this.ingredients = ingredients; //assigning ingredients parameter to instance variable ingredients
        this.calories = calories; //assigning calories parameter to instance variable calories
        this.protein = protein; //assigning protein parameter to instance variable protein
        this.carbohydrates = carbohydrates; //assigning carbohydrates parameter to instance variable carbohydrates
        this.fats = fats; //assigning fats parameter to instance variable fats
    }
    
    //Getter methods
    public String getName() { //getter method: returns the name of the recipe
        return name; 
    }
    
    public Set<String> getIngredients() { //getter method: returns the ingredients set of the recipe
        return ingredients;
    }
    
    public int getCalories() { //getter method: returns the calories of the recipe
        return calories;
    }
    
    public int getProtein() { //getter method: returns the protein in grams of the recipe
        return protein;
    }
    
    public int getCarbohydrates() { //getter method: returns the carbohydrates in grams of the recipe
        return carbohydrates;
    }
    
    public int getFats() { //getter method: returns the fats in grams of the recipe
        return fats;
    }
    
    //Override toString() method: formats recipe display with name, macros, and ingredients
    @Override
    public String toString() {
        return String.format("%s\n  Calories: %d | Protein: %dg | Carbs: %dg | Fats: %dg\n  Ingredients: %s",
            name, calories, protein, carbohydrates, fats, ingredients);
    }
}

