/*Exercise 13

The harmonic mean of two numbers is given by: 

H = 2 / ( 1/X + 1/Y )

This is sometimes more useful than the more usual average of two numbers. Write a 
program that inputs two numbers (as floating point) and writes out both the usual 
average (the arithmetic mean) and the harmonic mean. 

Enter X: 12 
Enter Y: 16 
Arithmetic mean: 14.0 
Harmonic   mean: 13.714285714285715*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise113 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input X: ");
    String X = in.readLine();
    float x = Float.parseFloat(X);
    
    System.out.print("Input Y: ");
    String Y = in.readLine();
    float y = Float.parseFloat(Y);
    
    double am = (x+y)/2;
    double hm = (2/((1/x)+(1/y)));
    System.out.println("Arithmetic mean: "+am);
    System.out.println("Harmonic mean: "+hm);
    }
}