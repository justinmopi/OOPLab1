/*Exercise 23 --- Fantasy Game

In a new role-playing fantasy game players must design their character by picking 
a point value for each of three characteristics:

• Strength, from 1 to 10 
• Health, from 1 to 10 
• Luck, from 1 to 10

Write a program that asks for a name for the character and asks for the point value 
of for each of the three characteristics. However, the total points must be less 
than 15. If the total exceeds 15, then 5 points are assigned to each characteristic.

Welcome to Yertle's Quest 
Enter the name of your character: 
Chortle 
Enter strength (1-10): 8 
Enter health (1-10): 4 
Enter luck (1-10): 6

You have give your character too many points!  
Default values have been assigned: Chortle, strength: 5, health: 5, luck: 5*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise123 {

public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Welcome to Yertle's Quest\nEnter the name of your character:");
    String name = in.readLine();
    
    System.out.print("Enter strength(1-10): ");
    String s = in.readLine();
    int strength = Integer.parseInt(s);
    
    System.out.print("Enter health(1-10): ");
    String h = in.readLine();
    int health = Integer.parseInt(h);
    
    System.out.print("Enter luck(1-10): ");
    String l = in.readLine();
    int luck = Integer.parseInt(l);
    
    int total = strength + health + luck;
        if(total > 15){
            System.out.println("You have give your character too many points!\nDefault values have been assigned:" + name + ", strength: 5, health: 5, luck: 5");}
        else{
            System.out.println(name + "\nStrength: " + strength + "\nHealth: " + health + "\nLuck: " + luck);}
    }
}