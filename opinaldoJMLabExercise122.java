/*Exercise 22 --- Microwave Oven

A microwave oven manufacturer recommends that when heating two items, add 50% to 
the heating time, and when heating three items double the heating time. Heating 
more than three items at once is not recommended.

Write a program that asks the user for the number of items and the single-item 
heating time. The program then writes out the recommended heating time.

Hint: do this with four successive single-branch if statements each of which tests 
for one of the four cases: 1 item, 2 items, 3 items, more than three items.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise122 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input the number of items: ");
    String n = in.readLine();
    int num = Integer.parseInt(n);
    
    if (num==0){
        System.out.println("ERROR");
        System.exit(0);}
    
    System.out.print("Input the heating time: ");
    String t = in.readLine();
    double time = Double.parseDouble(t);
    
    if (time==0){
        System.out.println("ERROR");
        System.exit(0);}
    
    switch (num){
        case 1:
            System.out.println("Recommended heating time: " + time);
            break;
        case 2:
            System.out.println("Recommended heating time: " + time*1.5);
            break;
        case 3:
            System.out.println("Recommended heating time: " + time*2);
            break;
        default:
            System.out.println("More than 3 items is not recommended");
        }
    }
}