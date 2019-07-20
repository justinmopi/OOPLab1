/*Exercise 16 --- Last Chance Gas

Al's Last Chance Gas station sits on route 190 on the edge of Death Valley. There 
is no other gas station for 200 miles. You are to write a program to help drivers 
decide if they need gas. The program asks for:

• The capacity of the gas tank, in gallons 
• The indication of the gas gauge in percent (full= 100, three quarters full = 75, and so on) 
• The miles per gallon of the car.

The program then writes out "Get Gas" or "Safe to Proceed" depending on if the car 
can cross the 200 miles with the gas remaining in the tank. 

Tank capacity: 12 
Gage reading: 50 
Miles per gallon: 30 
Get Gas! 

Use integers for all input and all arithmetic.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise116 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Tank Capacity(gallons): ");
    String c = in.readLine();
    int capacity = Integer.parseInt(c);
        
    System.out.print("Gauge reading(percent): ");
    String g = in.readLine();
    int gauge = Integer.parseInt(g);
        
    System.out.print("Miles per gallon: ");
    String m = in.readLine();
    int miles = Integer.parseInt(m);
    
    int tank = ((capacity*gauge)/100);
    int travel = (tank*miles);
    
    System.out.print("The car can cross " + travel + " miles\n");
    if(travel>=200){
        System.out.println("Safe to proceed!");}
    else {
        System.out.println("Get Gas!");}
    }
}