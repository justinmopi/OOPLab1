/*Exercise 27 --- The Pressure is Building

Tires don't have to have exactly the same pressure. Modify the program for exercise 
2 so that the front tires can be within 3 psi of each other, and the rear tires can 
be within 3 psi of each other.

Input right front pressure 
35 
Input left front pressure 
37

Input right rear pressure 
41 
Input left rear pressure 
44

Inflation is OK*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise127 {

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
        if(rf == lf && rr == lr || Math.abs(rf-lf)<=3 && Math.abs(rr-lr)<=3){
            System.out.println("Inflation is OK.");}
        else{
            System.out.println("Inflation is NOT OK.");}}
    }
}