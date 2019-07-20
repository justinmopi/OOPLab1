/*Exercise 17 --- Pie Eating Contest

At the State Fair Pie Eating Contest all contestants in the heavyweight division 
must weigh within 30 pounds of 250 pounds. Write a program that asks for a contestant's 
weight and then says if the contestant is allowed in the contest.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise117 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input weight: ");
    String x = in.readLine();
    double y = Double.parseDouble(x);
        if (y>=30 && y<=250){
            System.out.println("YOU ARE ALLOWED");}
        else {
            System.out.println("YOU ARE NOT ALLOWED");}
    }
}