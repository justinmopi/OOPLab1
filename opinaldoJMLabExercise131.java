/*Exercise 31 --- Adding up Integers

Write a program that adds up integers that the user enters. First the programs 
asks how many numbers will be added up. Then the program prompts the user for 
each number. Finally it prints the sum. 

How many integers will be added:
5
Enter an integer: 
3 
Enter an integer: 
4 
Enter an integer: 
-4 
Enter an integer: 
-3 
Enter an integer: 
7

The sum is 7 
Be careful not to add the number of integers (in the example, 5) into the sum.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise131 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
    System.out.print("How many integers will be added: ");
    String x = in.readLine();
    int n = Integer.parseInt(x);
    int sum = 0;
    
        for(int i = 0; i < n; i++){
            System.out.print("Enter an integer: ");
            String y = in.readLine();
            int num = Integer.parseInt(y);
            sum += num;}
    
    System.out.println("The sum is " + sum);
    }
}