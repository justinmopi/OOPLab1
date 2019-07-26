/*Exercise 36 --- Wedge of Stars

Write a program that writes a wedge of stars. The user enters the initial number
of stars, and the program writes out lines of stars. Each line has one few star 
than the previous line:

Initial number of stars: 
7

*******
******
*****
***
** 
*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise136 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Initial number of stars: ");
    String x = in.readLine();
    int num = Integer.parseInt(x);
    
    for(int i = num; i >= 1; i--){
        System.out.println();
        for(int j = 1;  j <= i; j++){
            System.out.print("*");}}
    System.out.println();
    }
}