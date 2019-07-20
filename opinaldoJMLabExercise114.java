/*Exercise 14 --- Discount Prices

During a special sale at a store, a 10% discount is taken on purchases over $10.00. 
Write a program that asks for the amount of purchases, then calculates the discounted 
price. The purchase amount will be input in cents (as an integer):

Enter amount of purchases: 2000 
Discounted price: 1800 

Use integer arithmetic throughout the program.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise114 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input amount in cents: ");
    String x = in.readLine();
    int amount = Integer.parseInt(x);
    int discount = (amount/10);
    int total = (amount-discount);
        if (amount>=1000){
            System.out.println("Discounted price: " +total);}
        else {
            System.out.println("There is no discount below 1000\nDiscounted price: " +amount);}
    }
}