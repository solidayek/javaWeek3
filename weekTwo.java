import java.util.Scanner;
public class weekTwo{
    // if that constant is BEING need across multiple methods, just declare using "static final" in that class
    public static final int shoes = 70;

    public static void main(String[] args){
        int age = 20;
        double price = 56.2;
        char grade = 'A';
        boolean isCrazy = true;
        // constant, we will use the keyword "final" to declare constants, they are the values that will never change
        final int dadAge = 40;
        final double pi = 1.762222;
        double circumference = 2 * pi * 3;
        // when it comes to operators, if you have two integers being divided then result will also be an integer (fractional part is discarded)
        System.out.println(7 / 4);  // result1 = 1
        System.out.println(7.0 / 4);

        // now say we want to generate RANDOM NUMBER, we will use Math.random() method to generate 
        // say we want to generate between a 1 and 20 
        int min = 1;
        int max = 20;
        int randomNumber = (int)(Math.random() * (max - min)) + min;
        // max - min + 1 = 20 - 1 + 1 = 20
        // Subtracting min from max gives you the total number of values between min and max, but it doesn't include the value max. Adding 1 ensures that max is part of the range.
        System.out.println("My random num: "+ randomNumber);

        // INPUT AND OUTPUT: Use the SCANNER class for input.
        // Use System.out.printf for formatted output.
        // before we read anything, import scanner
        Scanner in = new Scanner(System.in); // create an object named "in" and now we can use any methods from that Scanner class
        System.out.print("Enter your first name pls: ");
        String firstName = in.next(); // in.next reads the input up to the first space like if you have john doe, it will only read john
        System.out.println("Hello, " + firstName + "!");
        System.out.print("Enter your last name pls: ");
        String lastName = in.next();
        System.out.println("Hello, " + firstName + " "+ lastName + "!");

        // FORMATTING OUTPUT
        double hatPrice = 45.2222;
        System.out.printf("Price: %.2f", hatPrice); // the %.2f will print out the double value of the variable with only two decimals following after 
        // type casting to convert a double to an int
        double myBalance = 123.45;
        int mydollars = (int) myBalance; // dollars is 123

        // STRING OPERATIONS
        String school = "UCIrvine is cool";
        String sub = school.substring(1,5); // dont include character at index 5
        System.out.println("");
        System.out.println(sub);
        System.out.println(school.substring(2)); // starting printing out characters at index 2

        // calculate value of NUM
        double num = Math.sqrt(2) * Math.sqrt(2) - 2; // square roof of times itself and minus two, in real life it gives us 0 but in computer, it will definitely print out sth like 4.440892098



    }
}

//notes: 
/* there are 8 primitive data types which are integers, floating, character, boolean. 
Integer types: byte, short, int, long (used for whole numbers).
Floating-point types: float, double (used for decimal numbers).
Character type: char (stores a single character, e.g., 'A').
Boolean type: boolean (stores true or false).

 * 
 * 
 */