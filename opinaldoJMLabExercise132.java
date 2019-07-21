/*Exercise 32

Write a program that computes the following sum: 
sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N 
N will be an integer limit that the user enters. 
Enter N 
4

Sum is: 2.08333333333*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise132 {
 
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter N: ");
    String x = in.readLine();
    int num = Integer.parseInt(x);
    double sum = 0;
    
    for (int i = 1; i <= num; i++){
        sum += 1.0/i;}
    
    System.out.println("Sum: " + sum);
    }
}