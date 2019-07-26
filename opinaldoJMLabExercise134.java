/*Exercise 34 --- Adding up Squares and Cubes

Write a program that adds up the squares and adds up the cubes of integers from 
1 to N, where N is entered by the user:

Upper Limit:
5
The sum of Squares is  55 
The sum of Cubes   is  225

Do this by using just one loop that generates the integers. Of course, if you 
really needed to calculate these sums you would use the appropriate formulas: 

1^2 + 2^2 + 3^2 + ... + n^2 = n(n+1)(2n+1)/6 
1^3 + 2^3 + 3^3 + ... + n^3 = n2(n+1)2/4

Add these formulas to your program and print out their results as well as that 
of the explicit summations. */

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise134 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Upper Limit: ");
    String num = in.readLine();
    int n = Integer.parseInt(num);
    
    int sumsqr = 0, sumcube = 0;
    for(int i = 1; i < n; i++){
        sumsqr = n*(n+1)*(2*n+1)/6;
        sumcube = (n*n)*(n+1)*(n+1)/4;}
    
    System.out.println("The sum of squares is " + sumsqr);
    System.out.println("The sum of cubes is " + sumcube);
    }
}