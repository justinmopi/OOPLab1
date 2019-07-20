/*Exercise 8 --- Correct Change

When cashiers in a store give you change they try first try to "fit" dollars into 
the amount you get back, then try to "fit" quarters (25 cent coins) into what is 
left over, they try to "fit" dimes (10 cent coins) into what is now left over, then 
try to "fit" nickels (5 cent coins) into what is left, and finally are left with a 
few odd cents. For example, say that your change is 163 cents:

• One dollar fits into 163, leaving 63 cents. 
• Two quarters fit into 63 cents, leaving 13 cents. 
• One dime fits into 13 cents, leaving 3 cents. 
• No nickels are needed. 
• Three cents are left.

Your change is : 1 dollar, two quarters, one dime, and three cents. 

Write a program that reads change due to a user (in cents) and writes out how many 
dollars, quarters, dimes, nickels, and pennies she is due. All variables and all math 
in this program will be integers.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise108 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input change(in cents): ");
    String x = in.readLine();
    int change = Integer.parseInt(x);
    
    int dollar = change/100;change %= 100;
    int quarter = change/25;change %= 25;
    int dime = change/10;change %= 10;
    int nickel = change/5;change %= 5;
    
    System.out.print("Your change is: ");
    if (dollar != 0)
        System.out.print(dollar + " dollars, ");
    if (quarter != 0)
        System.out.print(quarter + " quarters, ");
    if (dime != 0)
        System.out.print(dime + " dimes, ");
    if (nickel != 0)
        System.out.print(nickel + " nickels, ");
    if (change != 0)
        System.out.println(change + " cents, ");
    }
}