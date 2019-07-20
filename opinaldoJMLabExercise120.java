/*Exercise 20 --- Internet Delicatessen

Sam and Ella's Delicatessen wants you to write a program to take orders from the 
Internet. Your program asks for the item, its price, and if overnight shipping is 
wanted. Regular shipping for items under $10 is $2.00; for items $10 or more shipping 
is $3.00. For overnight delivery add $5.00. 

Enter the item: 
Tuna Salad 
Enter the price: 
450 
Overnight delivery (0==no, 1==yes) 
1

Invoice:  
Tuna Salad    4.50  
Shipping      7.00  
Total         11.50

(Use our ordinary IO methods. A real Internet order form would use different I/O 
methods, but ignore this.)*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise120 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the item: ");
    String item = in.readLine();
    
    System.out.print("Enter the price: ");
    String x = in.readLine();
    double price = Double.parseDouble(x);
    
    System.out.print("Overnight delivery (0==no, 1==yes): ");
    String y = in.readLine();
    int on = Integer.parseInt(y);
    
        if (on == 1 && price > 10.00){
            double shipping = 3 + 5;
            double total = shipping + price;
            System.out.println("Invoice: \n" + item + "\nPrice: " + price + "\nShipping: " + shipping + "\nTotal: " + total);}
        else if (on == 1 && price < 10.00){
                double shipping = 2 + 5;
		double total = shipping + price;
                System.out.println("Invoice: \n" + item + "\nPrice: " + price + "\nShipping: " + shipping + "\nTotal: " + total);} 
        else if (on == 0 && price > 10.00) {
		double shipping = 3 + 5;
                double total = shipping + price;
		System.out.println("Invoice: \n" + item + "\nPrice: " + price + "\nShipping: " + shipping + "\nTotal: " + total);} 
        else {
            double shipping = 2 + 5;
            double total = shipping + price;
            System.out.println("Invoice: \n" + item + "\nPrice: " + price + "\nShipping: " + shipping + "\nTotal: " + total);}
    }
}