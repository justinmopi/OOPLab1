/*Exercise 9 --- Ohm's Law

Ohm's law relates the resistance of a electrical device (like a heater) to the electric 
current flowing through the device and the voltage applied to it. The law is: 

I = V/R

Here, V is the voltage (measured in volts), I is the current (measured in amps), and R is 
the resistance (measured in ohms.) Write a program that asks the user for the voltage and 
the resistance of a device. The program will then write out the current flowing through it. 
Use floating point math.

Since V and R are integers (converted from user input) you must use a trick to do floating 
point division. Change the equation to this: 

I = (V + 0.0)/R

The math inside parentheses is done first. So V + 0.0 is done first, and since 0.0 is 
floating point, so will be the result.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise109 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input the voltage: ");
    String x = in.readLine();
    int v = Integer.parseInt(x);
   
    System.out.print("Input the resistance: ");
    String y = in.readLine();
    int r = Integer.parseInt(y);
    
    float i = (float) ((v + 0.0)/r);
    System.out.println("The current is: " + i);
    }
}