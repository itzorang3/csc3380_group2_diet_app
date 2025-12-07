import java.util.HashMap;
import java.util.Set;

public class RecipeLibrary {
    private HashMap<String, Recipe> cutRecipes; //Reference variable: declaring hashmap variable cut recipes
    private HashMap<String, Recipe> bulkRecipes; //Reference variable: declaring hashmap variable bulk recipes
    private HashMap<String, Recipe> regularRecipes; //Reference variable: declaring hashmap variable regular recipes

    public RecipeLibrary() { //Constructor: creating instance of HashMap class in cutRecipes, bulkRecipes, and regularRecipes
        cutRecipes = new HashMap<>(); 
        bulkRecipes = new HashMap<>();
        regularRecipes = new HashMap<>();

        cutRecipes.put("Protein Yogurt", new Recipe("Protein Yogurt", Set.of("greek yogurt", "whey", "blueberries"), 250, 30, 25, 2)); //creating new Recipe object with name, ingredients set, and macro values (calories, protein, carbs, fats) and adding to cutRecipes hashmap
        cutRecipes.put("Chicken Broccolli and Rice", new Recipe("Chicken Broccolli and Rice", Set.of("chicken", "garlic", "salt", "rice", "broccolli"), 450, 45, 50, 8)); //creating new Recipe object with name, ingredients set, and macro values and adding to cutRecipes hashmap
        cutRecipes.put("Oven Baked Pink Salmon", new Recipe("Oven Baked Pink Salmon", Set.of("salmon", "garlic", "black pepper", "salt"), 350, 38, 8, 18));
        cutRecipes.put("Grilled Chicken Salad", new Recipe("Grilled Chicken Salad", Set.of("chicken", "lettuce", "tomatoes", "cucumber", "olive oil"), 280, 30, 15, 12));
        cutRecipes.put("Tuna Salad", new Recipe("Tuna Salad", Set.of("tuna", "lettuce", "celery", "lemon", "black pepper"), 220, 28, 12, 8));
        cutRecipes.put("Egg White Omelet", new Recipe("Egg White Omelet", Set.of("egg whites", "spinach", "tomatoes", "onions", "salt"), 180, 22, 8, 4));
        cutRecipes.put("Baked Cod", new Recipe("Baked Cod", Set.of("cod", "lemon", "garlic", "olive oil", "black pepper"), 320, 36, 6, 16));
        cutRecipes.put("Turkey Lettuce Wraps", new Recipe("Turkey Lettuce Wraps", Set.of("ground turkey", "lettuce", "mustard", "tomatoes"), 240, 32, 10, 8));
        cutRecipes.put("Shrimp Stir Fry", new Recipe("Shrimp Stir Fry", Set.of("shrimp", "broccolli", "carrots", "soy sauce", "garlic"), 260, 30, 18, 10));
        cutRecipes.put("Chicken Vegetable Soup", new Recipe("Chicken Vegetable Soup", Set.of("chicken", "carrots", "celery", "chicken broth", "onions"), 200, 25, 20, 6));
        cutRecipes.put("Grilled Salmon Salad", new Recipe("Grilled Salmon Salad", Set.of("salmon", "lettuce", "cucumber", "lemon", "olive oil"), 300, 35, 12, 16));
        cutRecipes.put("Zucchini Noodles", new Recipe("Zucchini Noodles", Set.of("zucchini", "marinara sauce", "chicken", "garlic"), 280, 32, 15, 12));
        cutRecipes.put("Cauliflower Rice Bowl", new Recipe("Cauliflower Rice Bowl", Set.of("cauliflower", "chicken", "broccolli", "soy sauce"), 250, 30, 12, 10));
        cutRecipes.put("Baked Chicken Breast", new Recipe("Baked Chicken Breast", Set.of("chicken", "lemon", "garlic", "olive oil", "rosemary"), 320, 38, 5, 14));
        cutRecipes.put("Turkey Chili", new Recipe("Turkey Chili", Set.of("ground turkey", "beans", "tomatoes", "onions", "chili powder"), 280, 35, 25, 8));
        cutRecipes.put("Cucumber Tuna Boats", new Recipe("Cucumber Tuna Boats", Set.of("tuna", "cucumber", "greek yogurt", "black pepper"), 200, 26, 10, 6));
        cutRecipes.put("Egg White Frittata", new Recipe("Egg White Frittata", Set.of("egg whites", "spinach", "mushrooms", "feta cheese"), 190, 24, 6, 5));
        cutRecipes.put("Grilled Tilapia", new Recipe("Grilled Tilapia", Set.of("tilapia", "lemon", "garlic", "black pepper", "olive oil"), 310, 34, 7, 16));
        cutRecipes.put("Chicken Spinach Salad", new Recipe("Chicken Spinach Salad", Set.of("chicken", "spinach", "strawberries", "balsamic vinegar"), 270, 32, 14, 10));
        cutRecipes.put("Baked Turkey Meatballs", new Recipe("Baked Turkey Meatballs", Set.of("ground turkey", "egg whites", "garlic", "italian seasoning"), 260, 30, 8, 12));

        bulkRecipes.put("Spicy Pork Curry", new Recipe("Spicy Pork Curry", Set.of("curry powder", "pork", "rice", "carrots", "potatoes"), 650, 40, 70, 20));
        bulkRecipes.put("Ham Cheese Sandwich", new Recipe("Ham Cheese Sandwich", Set.of("ham", "cheese", "bread", "mayonaise"), 550, 32, 55, 22));
        bulkRecipes.put("Pan Fried Sockeye Salmon", new Recipe("Pan Fried Sockeye Salmon", Set.of("butter", "salmon", "garlic"), 420, 38, 5, 25));
        bulkRecipes.put("Fried Eggs and Rice", new Recipe("Fried Eggs and Rice", Set.of("eggs", "rice", "oil"), 580, 28, 65, 22));
        bulkRecipes.put("Ground Beef Tacos", new Recipe("Ground Beef Tacos", Set.of("tortillas", "ground beef", "shredded cheese"), 520, 35, 48, 24));
        bulkRecipes.put("Beef Burrito Bowl", new Recipe("Beef Burrito Bowl", Set.of("rice", "ground beef", "cheese", "beans", "sour cream"), 680, 42, 75, 28));
        bulkRecipes.put("Loaded Baked Potato", new Recipe("Loaded Baked Potato", Set.of("potatoes", "cheese", "butter", "sour cream", "bacon"), 750, 28, 70, 45));
        bulkRecipes.put("Chicken Alfredo Pasta", new Recipe("Chicken Alfredo Pasta", Set.of("pasta", "chicken", "heavy cream", "parmesan cheese", "butter"), 720, 45, 80, 28));
        bulkRecipes.put("Breakfast Burrito", new Recipe("Breakfast Burrito", Set.of("eggs", "tortillas", "cheese", "sausage", "potatoes"), 640, 32, 62, 30));
        bulkRecipes.put("Pulled Pork Sandwich", new Recipe("Pulled Pork Sandwich", Set.of("pork", "bread", "bbq sauce", "coleslaw"), 580, 35, 58, 24));
        bulkRecipes.put("Meatball Sub", new Recipe("Meatball Sub", Set.of("bread", "ground beef", "marinara sauce", "mozzarella cheese"), 620, 38, 65, 26));
        bulkRecipes.put("Fried Rice", new Recipe("Fried Rice", Set.of("rice", "eggs", "soy sauce", "carrots", "peas"), 600, 28, 70, 20));
        bulkRecipes.put("Cheeseburger", new Recipe("Cheeseburger", Set.of("ground beef", "bread", "cheese", "lettuce", "tomatoes"), 580, 32, 52, 28));
        bulkRecipes.put("Steak and Potatoes", new Recipe("Steak and Potatoes", Set.of("steak", "potatoes", "butter", "garlic"), 650, 42, 55, 32));
        bulkRecipes.put("Mac and Cheese", new Recipe("Mac and Cheese", Set.of("pasta", "cheese", "milk", "butter"), 680, 30, 75, 38));
        bulkRecipes.put("Pizza Bagels", new Recipe("Pizza Bagels", Set.of("bagels", "marinara sauce", "mozzarella cheese", "pepperoni"), 640, 28, 72, 30));
        bulkRecipes.put("Sausage and Peppers", new Recipe("Sausage and Peppers", Set.of("sausage", "bell peppers", "onions", "olive oil"), 620, 30, 45, 38));
        bulkRecipes.put("Beef Stroganoff", new Recipe("Beef Stroganoff", Set.of("beef", "pasta", "mushrooms", "sour cream", "onions"), 680, 40, 75, 30));
        bulkRecipes.put("Chicken Quesadilla", new Recipe("Chicken Quesadilla", Set.of("chicken", "tortillas", "cheese", "sour cream"), 560, 38, 48, 28));
        bulkRecipes.put("Pork Fried Rice", new Recipe("Pork Fried Rice", Set.of("pork", "rice", "eggs", "soy sauce", "green onions"), 620, 32, 68, 22));
        bulkRecipes.put("Bacon Egg and Cheese", new Recipe("Bacon Egg and Cheese", Set.of("bacon", "eggs", "cheese", "bread", "butter"), 580, 28, 48, 32));
        bulkRecipes.put("Teriyaki Chicken Bowl", new Recipe("Teriyaki Chicken Bowl", Set.of("chicken", "rice", "teriyaki sauce", "broccolli"), 600, 40, 70, 20));
        bulkRecipes.put("Spaghetti Bolognese", new Recipe("Spaghetti Bolognese", Set.of("pasta", "ground beef", "marinara sauce", "parmesan cheese", "garlic"), 700, 42, 78, 28));
        bulkRecipes.put("Philly Cheesesteak", new Recipe("Philly Cheesesteak", Set.of("steak", "bread", "cheese", "bell peppers", "onions"), 680, 38, 58, 32));
        bulkRecipes.put("Chicken Parmesan", new Recipe("Chicken Parmesan", Set.of("chicken", "marinara sauce", "mozzarella cheese", "parmesan cheese", "pasta"), 720, 44, 75, 30));

        regularRecipes.putAll(cutRecipes); //adding all cut recipes to regularRecipes hashmap
        regularRecipes.putAll(bulkRecipes); //adding all bulk recipes to regularRecipes hashmap

    }

    public HashMap<String, Recipe> CutRecipes() { //getter methods

        return cutRecipes; 

    }

    public HashMap<String, Recipe> BulkRecipes() { //getter methods

        return bulkRecipes;

    }

    public HashMap<String, Recipe> RegularRecipes() { //getter methods

        return regularRecipes;

    }


}
