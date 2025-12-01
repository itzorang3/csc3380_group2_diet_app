import java.util.Arrays;
import java.util.HashSet;

public class PutInHashSet { //hashset cant have duplicates so tomatoes cant appear twice in hashset and no specific ordering like array so random ordering

    private HashSet<String> ingredients; //initialzing hashset Ingredients

    public HashSet<String> inputInHashSet(String ingredientsInput) {

        this.ingredients = new HashSet<>(Arrays.asList(ingredientsInput.split(",")));
        //creates new instance of ingredients which stores object of HashSet class which takes the arguments
        //split(",") which splits the string into array of substring while the commas act as the separation
        //between each word and arent included in the substrings

        return ingredients; //return the hashset

    }

}
