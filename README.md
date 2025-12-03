## Diet Recipe Finder App
A console-based Java recipe finder that helps users discover recipes based on their available ingredients. The app supports three dietary categories (Bulk, Cut, and Regular) and matches user ingredients with an extensive recipe library.

## 🚀 Features:

Ingredient Matching: HashSet-based algorithm identifies recipes containing any of your available ingredients
Three Categories: Choose between Bulk (high calorie), Cut (low calorie), or Regular (both)
Smart Normalization: Case-insensitive matching with automatic whitespace trimming
Multi-word Support: Handles multi-word ingredients like "greek yogurt", "ground beef", "pickled ginger"

## 📋 Requirements:

Software
Java Development Kit (JDK): Version 8 or higher
No external services or APIs required

Libraries
Uses only standard Java libraries:

java.util.Scanner
java.util.HashSet
java.util.HashMap
java.util.Set
java.util.Map

## 🛠️ Installation and Setup:

Download and navigate to the project directory:
cd path/to/diet_app/src

Compile all Java files:
javac *.java

Run the application:
java Main

Once app is running, follow the prompts:
1. Input ingredients (comma separated, spaces for multi-word ingredients, non case-sensitive)

2. Select dietary mode (Bulk(b) Cut(c) or Regular(r) which shows both)

## 📊 Example Output:

SEPARATE THE INGREDIENTS WITH COMMAS
e.g. pickles, pickled ginger,apples
Enter the ingredients:
salmon, garlic, rice, eggs

Choose whether you want recipes for high (Bulk[B]) or low (Cut[C]) calories. Or don't care/want to see both (Regular[R])
Type just the letter [B] for Bulk, [C] for Cut or [R] for Regular/Both
r

Your best recipes:
{Pan Fried Sockeye Salmon=[butter, salmon, garlic],
 Fried Eggs and Rice=[eggs, rice, oil],
 Spicy Pork Curry=[curry powder, pork, rice, carrots, potatoes],
 Fried Rice=[rice, eggs, soy sauce, carrots, peas],
 Teriyaki Chicken Bowl=[chicken, rice, teriyaki sauce, broccolli],
 Oven Baked Pink Salmon=[salmon, garlic, black pepper, salt],
 Chicken Broccolli and Rice=[chicken, garlic, salt, rice, broccolli],
 Baked Cod=[cod, lemon, garlic, olive oil, black pepper],
 Shrimp Stir Fry=[shrimp, broccolli, carrots, soy sauce, garlic],
 Zucchini Noodles=[zucchini, marinara sauce, chicken, garlic],
 Baked Chicken Breast=[chicken, lemon, garlic, olive oil, rosemary]}