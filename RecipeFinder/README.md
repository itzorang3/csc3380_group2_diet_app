Diet App – Group 2
A console-based Java recipe finder that helps users discover recipes based on their available ingredients. The app supports three dietary categories (Bulk, Cut, and Regular) and provides intelligent matching with percentage calculations and missing ingredient identification.

🚀 Features

Ingredient Matching: HashSet-based algorithm identifies recipes containing user ingredients
Three Categories: Choose between Bulk (high calorie), Cut (low calorie), or Regular (both)
Smart Normalization: Case-insensitive matching with automatic whitespace trimming
Match Analytics: Displays percentage match and lists missing ingredients for each recipe
Multi-word Support: Handles complex ingredients like "greek yogurt", "ground beef", "pickled ginger"
Fast Performance: Leverages Java collections framework for instant results


📋 Requirements
Software

Java Development Kit (JDK): Version 8 or higher
No external services or APIs required

Libraries
Uses only standard Java libraries:

java.util.Scanner
java.util.HashSet
java.util.HashMap
java.util.Set
java.util.Arrays

No external dependencies needed.

🛠️ Installation and Setup

Navigate to the project directory:

bash   cd path/to/diet_app/src

Compile all Java files:

bash   javac *.java

Run the application:

bash   java Main

💡 Usage
Running the App

Launch the program:

bash   java Main
```

2. **Enter your ingredients** when prompted (comma-separated):
```
   salmon, garlic, rice, eggs
```
   - Use commas to separate ingredients
   - Spaces only for multi-word ingredients (e.g., "greek yogurt")
   - Capitalization doesn't matter

3. **Select a category**:
   - `B` or `b` → Bulk (high calorie recipes)
   - `C` or `c` → Cut (low calorie recipes)
   - `R` or `r` → Regular (shows both categories)

4. **View your results**:
   - Recipe names with match percentages
   - Missing ingredients for each recipe
   - Sorted by category

---

## 📊 Example Output
```
SEPARATE THE INGREDIENTS WITH COMMAS & ONLY USE SPACES FOR SPECIFIC WORDS
e.g. pickles,pickled ginger,apples
Enter the ingredients: 
salmon,garlic,rice,eggs

Choose whether you want recipes for high (Bulk[B]) or low (Cut[C]) calories. 
Or don't care/want to see both (Regular[R])
Type just the letter [B] for Bulk, [C] for Cut or [R] for Regular/Both
r

Your best recipes (BULK):
Pan Fried Sockeye Salmon: 2/3 ingredients (66%) - Missing: [butter]
Fried Eggs and Rice: 2/3 ingredients (66%) - Missing: [oil]
Spicy Pork Curry: 1/5 ingredients (20%) - Missing: [curry powder, pork, carrots, potatoes]

Your best recipes (CUT):
Oven Baked Pink Salmon: 2/4 ingredients (50%) - Missing: [black pepper, salt]
Chicken Broccoli and Rice: 2/5 ingredients (40%) - Missing: [chicken, broccoli, salt]

