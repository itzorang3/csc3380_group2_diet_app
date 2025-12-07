\## Diet Recipe Finder App

A console-based Java recipe finder that helps users discover recipes based on their available ingredients. The app supports three dietary categories (Bulk, Cut, and Regular) and matches user ingredients with an extensive recipe library.



\## 🚀 Features:



Ingredient Matching: HashSet-based algorithm identifies recipes containing any of your available ingredients

Three Categories: Choose between Bulk (high calorie), Cut (low calorie), or Regular (both)

Smart Normalization: Case-insensitive matching with automatic whitespace trimming

Multi-word Support: Handles multi-word ingredients like "greek yogurt", "ground beef", "pickled ginger"

Macro Nutrient Display: Each recipe displays detailed nutritional information including calories, protein, carbohydrates, and fats

Object-Oriented Design: Recipe data encapsulated in Recipe class for clean, maintainable code structure



\## 📋 Requirements:



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



\## 🛠️ Installation and Setup:



Download and navigate to the project directory:

cd path/to/diet\_app/src



Compile all Java files:

javac \*.java



Run the application:

java Main



Once app is running, follow the prompts:

1\. Input ingredients (comma separated, spaces for multi-word ingredients, non case-sensitive)



2\. Select dietary mode (Bulk(b) Cut(c) or Regular(r) which shows both)



\## 📊 Example Output:



SEPARATE THE INGREDIENTS WITH COMMAS

e.g. pickles, pickled ginger,apples

Enter the ingredients:

salmon, garlic, rice, eggs



Choose whether you want recipes for high (Bulk\[B]) or low (Cut\[C]) calories. Or don't care/want to see both (Regular\[R])

Type just the letter \[B] for Bulk, \[C] for Cut or \[R] for Regular/Both

r



Your best matching recipes:



Pan Fried Sockeye Salmon

&nbsp; Calories: 420 | Protein: 38g | Carbs: 5g | Fats: 25g

&nbsp; Ingredients: \[butter, salmon, garlic]



Fried Eggs and Rice

&nbsp; Calories: 580 | Protein: 28g | Carbs: 65g | Fats: 22g

&nbsp; Ingredients: \[eggs, rice, oil]



Spicy Pork Curry

&nbsp; Calories: 650 | Protein: 40g | Carbs: 70g | Fats: 20g

&nbsp; Ingredients: \[curry powder, pork, rice, carrots, potatoes]



Fried Rice

&nbsp; Calories: 600 | Protein: 28g | Carbs: 70g | Fats: 20g

&nbsp; Ingredients: \[rice, eggs, soy sauce, carrots, peas]



Teriyaki Chicken Bowl

&nbsp; Calories: 600 | Protein: 40g | Carbs: 70g | Fats: 20g

&nbsp; Ingredients: \[chicken, rice, teriyaki sauce, broccolli]



Oven Baked Pink Salmon

&nbsp; Calories: 350 | Protein: 38g | Carbs: 8g | Fats: 18g

&nbsp; Ingredients: \[salmon, garlic, black pepper, salt]



Chicken Broccolli and Rice

&nbsp; Calories: 450 | Protein: 45g | Carbs: 50g | Fats: 8g

&nbsp; Ingredients: \[chicken, garlic, salt, rice, broccolli]



Baked Cod

&nbsp; Calories: 320 | Protein: 36g | Carbs: 6g | Fats: 16g

&nbsp; Ingredients: \[cod, lemon, garlic, olive oil, black pepper]



Shrimp Stir Fry

&nbsp; Calories: 260 | Protein: 30g | Carbs: 18g | Fats: 10g

&nbsp; Ingredients: \[shrimp, broccolli, carrots, soy sauce, garlic]



Zucchini Noodles

&nbsp; Calories: 280 | Protein: 32g | Carbs: 15g | Fats: 12g

&nbsp; Ingredients: \[zucchini, marinara sauce, chicken, garlic]



Baked Chicken Breast

&nbsp; Calories: 320 | Protein: 38g | Carbs: 5g | Fats: 14g

&nbsp; Ingredients: \[chicken, lemon, garlic, olive oil, rosemary]



\## 📈 Recipe Database:



The app includes 44 recipes total:

\- 19 Cut recipes (low-calorie options, typically 200-450 calories)

\- 25 Bulk recipes (high-calorie options, typically 420-750 calories)

\- All recipes include estimated macro nutrient values (calories, protein, carbohydrates, fats)



\## 🏗️ Project Structure:



The application follows an object-oriented design with the following classes:

\- `Main.java`: Entry point and program flow control

\- `Input.java`: Handles user input collection

\- `PutInHashSet.java`: Parses and normalizes ingredient input

\- `Recipe.java`: Encapsulates recipe data (name, ingredients, macros)

\- `RecipeLibrary.java`: Stores and manages recipe database

\- `BulkCutOrRegular.java`: Matches user ingredients to recipes

\- `WhichLibrary.java`: Selects appropriate recipe category based on user choice

