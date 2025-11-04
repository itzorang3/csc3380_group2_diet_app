DIET APP - GROUP 2:

Our app is a simple console-based recipe finder that helps users find recipes they can make with their available ingredients. The user inputs a list of ingredients, and the app  identifies all recipes that use at least one of those ingredients and then displays it to the user.  

This is an early version of the app with the main features:

Ingredient Matching: HashSet-based algorithm that identifies any recipe containing at least one user ingredient
Instant Results: Fast comparisons using Java collections framework
Simple Interface: No GUI (for now) 
Flexible Input: Supports multi-word ingredients (e.g., "peanut butter", "pickled ginger")

Note: There are only 3 recipes in the current version of the app (PB&J, Ham and cheese sandwich, and pan fried salmon), but we plan to use an API for future versions for a much larger database of recipes.

REQUIREMENTS

Software:

Java Development Kit (JDK): Version 8 or higher

Libraries:

No external libraries used in this version

Uses standard Java libraries:

java.util.Scanner
java.util.HashSet
java.util.HashMap
java.util.Arraylist



INSTALLATION AND SETUP

1. Save the code as RecipeFinder.java

2. Open terminal/command prompt and navigate to the file location:
	cd file/path/RecipeFinder.java

3. Compile Java file:
	javac RecipeFinder.java

4. Run the program:
	java RecipeFinder

USAGE

Once app is running, follow prompts:
	-Input ingredients (any case, separated by commas)
	-Use spaces only for multi-word ingredients (peanut butter)

Example output:

SEPARATE THE INGREDIENTS WITH COMMAS & ONLY USE SPACES FOR SPECIFIC WORDS
   e.g. pickles,pickled ginger,apples
   Enter the ingredients: 
   bread,butter,cheese *user input example
   
   Recipes you can make with your ingredients: [Ham Cheese Sandwich, Peanut Butter Sandwich] *expected output

