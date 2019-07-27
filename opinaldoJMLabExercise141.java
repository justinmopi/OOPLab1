/*Exercise 41 --- Area of Rectangles

A computer aided design program expects users to enter the coordinates two corners 
for each of several of rectangles. The sides of the rectangles are 
assumed to be parallel to the X and Y axes. The coordinates of each corner is entered 
as a pair of integers, first the X coordinate and then the Y coordinate. The origin 
of the coordinate system (0,0) is in the upper left, so Y increases going downward, 
and X increases to the right.

For each rectangle, the program calculates and writes out the height, the width, 
and the area of the rectangle. The two corners entered for each rectangle must be 
diagonally opposite (upper left and lower right, or upper right and lower left), 
but which choice is made for each rectangle is up to the user. The user can enter 
the corners in any order. Height and width are always positive (the program will 
have to adjust its calculations so that this is true.)

The program ends gracefully when the user enters corners which cannot be those of 
a rectangle (either the height is zero, the width is zero, or both.)

Computer Aided Design Program 
First corner X coordinate: 
100 
First corner Y coordinate: 
100 
Second corner X coordinate: 
250 
Second corner Y coordinate 
200 
Width:  150  Height: 100   Area: 15000

First corner X coordinate: 
250 
First corner Y coordinate: 
200 
Second corner X coordinate: 
100 
Second corner Y coordinate 
100 
Width:  150  Height: 100   Area: 15000*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise141 {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Computer Aided Design Program");
    System.out.print("First corner X coordinate: ");
    String x = in.readLine();
    float x1 = Float.parseFloat(x);
    
    System.out.print("First corner Y coordinate: ");
    String y = in.readLine();
    float y1 = Float.parseFloat(y);
    
    System.out.print("Second corner X coordinate: ");
    String xx = in.readLine();
    float x2 = Float.parseFloat(xx);
    
    System.out.print("Second corner Y coordinate: ");
    String yy = in.readLine();
    float y2 = Float.parseFloat(yy);
    
    float width = Math.abs(x1 - x2);
    float height = Math.abs(y1 - y2);
    float area = width*height;
        if(width == 0 || height == 0){
            System.out.println("Cannot be a rectangle");
            System.exit(0);}
        else{
            System.out.println("Width: " + width + " Height: " + height + " Area: " + area);}
    }
}