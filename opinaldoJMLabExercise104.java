/*Exercise 4 --- Trigonometry

To compute the sine of a double precision value use this method:

Math.sin( value )

The value is in radians (not degrees.) The cosine is computed using 

Math.cos( value )

Again, value is in radians. Write a program that: 
1. Computes the sine of 0.5236 radians and saves it in a variable. 
2. Computes the cosine of 0.5236 radians and saves it in another variable. 
3. Computes the square of each those two values (use the variables), adds the 
two squares, and saves the result (in a third variable.) 4. Writes out the three variables. 

The output statement should be something like: 

System.out.println("sine: " + sinx + " cosine: " + cosx + " sum: " + sum );

Try a few other values besides 0.5236.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise104 {

public static void main(String[] args) {
    double value = 3.141592654;
    double sinx = Math.sin(value);
    double cosx = Math.cos(value); 
    double sum = (sinx*sinx + cosx*cosx);
    System.out.println("Sine: " + sinx);
    System.out.println("Cosine: " + cosx);
    System.out.println("Sine^2 + Cosine^2: " + sum);
    }
}