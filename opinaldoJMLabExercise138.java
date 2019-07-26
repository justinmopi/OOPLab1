/*Exercise 38 --- Miles per Gallon

Write a program that calculates miles per gallon for a list of cars. The data for 
each car consists of initial odometer reading, final odometer reading, and number 
of gallons of gas. The user signals that there are no more cars by entering a 
negative initial odometer reading. 

Miles Per Gallon Program 
Initial miles: 
15000 
Final miles: 
15250 
Gallons 
10 
Miles per Gallon: 
25.0

Initial miles: 
107000 
Final miles: 
107450 
Gallons 
15 
Miles per Gallon: 
30.0

Initial miles: 
-1 
bye*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise138 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Initial miles: ");
    String im = in.readLine();
    int initial = Integer.parseInt(im);
        if(initial >= 0){
            System.out.print("Final miles: ");
            String fm = in.readLine();
            int finalm = Integer.parseInt(fm);
    
            System.out.print("Gallons: ");
            String g = in.readLine();
            int gal = Integer.parseInt(g);
    
            float mpg = Math.abs(initial-finalm)/gal;
            System.out.println("Miles per gallon: " + mpg);}
        
        else{
            System.out.println("bye");}
    }
}