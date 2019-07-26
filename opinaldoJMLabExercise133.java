/*Exercise 33

Write a program that computes the standard deviation of a set of floating point 
numbers that the user enters. First the user will say how many numbers N are to 
follow. Then the program will ask for and read in each floating point number. 
Finally it will write out the standard deviation. The standard deviation of a 
set of numbers Xi is:

SD = Math.sqrt( avgSquare - avg^2 ) 
Here, avg is the average of the N numbers, and avg^2 is its square. 

avgSquare is the average of Xi * Xi. In other words, this is the average of the 
squared value of each floating point number.

For example, if N = 4, say the numbers were:

    Xi      Xi*Xi
    2.0     4.0
    3.0     9.0
    1.0     1.0
    2.0     4.0
sum 8.0     18.0
then 
avg = 8.0/4 = 2.0 
avg^2 = 4.0

avgSquare = 18.0/4 = 4.5

SD = Math.sqrt( 4.5 - 4.0 ) = Math.sqrt( .5 ) = 0.7071067812
To do this you will need to do several things inside the loop body for each 
floating point value as it comes in: add it to a sum, square it and add it to a 
sum of squares. Then after the loop is finished apply the formula.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise133 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter how many numbers: ");
    String x = in.readLine();
    int n = Integer.parseInt(x);
    
    float num = 0, sum = 0, sumsqr = 0, avg = 0, avgsqr = 0, avgsquare = 0, SD = 0;
    System.out.println("Enter numbers: ");
    for (int i = 0; i < n; i++){
        String y = in.readLine();
        num = Float.parseFloat(y);
        sum += num;
        sumsqr += num*num;}
    
    avg = sum/n;
    avgsqr = avg*avg;
    avgsquare = sumsqr/n;
    SD = (float) Math.sqrt(avgsquare - avgsqr);
    System.out.println("Standard deviation is " + SD);
    }
}