/*Exercise 42 --- Credit Card Bill

Say that you owe the credit card company $1000.00. The company charges you 1.5% 
per month on the unpaid balance. You have decided to stop using the card and to 
pay off the debt by making a monthly payment of N dollars a month. Write a program 
that asks for the monthy payment, then writes out the balance and total payments 
so far for every succeeding month until the balance is zero or less. 

Enter the monthly payment:
100
Month: 1        balance: 915.0                  total payments: 100.0
Month: 2        balance: 828.725                total payments: 200.0
Month: 3        balance: 741.155875             total payments: 300.0 
Month: 4        balance: 652.273213125          total payments: 400.0 
Month: 5        balance: 562.057311321875       total payments: 500.0 
Month: 6        balance: 470.4881709917031      total payments: 600.0 
Month: 7        balance: 377.54549355657866     total payments: 700.0 
Month: 8        balance: 283.20867595992735     total payments: 800.0 
Month: 9        balance: 187.4568060993263      total payments: 900.0 
Month: 10       balance: 90.26865819081618      total payments: 1000.0 
Month: 11       balance: -8.377311936321576     total payments: 1100.0

For each month, calculate the interest due on the unpaid balance. Then calculate 
the new balance by adding the interest and subtracting the payment. */

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise142A {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the monthly payment: ");
    String x = in.readLine();
    double monthpay = Double.parseDouble(x);
    
    double balance = 1000.00, totalpay = 0;
    int i = 1; 
    while(balance > 0){
        balance += balance * 0.015 - monthpay;
        totalpay += monthpay;
        System.out.println("Month: " + (i++) + "\tBalance: " + balance + "\tTotal Payments: " + totalpay);}
    }
}