/*Exercise 25 --- Tire Pressure

The front tires of a car should both have the same pressure. Also, the rear tires 
of a car should both have the same pressure (but not neccessarily the same pressure 
as the front tires.) Write a program that reads in the pressure of the four tires 
and writes a message that says if the inflation is OK or not.

Input right front pressure 
38 
Input left front pressure 
38 
Input right rear pressure 
42 
Input left rear pressure 
42

Inflation is OK*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise125 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input right front pressure: ");
    String a = in.readLine();
    double rf = Double.parseDouble(a);
    
    System.out.print("Input left front pressure: ");
    String b = in.readLine();
    double lf = Double.parseDouble(b);

    System.out.print("Input right rear pressure: ");
    String c = in.readLine();
    double rr = Double.parseDouble(c);
    
    System.out.print("Input left rear pressure: ");
    String d = in.readLine();
    double lr = Double.parseDouble(d);
    
        if (rf==lf && rr==lr){
            System.out.println("Inflation is okay.");}
        else {
            System.out.println("Inflation is not okay.");}
    }
}