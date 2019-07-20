/*Exercise 21 --- Steam Engine Efficiency

The maximum possible efficiency of a steam engine depends on the temperature of the 
steam in the boiler and the temperature of the outside air: 

efficiency = 1 - Tair / Tsteam

where Tair is the air temperature and Tsteam is the steam temperature. The temperatures 
are give in degrees above absolute zero. Normal air temperature is about 300oK. Boiling 
is 373oK. Write a program that asks the user for the air temperature and the steam 
temperature and writes out the maximum possible efficiency of a steam engine. However, 
if the steam temperature is less than 373oK there is no steam, so the efficiency is zero.

Use integer or floating point input, but do the calculations in floating point.*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise121 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Air temperature:");
    String x = in.readLine();
    int Tair = Integer.parseInt(x);
       
    System.out.print("Steam temperature:");
    String y = in.readLine();
    int Tsteam = Integer.parseInt(y);
    
    float efficiency = (1 - Tair/Tsteam);
    if (Tsteam < 373){
        System.out.println("Efficiency is zero");}
    else {
        System.out.println("Efficiency is " + efficiency);}
    }
}