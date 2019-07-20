/*Exercise 3 --- Average Rain Fall

Write a program that averages the rain fall for three months, April, May, and June. 
Declare and initialize a variable to the rain fall for each month. 
Compute the average, and write out the results, something like: 

Rainfall for April:  12 
Rainfall for May  :  14 
Rainfall for June:   8 
Average rainfall:    11.333333

To get the numerical values to line up use the tabulation character '\t' as part 
of the character string in the output statements. Check that your program prints 
the correct results.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise103 {

public static void main(String[] args) {
    int x = 12;
    int y = 14;
    int z = 8; 
    float average = (float) (x + y + z) / 3;
    System.out.println("Rainfall for April:\t" + x);
    System.out.println("Rainfall for May:\t" + y);
    System.out.println("Rainfall for June:\t" + z);
    System.out.println("Average rainfall:\t" + average );
    }
}