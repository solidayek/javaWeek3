// object-oriented basics: it must be outside of your file name function, just place it on the top of the file 
class NoodleSoup{
    int meatballAmount;
    String noodlesType;
    String meatballType;
    String meatType;

    // method with renamed parameters
    void cook(String noodleChoice, String meatChoice, int meatballNumber){
        noodlesType = noodleChoice;
        meatballType = meatChoice;
        meatballAmount = meatballNumber;
        System.out.println("Today we're gonna make a noodle soupe with " + noodlesType + ", " + meatType + ", and with this many of meatballs " + meatballNumber);
    }
    // if you do not want to pass in parameters with different names, look at example below
    // Method with parameters having the same name as instance variables
    // void cook(String noodlesType, String meatType) {
    //     // Use 'this' to refer to instance variables
    //     this.noodlesType = noodlesType;
    //     this.meatType = meatType;
    //     System.out.println("Cooking with " + this.noodlesType + " and " + this.meatType + " meat.");
    // }



    // EXAMPLE NOTES(DON'T RELATE TO OUR CLASS NoodleSoup) let's create method inside this class for noodleSoup class
    // VOID methods don't return any value, they ONLY PERFORM ACTIONS
    // RETURN methods return a value; where you must specify the return type which are (int, String, boolean) instead of void
    
    //the difference between void and return, see the codes below: 
    void greet(){
        System.out.println("hello there mate!");
    }  
    // void can have parameters but it doesn't have to 

    int addAges(int momAge, int dadAge){
        return momAge + dadAge;
    }

}

// WHERE THE FILE BEGINS
public class basics {
    // where the public class is basically the title of your file code
    public static void main(String[] args){
        // so our code goes below
        System.out.println("This program will be about SOLIDAY'S FAMILY");
        int momAge = 62;
        int dadAge = 88;
        char grade = 'A'; // cant use quotation mark on char
        double gpa = 4.2;
        String myName = "Soliday";
        boolean isMomMean = true;
        System.out.println(momAge + dadAge);
        System.out.println("Use If-else statement");
        if (momAge > 55){
            System.out.println("Mom is quite old.");
        } else {
            System.out.println("She's not that old haha");
        }
        
        System.out.println("For loop");
        //for loop: in a structure consists three parts
        // initiation is set to 0, condition is set that if it's less than 5 (condition is ran before each loop iteration, if it's true, then loop will continue)
        // the update is the i++, it happens after each loop iteration, it changes the value of i 
        for (int i = 0; i < 5; i++){
            System.out.println("Count: " + i);
        }

        System.out.println("While loop");
        // while loop: you declare a variable to hold the initialization outside 
        int count = 1;
        while (count<4){
            System.out.println("Count: " + count);
            count++; // you print out and then increment the value of count by 1
        }
        
        showID(1013600);

        // let's create an object using my NoodleSoup class
        NoodleSoup soup = new NoodleSoup(); // our first soup
        soup.cook("tomyum", "pork", 5);




    } // Main function ends here! 


    // You're creating a function(method), it must be outside of the "main" function where we run our codes, it can be after our file name function
    // when we wanna use it, we call this method inside the main
    public static void showID(int ID){
        System.out.println("My ID is " + ID + ".");
    }
} // my FILE function ends here ! 





