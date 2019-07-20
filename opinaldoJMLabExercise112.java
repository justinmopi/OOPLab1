/*Exercise 12

Write a program that inputs a number and outputs its base 2 logarithm. Use floating 
point input. This problem would be easy, but the Math package does not have a base 2 
logarithm method. Instead you have to do this: 

log2 X = (loge X) / (loge 2)

Here, loge X is the natural logarithm of X. Use this function in the Java Math package: 

Math.log( X )

When you use this, X must be a double. Write the program so that the user can enter 
floating point numbers. 

Enter a double: 998.65 
Base 2 log of 998.65 is 9.963835330516641*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise112 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input a double: ");
    String x = in.readLine();
    float y = Float.parseFloat(x);
    double z = (Math.log(y) / Math.log(2));
    System.out.println("Base 2 log of " + x + " is " + z);
    }
}