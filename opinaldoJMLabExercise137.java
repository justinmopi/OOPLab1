/*Exercise 37 --- Pine Tree

Write a program that writes a tree made of stars on the terminal: 

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
        ***
        ***
        ***
 */

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise137 {

public static void main(String[] args){
    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 7 - i; j++){
            System.out.print(" ");}
        for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");}
                System.out.println();}
    for(int i = 0; i < 3; i++){
        System.out.println("     ***");}
    }
}