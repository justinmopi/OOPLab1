/*Exercise 19 --- Y2K Problem Detector

Write a program that asks a user for their birth year encoded as two digits 
(like "62") and for the current year, also encoded as two digits (like "99"). 
The program is to correctly write out the users age in years. 

Year of Birth: 62 
Current year: 99 
Your age: 37*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise119 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Year of Birth: ");
    String x = in.readLine();
    int birth = Integer.parseInt(x);
        
    System.out.print("Current year: ");
    String a = in.readLine();
    int current = Integer.parseInt(a);
    
        if(current<birth){
            birth = 100-birth;
            int age = birth+current;
            System.out.println("Your age is: " + age);}
        else{
            System.out.println("Your age is: " + (current-birth));}
    }
}