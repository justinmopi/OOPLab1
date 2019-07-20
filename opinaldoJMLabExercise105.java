/*Exercise 5 --- Degrees to Radians

It is sometimes hard to think in terms of radians; we would rather use degrees. 
Remember (from those dark days of trigonometry class) that there are PI radians 
per 180 degrees. So to convert an angle given in degrees to radians do this: 

rad = degrees * Math.PI/180

Math.PI gives you an accurate value of PI. 

Edit the previous program so that it does the same things, but the angle is 30 
degrees (which you will convert into radians.)*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise105 {

public static void main(String[] args) {
    float deg = 30;
    float rad = (float) (deg*Math.PI/180);
    float sinx = (float) Math.sin(rad);
    float cosx = (float) Math.cos(rad);
    float sum = (sinx*sinx + cosx*cosx);
    System.out.println("Degrees: " + deg);
    System.out.println("Radians: " + rad);
    System.out.println("Sine: " + sinx);
    System.out.println("Cosine: " + cosx);
    System.out.println("Sine^2 + Cosine^2: " + sum);
    }
}