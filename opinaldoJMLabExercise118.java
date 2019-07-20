/*Exercise 18 --- Ground Beef Value Calculator

Different packages of ground beef have different percentages of fat and different 
costs per pound. Write a program that asks the user for:

1. The price per pound of package "A" 
2. The percent lean in package "A" 
3. The price per pound of package "B" 
4. The percent lean in package "B"

The program then calculates the cost per pound of lean (non-fat) beef for each package 
and writes out which is the best value. 

Price per pound package A: 2.89 
Percent lean package A: 85 
Price per pound package B: 3.49 
Percent lean package B: 93

Package A cost per pound of lean:3.4 
Package B cost per pound of lean:3.752688 
Package A is the best value 
Assume that the two packages will not come out equal in value.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise118 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Price per pound package A: ");
    String pa = in.readLine();
    double priceA = Double.parseDouble(pa);
    
    System.out.println("Percent lean package A: ");
    String la = in.readLine();
    double leanA = Double.parseDouble(la);
    
    System.out.println("Price per pound package B: ");
    String pb = in.readLine();
    double priceB = Double.parseDouble(pb);
    
    System.out.println("Percent lean package B: ");
    String lb = in.readLine();
    double leanB = Double.parseDouble(lb);
    
    double costA =  priceA / leanA * 100;
    double costB =  priceB / leanB * 100;
    
    System.out.println("Package A cost per pound of lean: " + costA);
    System.out.println("Package B cost per pound of lean: " + costB);
    if(costA < costB){
        System.out.println("Package A is the best value");}
    else {
        System.out.println("Package B is the best value");}
    }
}