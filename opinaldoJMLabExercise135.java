/*Exercise 35 --- Power of a number

Write a program that computes X^N where X is a floating point number and N is a 
positive integer. The program informs the user that N must be positive if the 
user enters a negative value. Of course,

XN = X * X * X * ... * X
    ------------------
        N times

The user dialog will look something like this:

Enter X 
1.3 
Enter N 
5

1.3 raised to the power 5 is:  3.71293

-------

Enter X 
5.6 
Enter N 
-3

N must be a positive integer.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise135 {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter X: ");
    String X = in.readLine();
    float x = Float.parseFloat(X);
    
    float ans = 0;
    System.out.print("Enter N: ");
    String N = in.readLine();
    int n = Integer.parseInt(N);
        if(n > 0){
            for(int i = 1; i < n; i++){
                ans = (float) Math.pow(x,n);}
            System.out.println(x + " raised to the power " + n + " is: " + ans);}
        else{
            System.out.println("N must be a positive integer");}
    }
}