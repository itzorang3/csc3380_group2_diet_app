#CSC3380 DIET APP - Group 2

This is a console-based recipe recommendation application that helps users find recipes they can make with their available ingredients. Users input a list of ingredients, and the app matches them against a recipe database, calculating match percentages and displaying missing ingredients.

This is a **milestone version** of our app, the functions include: 

- Takes user input of available ingredients (comma-separated)
- Matches ingredients against a recipe database
- Calculates match percentages based on ingredient overlap
- Displays recommended recipes sorted by match percentage
- Shows missing ingredients for each recipe
- Filters recipes with at least one matching ingredient 


Requirements for running: 

### Software

- **Java Development Kit (JDK)**: Version 8 or higher

### Libraries

- **No external libraries required**
  - Uses only standard Java libraries:
    - `java.util.ArrayList`
    - `java.util.Scanner`
    - `java.util.Collections`

Installation and Setup:

1. **Clone or download the project** to your local machine

2. **Navigate to project directory**:
   cd Diet_app_project

3. Compile all Java source files:
    javac src/recipeapp/*.java

    This creates `.class` files in the `src/recipeapp/` directory.

4.Execute the main class:
    java -cp src recipeapp.Main


To use the app:

1. **Run the application** (see above)

2. **Enter your ingredients** 
   Note: Enter ingredient names exactly as they appear (singular form required for now).
   Enter your ingredients (comma-separated): apple, sugar, flour, butter

3. **See results**:
   - Recipes are displayed in two sections:
     - **Highly Recommended Recipes** (≥70% match)
     - **Other Close Matches** (<70% match but still has matching ingredients)
   - Each recipe shows:
     - Match percentage
     - Calories and protein (will add other macros, like carbs, for bulk/cut side feature)
     - Missing ingredients 


**Example Output**: 
=== Recipe Recommendations ===
Your Ingredients: cinnamon, apple, butter
Recommended Threshold: 70.0% (recipes at or above this are highly recommended)

=== Other Close Matches (<70.0% match) ===
Found 1 recipe(s) that are close but need more ingredients:

1. Apple Pie
   Match: 60.0%
   Calories: 450 | Protein: 5.5g
   Missing Ingredients: sugar, flour


Since this is a **milestone version** we have the following limitations: **planned to be completed for final submission**

1. **Hardcoded Recipe Database**
   - Currently contains only **10 test recipes**
   - Recipes are manually coded in `RecipeDatabase.java`
   - No API used (for now)

2. **Exact Ingredient Matching**
   - No fuzzy matching or synonym support
   - Ingredients must match exactly (after lowercase normalization)
   - Example: `"apples"` won't match `"apple"` (plural vs singular) 

3. **No GUI**
   - Console-based interface only

4. **No Persistence**
   - No data saving/loading
   - Recipes are loaded from hardcoded data each run
   - No user preferences or history

5. **Limited Recipe Data**
   - Only basic nutrition info (calories, protein)

 6. **Simple Matching Algorithm**
   - Basic percentage calculation: `(matching ingredients / total recipe ingredients) * 100`
   - No weighted ingredients (all ingredients treated equally)
   - No consideration for required vs optional ingredients

7. **Single Execution Mode**
   - Runs once per execution
   - No interactive loop to try multiple ingredient combinations
   - Must restart application for new search


