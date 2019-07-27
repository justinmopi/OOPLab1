/*Exercise 40 --- Shipping Cost Calculator

A mail order company charges $3.00 for handling, free shipping for orders 10 
pounds or less, plus $0.25 for each pound over 10. Write a program that repeatedly 
asks the user for the weight of an order, then writes out the shipping charge. 
The program stops when a weight of zero or less is entered.

Weight of Order: 
5 
Shipping Cost: $3.00

Weight of Order 
20 
Shipping Cost: $5.50

Weight of Order 
0
bye*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise140 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    while(true){
        double shipping = 3.00;
        System.out.print("Weight of Order: ");
        String w = in.readLine();
        int weight = Integer.parseInt(w);
            if (weight == 0){
                break;}
            if(weight <= 10){
                System.out.println("Shipping Cost: $" + shipping);}
            else{
                System.out.println("Shipping Cost: $" + (shipping + (weight - 10) * 0.25));}}
    
    System.out.println("bye");
    }
}