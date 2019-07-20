/*Exercise 11

Consider a brick that is dropped from a tower. The distance the brick falls depends 
on the the time since it was released. 

d = (1/2) g t^2

Here d is the distance in feet, t is the time in seconds, and g is 32.174. Write a 
program that asks the user for the number of seconds and then prints out the distance. 

Enter the number of seconds: 5.4 
Distance: 469.092 feet*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise111 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input number of seconds: ");
    String x = in.readLine();
    double t = Double.parseDouble(x);
    
    double g = 32.174;
    double d = (0.5)*g*t*t;
    System.out.println("Distance: "+ d +" feet");
    }
}