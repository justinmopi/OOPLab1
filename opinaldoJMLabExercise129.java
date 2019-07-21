/*Exercise 29

Write a program that asks the user to enter a word. The program will then repeat 
word for as many times as it has characters: 

Enter a word: 
Hello

Hello 
Hello 
Hello 
Hello 
Hello

To do this you will need to use the length() method that counts the number of 
characters in a string: 

String inputString;
int times;

. . . .

times = inputString.length()*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise129 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a word: ");
    String x = in.readLine();
    int times = x.length();
        for (int i = 0; i < times; i++){
            System.out.println(x);}
    }
}