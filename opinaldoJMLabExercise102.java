/*Exercise 2 --- Re-assigning values to Variables

Modify the program in exercise 2 so that one run of the program will evaluate and 
write out the value of the quadradic for three different values of X: 0.0, 2.0, 
and 4.0 (or any three values of your choice.) 

Write the program using only two variables, probably called x and value. Of course 
this means that you will have to put different things in these variables in 
different places in the program.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise102 {

public static void main(String[] args) {
    double x;
    double value;
    x = 0.0;
    value = 3 * x * x - 8 * x + 4;
    System.out.println("At X = " + x + " the value is: " + value);
    
    x = 2.0;
    value = 3 * x * x - 8 * x + 4;
    System.out.println("At X = " + x + " the value is: " + value);
    
    x = 4.0;
    value = 3 * x * x - 8 * x + 4;
    System.out.println("At X = " + x + " the value is: " + value);
    }
}