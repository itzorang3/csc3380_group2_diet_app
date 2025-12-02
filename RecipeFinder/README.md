Diet App – Group 2

A console-based Java recipe finder that matches user ingredients to recipes across three categories: Bulk, Cut, and Regular. This version includes full ingredient normalization, match-percentage display, and missing-ingredient identification. All comparisons are case-insensitive and whitespace-trimmed, with full support for multi-word ingredients.

Software

Java Development Kit (JDK) 8 or higher

Runs entirely on standard Java; no external services or APIs required

Libraries

This project uses only built-in Java libraries:

java.util.Scanner

java.util.HashSet

java.util.HashMap

java.util.Set

java.util.Arrays

No external dependencies.

Installation and Setup

Navigate to the src folder containing the five Java files:
Main.java, Input.java, PutInHashSet.java, BulkCutOrRegular.java, RecipeLibrary.java

Compile all source files:

javac *.java


Run the application:

java Main

Usage

Launch the program:

java Main


Select a category at the prompt:

bulk

cut

regular

Enter ingredients as a comma-separated list:

chicken, rice, greek yogurt, spinach


The app will:

Normalize your input (case-insensitive, trimmed whitespace)

Match ingredients against recipes in the selected category

Display match counts and percentages

Show missing ingredients for each recipe

Include multi-word ingredient support

Example Output
Choose your category (bulk / cut / regular):
> bulk

Enter your ingredients (comma-separated):
> chicken, greek yogurt, rice

==============================
       MATCHING RECIPES
==============================

Recipe: High-Protein Chicken Bowl
Matched: 2/3 ingredients (66%)
Missing: spinach

Recipe: Mass Gainer Shake
Matched: 1/3 ingredients (33%)
Missing: oats, peanut butter

Recipe: Greek Yogurt Parfait
Matched: 1/2 ingredients (50%)
Missing: berries
