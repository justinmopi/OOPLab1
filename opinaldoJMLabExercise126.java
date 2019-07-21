/*Exercise 26 --- More Tire Pressure

Its not enough that the pressures are the same in the tires, but the pressures must 
also be within range. Modify the program in exercise 1 so that it also checks that 
each tire has a pressure between 35 and 45. If a tire is out of range, write out an 
error message immediately, but continue inputting values and processing them: 

Input right front pressure 
32 
Warning: pressure is out of range

Input left front pressure 
32 
Warning: pressure is out of range

Input right rear pressure 
42 

Input left rear pressure 
42

Inflation is BAD

If there have been any warnings, write out a final error message. (To do this, 
declare a boolean variable goodPressure that is initialized to true but is changed 
to false when an out of range tire is first found.)*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise126 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input right front pressure: ");
    String a = in.readLine();
    int rf = Integer.parseInt(a);
    boolean goodPressure = true;
        if(rf < 35 || rf > 45){
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;}
    
    System.out.print("Input left front pressure: ");
    String b = in.readLine();
    int lf = Integer.parseInt(b);
        if(lf < 35 || lf > 45){
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;}
    
    System.out.print("Input right rear pressure: ");
    String c = in.readLine();
    int rr = Integer.parseInt(c);
        if(rr < 35 || rr > 45){
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;}
    
    System.out.print("Input left rear pressure: ");
    String d = in.readLine();
    int lr = Integer.parseInt(d);
        if(lr < 35 || lr > 45){
            System.out.println("Warning: pressure is out of range");
            goodPressure = false;}
    
    if(goodPressure == false){
        System.out.println("Inflation is BAD.");}
    else{
        if(rf == lf && rr == lr){
            System.out.println("Inflation is OK.");}
        else{
            System.out.println("Inflation is NOT OK.");}}
    }
}