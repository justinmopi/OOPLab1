/*Exercise 24 --- Check Charge

A bank has the following rule: if a customer has more than $1000 dollars in their 
checking account or more than $1500 dollars in their savings account, then there 
is no service charge for writing checks. Otherwise there is a $0.15 charge per check. 
Write a program that asks for the balance in each account and then writes out the service charge.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise124 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Checking Balance: ");
    String c = in.readLine();
    int check = Integer.parseInt(c);
        
    System.out.print("Saving Balance: ");
    String s = in.readLine();
    int save = Integer.parseInt(s);
    
    if (check > 1000 || save > 1500){
        System.out.println("There is no service charge");}
    else {
        System.out.println("You have a $0.15 charge");}
    }
}