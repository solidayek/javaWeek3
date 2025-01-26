import java.util.Scanner;
public class weekThree{
    public static void main(String[] args){
        // while loop
        String name = "Soliday";
        int i = 0;
        while (i < name.length()){
            System.out.print(name.charAt(i));
            i++;
        }
        // say you wanna use while loop to print numbers from 1 to 10
        int num = 1;
        while (num<= 10){
            System.out.println(num);
            num++;
        }
        // "do-while loop" executes the loop body at least once and then we check the condition 
        // it's useful because the body of loop is guaranteed to run at least once even if the condition is false on the first check..loop will execute code inside at least once
        int value; 
        do {
            System.out.print("Enter a number less than 100: ");
            Scanner in = new Scanner(System.in);
            value = in.nextInt(); // you take the integer in
        } while (value >= 100); // this is the condition where it will keep on asking the user to input a value accurately that is less than a 100 
    }
}