import java.util.HashMap;

public class WhichLibrary {

    public HashMap<String, Recipe> ChooseLibrary(char bulkCutOrRegularInput, HashMap<String, Recipe> bestBulk, HashMap<String, Recipe> bestCut, HashMap<String, Recipe> bestRegular) { //method: chooses which recipe library to return based on user input

        if (bulkCutOrRegularInput == 'c'|| bulkCutOrRegularInput == 'C') { //if user chose cut option
            
            return bestCut; //return the best cut recipes hashmap

        }

        else if (bulkCutOrRegularInput == 'b'|| bulkCutOrRegularInput == 'B') { //if user chose bulk option
            
            return bestBulk; //return the best bulk recipes hashmap

        }

        else if (bulkCutOrRegularInput == 'r'|| bulkCutOrRegularInput == 'R') { //if user chose regular option
            
            return bestRegular; //return the best regular recipes hashmap

        }
         
        return new HashMap<>(); //default return empty hashmap if input doesn't match any option
    }

}
