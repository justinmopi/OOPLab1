/*Exercise 6 --- Area of a Circle

Write a program that calculates the area of a circle from its radius. The radius 
will be an integer read in from the keyboard. The user dialog will look like this: 

Input the radius: 3 
The radius is: 3 
The area is: 28.274333882308138

You will need to use the constant PI which you get by using Math.PI*/ 

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise106 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input the radius: ");
    String r1 = in.readLine();
    int r2 = Integer.parseInt(r1); 
    double area = (double) Math.PI * r2 * r2;
    System.out.println("The radius is: \t" + r2);
    System.out.println("The area is: \t" + area);
    }    
}