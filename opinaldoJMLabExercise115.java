/*Exercise 15 --- Order Checker

Bob's Discount Bolts charges the following prices: 

• 5 cents per bolt 
• 3 cents per nut 
• 1 cent per washer

Write a program that asks the user for the number of bolts, nuts, and washers in 
their purchase and then calculates and prints out the total. As an added feature, 
the program checks the order. It is usually a mistake if there are more bolts 
than nuts. In this case the program writes out "Check the Order." Otherwise the 
program writes out "Order is OK." In either case the total price is written out.

Number of bolts: 12 
Number of nuts: 8 
Number of washers: 24

Check the Order

Total cost: 108 

Use constants for the unit cost of each item. In other words, declare something 
like final int boltPrice = 5; and so on in your program.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise115 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Number of bolts: ");
    String b = in.readLine();
    int bolt = Integer.parseInt(b);
    final int boltPrice = 5;
    
    System.out.print("Number of nuts: ");
    String n = in.readLine();
    int nut = Integer.parseInt(n);
    final int nutPrice = 3;
    
    System.out.print("Number of washers: ");
    String w = in.readLine();
    int washer = Integer.parseInt(w);
    final int washerPrice = 1;
    
    int total = ((bolt*boltPrice)+(nut*nutPrice)+(washer*washerPrice));
    if (bolt>nut){
        System.out.println("Check the order \n\n"+"Total cost: "+total);}
    else {
        System.out.println("Order is OK \n\n"+"Total cost: "+total);}
    }
}