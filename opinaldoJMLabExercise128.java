/*Exercise 28

Write a program that asks the user for a starting value and an ending value and 
then writes all the integers (inclusive) between those two values. 

Enter Start: 5 
Enter End: 9

5 
6 
7 
8 
9*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise128 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Start: ");
    String x = in.readLine();
    int start = Integer.parseInt(x);
    
    System.out.print("Enter End: ");
    String y = in.readLine();
    int end = Integer.parseInt(y);
    
    for (int i = start; i <= end; i++){
        System.out.println(i);}
    }
}