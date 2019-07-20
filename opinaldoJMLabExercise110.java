/*Exercise 10

Write a program that calculates the annual cost of running an appliance. The program 
will ask the user for the cost per kilowatt-hour and the number of kilowatthours the 
appliance uses in a year: 

Enter cost per kilowatt-hour in cents: 8.42 
Enter kilowatt-hours used per year: 653 
Annual cost: 54.9826*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise110 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input cost per kWh in cents: ");
    String x = in.readLine();
    float cost = Float.parseFloat(x);
    
    System.out.print("Input kWh used per year: ");
    String y = in.readLine();
    float year= Float.parseFloat(y);
    
    float z = (cost*year/100);
    System.out.println("Annual cost: "+z);
    }
}