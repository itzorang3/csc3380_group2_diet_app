import java.util.HashSet;

public class PutInHashSet { //hashset cant have duplicates so tomatoes cant appear twice in hashset and no specific ordering like array so random ordering

    private HashSet<String> ingredients; //Reference variable: declaring variable hashset Ingredients

    public HashSet<String> inputInHashSet(String ingredientsInput) { //Constructor:

        this.ingredients = new HashSet<>();
        //creates new instance of ingredients which stores object of HashSet class

        String cleanedInput = ingredientsInput; //creates local var cleanedInput and stores ingredientsInput

        String[] parts = cleanedInput.split(","); //splits up cleanedInput into separate strings and stores in array parts using split method

        for (String part : parts) {
            ingredients.add(part.trim()); //in array parts gets rid of the white spaces using trim method but trim method only gets the leading and ending
            //white spaces not white spcaes in between words like "pickled ginger" and then stores it into the local variable of for loop string part then
            //adds part with the trim method applied to it to the hashset ingredients
        }

        return ingredients; //return the hashset

    }

}
