/*Exercise 7 --- Cents to Dollars

Write a program that reads in a number of cents. The program will write out the 
number of dollars and cents, like this: 

Input the cents: 324 
That is  3 dollars and 24 cents. 

(For this program you will use integer arithmetic and will need to avoid floating 
point arithmetic. Review the integer remainder operator % if you are unsure how to proceed.)*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise107 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input the cents: ");
    String x = in.readLine(); 
    int cents = Integer.parseInt(x);
    int dollars = cents/100;
    System.out.println("That is " + dollars + " dollars and " + (cents % 100) + " cents"); 
    }
}