import java.util.HashMap;
import java.util.Set;

public class RecipeLibrary {
    private HashMap<String, Set<String>> cutRecipes; //Reference variable: declaring hashmap variable cut recipes
    private HashMap<String, Set<String>> bulkRecipes; //Reference variable: declaring hashmap variable bulk recipes
    private HashMap<String, Set<String>> regularRecipes;

    public RecipeLibrary() { //Constructor: creating instance of HashMap class in cutRecipes, bulkRecipes, and regularRecipes
        cutRecipes = new HashMap<>(); 
        bulkRecipes = new HashMap<>();
        regularRecipes = new HashMap<>();

        cutRecipes.put("Protein Yogurt", Set.of("greek yogurt", "whey", "blueberries"));
        cutRecipes.put("Chicken Broccolli and Rice", Set.of("chicken", "garlic", "salt", "rice", "broccolli"));
        cutRecipes.put("Oven Baked Pink Salmon", Set.of("salmon", "garlic", "black pepper", "salt"));
        cutRecipes.put("Grilled Chicken Salad", Set.of("chicken", "lettuce", "tomatoes", "cucumber", "olive oil"));
        cutRecipes.put("Tuna Salad", Set.of("tuna", "lettuce", "celery", "lemon", "black pepper"));
        cutRecipes.put("Egg White Omelet", Set.of("egg whites", "spinach", "tomatoes", "onions", "salt"));
        cutRecipes.put("Baked Cod", Set.of("cod", "lemon", "garlic", "olive oil", "black pepper"));
        cutRecipes.put("Turkey Lettuce Wraps", Set.of("ground turkey", "lettuce", "mustard", "tomatoes"));
        cutRecipes.put("Shrimp Stir Fry", Set.of("shrimp", "broccolli", "carrots", "soy sauce", "garlic"));
        cutRecipes.put("Chicken Vegetable Soup", Set.of("chicken", "carrots", "celery", "chicken broth", "onions"));
        cutRecipes.put("Grilled Salmon Salad", Set.of("salmon", "lettuce", "cucumber", "lemon", "olive oil"));
        cutRecipes.put("Zucchini Noodles", Set.of("zucchini", "marinara sauce", "chicken", "garlic"));
        cutRecipes.put("Cauliflower Rice Bowl", Set.of("cauliflower", "chicken", "broccolli", "soy sauce"));
        cutRecipes.put("Baked Chicken Breast", Set.of("chicken", "lemon", "garlic", "olive oil", "rosemary"));
        cutRecipes.put("Turkey Chili", Set.of("ground turkey", "beans", "tomatoes", "onions", "chili powder"));
        cutRecipes.put("Cucumber Tuna Boats", Set.of("tuna", "cucumber", "greek yogurt", "black pepper"));
        cutRecipes.put("Egg White Frittata", Set.of("egg whites", "spinach", "mushrooms", "feta cheese"));
        cutRecipes.put("Grilled Tilapia", Set.of("tilapia", "lemon", "garlic", "black pepper", "olive oil"));
        cutRecipes.put("Chicken Spinach Salad", Set.of("chicken", "spinach", "strawberries", "balsamic vinegar"));
        cutRecipes.put("Baked Turkey Meatballs", Set.of("ground turkey", "egg whites", "garlic", "italian seasoning"));

        bulkRecipes.put("Spicy Pork Curry", Set.of("curry powder", "pork", "rice", "carrots", "potatoes"));
        bulkRecipes.put("Ham Cheese Sandwich", Set.of("ham", "cheese", "bread", "mayonaise"));
        bulkRecipes.put("Pan Fried Sockeye Salmon", Set.of("butter", "salmon", "garlic"));
        bulkRecipes.put("Fried Eggs and Rice", Set.of("eggs", "rice", "oil"));
        bulkRecipes.put("Ground Beef Tacos", Set.of("tortillas", "ground beef", "shredded cheese"));
        bulkRecipes.put("Beef Burrito Bowl", Set.of("rice", "ground beef", "cheese", "beans", "sour cream"));
        bulkRecipes.put("Loaded Baked Potato", Set.of("potatoes", "cheese", "butter", "sour cream", "bacon"));
        bulkRecipes.put("Chicken Alfredo Pasta", Set.of("pasta", "chicken", "heavy cream", "parmesan cheese", "butter"));
        bulkRecipes.put("Breakfast Burrito", Set.of("eggs", "tortillas", "cheese", "sausage", "potatoes"));
        bulkRecipes.put("Pulled Pork Sandwich", Set.of("pork", "bread", "bbq sauce", "coleslaw"));
        bulkRecipes.put("Meatball Sub", Set.of("bread", "ground beef", "marinara sauce", "mozzarella cheese"));
        bulkRecipes.put("Fried Rice", Set.of("rice", "eggs", "soy sauce", "carrots", "peas"));
        bulkRecipes.put("Cheeseburger", Set.of("ground beef", "bread", "cheese", "lettuce", "tomatoes"));
        bulkRecipes.put("Steak and Potatoes", Set.of("steak", "potatoes", "butter", "garlic"));
        bulkRecipes.put("Mac and Cheese", Set.of("pasta", "cheese", "milk", "butter"));
        bulkRecipes.put("Pizza Bagels", Set.of("bagels", "marinara sauce", "mozzarella cheese", "pepperoni"));
        bulkRecipes.put("Sausage and Peppers", Set.of("sausage", "bell peppers", "onions", "olive oil"));
        bulkRecipes.put("Beef Stroganoff", Set.of("beef", "pasta", "mushrooms", "sour cream", "onions"));
        bulkRecipes.put("Chicken Quesadilla", Set.of("chicken", "tortillas", "cheese", "sour cream"));
        bulkRecipes.put("Pork Fried Rice", Set.of("pork", "rice", "eggs", "soy sauce", "green onions"));
        bulkRecipes.put("Bacon Egg and Cheese", Set.of("bacon", "eggs", "cheese", "bread", "butter"));
        bulkRecipes.put("Teriyaki Chicken Bowl", Set.of("chicken", "rice", "teriyaki sauce", "broccolli"));
        bulkRecipes.put("Spaghetti Bolognese", Set.of("pasta", "ground beef", "marinara sauce", "parmesan cheese", "garlic"));
        bulkRecipes.put("Philly Cheesesteak", Set.of("steak", "bread", "cheese", "bell peppers", "onions"));
        bulkRecipes.put("Chicken Parmesan", Set.of("chicken", "marinara sauce", "mozzarella cheese", "parmesan cheese", "pasta"));

        regularRecipes.putAll(cutRecipes);
        regularRecipes.putAll(bulkRecipes);

    }

    public HashMap<String, Set<String>> CutRecipes() { //getter methods

        return cutRecipes; 

    }

    public HashMap<String, Set<String>> BulkRecipes() {

        return bulkRecipes;

    }

    public HashMap<String, Set<String>> RegularRecipes() {

        return regularRecipes;

    }


}
