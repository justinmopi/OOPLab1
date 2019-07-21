/*Exercise 30

Write a program that asks the user to enter two words. The program then prints 
out both words on one line. The words will be separated by enough dots so that 
the total line length is 30:

Enter first word: 
turtle 
Enter second word:
153

turtle....................153

This could be used as part of an index for a book. To print out the dots, use 
System.out.print(".") inside a loop body.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise130 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter first word: ");
    String x = in.readLine();
    
    System.out.print("Enter second word: ");
    String y = in.readLine();
    
    int dot = (30-x.length()-y.length());
    
    System.out.print(x);    
    for (int i = 0; i < dot; i++){
        System.out.print(".");}
    System.out.println(y);
    }
}