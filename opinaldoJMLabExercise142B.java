/*Exercise 42 --- Credit Card Bill

Improved Program:     Have the program prompt for the beginning balance, the 
monthly interest, and the payment amount. Also, when the balance falls below the
amount of the monthly payment, write out the final payment that will bring the 
balance to exactly zero.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise142B {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the balance: ");
    String b = in.readLine();
    double balance = Double.parseDouble(b);
    
    System.out.print("Enter the monthly interest(in percent): ");
    String I = in.readLine();
    double interest = Double.parseDouble(I);
    interest = interest * 0.01;
    
    System.out.print("Enter the monthly payment: ");
    String p = in.readLine();
    double monthpay = Double.parseDouble(p);
    
    double totalpay = 0, balanceleft = 0, totalpayleft = 0;
    int i = 1; 
    while(balance > monthpay){
        balance += balance * interest - monthpay;
        totalpay += monthpay;
        System.out.println("Month: " + (i++) + "\tBalance: " + balance + "\tTotal Payments: " + totalpay);
        balanceleft = balance - balance;
        totalpayleft = totalpay + balance;}
        System.out.println("Month: " + (i++) + "\tBalance: " + balanceleft + "              \tTotal Payments: " + totalpayleft);
    }
}