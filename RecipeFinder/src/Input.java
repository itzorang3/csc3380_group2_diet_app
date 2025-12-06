import java.util.Scanner; 

public class Input {

    private Scanner scanner; //Reference variable: declaring variable scanner from Scanner class. Like empty placeholder and
    //private because no point of other classes being able to access it

    public Input() { 
        this.scanner = new Scanner(System.in);
    }
//Constructor: creates instance of the scanner variable and creates a new object of the Scanner class with the 
//userinput into the variable scanner. 

    public String getIngredients() {

        System.out.println("SEPARATE THE INGREDIENTS WITH COMMAS");
        System.out.println("e.g. pickles, pickled ginger,apples");
        System.out.println("Enter the ingredients: ");

        return scanner.nextLine().toLowerCase().trim(); //returns the user's ingredients and goes through method that converts string to lowecase

    }

    public char getBulkOrCut() {

        System.out.println("Choose whether you want recipes for high (Bulk[B]) or low (Cut[C]) calories. Or don't care/want to see both (Regular[R])");
        System.out.println("Type just the letter [B] for Bulk, [C] for Cut or [R] for Regular/Both");
        
        return scanner.next().charAt(0); //returns the user's choice for bulk, cut, or regular option

    }

    public void close() {
        
        scanner.close(); //method to close scanner for resource leaks

    }

}

