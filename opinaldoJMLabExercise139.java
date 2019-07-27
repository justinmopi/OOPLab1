/*Exercise 39 --- In-range Adder

Write a program that asks the user for the low and high integer in a range of 
integers. The program then asks the user for integers to be added up. The program 
computes two sums: 

• The sum of integers that are in the range (inclusive), 
• and the sum of integers that are outside of the range. 

The user signals the end of input with a 0.

In-range Adder 
Low end of range: 
20
High end of range: 
50 
Enter data: 
21 
Enter data: 
60 
Enter data: 
49 
Enter data: 
30 
Enter data: 
91
Enter data: 
0 
Sum of in range values: 100 
Sum of out of range values: 151*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise139 {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("In-range Adder");
    System.out.print("Low end of range: ");
    String l = in.readLine();
    int low = Integer.parseInt(l);
        
    System.out.print("High end of range: ");
    String h = in.readLine();
    int high = Integer.parseInt(h);
    
    int inRange = 0, notInRange = 0;
    while(true){
        System.out.print("Enter data: ");
        String d = in.readLine();
        int data = Integer.parseInt(d);
            if(data == 0){
                break;}
            if(data >= low && data <= high){
                inRange += data;}
            else{
                notInRange += data;}}
    
    System.out.println("Sum of in range values: " + inRange);
    System.out.println("Sum of out range values: " + notInRange);
    }
}