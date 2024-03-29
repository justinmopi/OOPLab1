/*Exercise 43 --- Drug Potency

A certain drug looses 4% of its effectivness every month it is in storage. When 
its effectiveness is below 50% it is considered expired and must be discarded. 
Write a program that determines how many months the drug can remain in storage.

month: 0        effectiveness: 100.0 
month: 1        effectiveness: 96.0 
month: 2        effectiveness: 92.16 
month: 3        effectiveness: 88.47359999999999 
month: 4        effectiveness: 84.93465599999999 
month: 5        effectiveness: 81.53726975999999 
month: 6        effectiveness: 78.27577896959998 
month: 7        effectiveness: 75.14474781081599 
month: 8        effectiveness: 72.13895789838334 
month: 9        effectiveness: 69.253399582448 
month: 10       effectiveness: 66.48326359915008 
month: 11       effectiveness: 63.82393305518407 
month: 12       effectiveness: 61.27097573297671 
month: 13       effectiveness: 58.82013670365764 
month: 14       effectiveness: 56.46733123551133 
month: 15       effectiveness: 54.20863798609088
month: 16       effectiveness: 52.04029246664724 
month: 17       effectiveness: 49.95868076798135 DISCARDED*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
public class opinaldoJMLabExercise143 {
   
public static void main(String[] args) {

    double eff = 100.00;
    int i = 0;
    
    System.out.println("Month: " + (i++) + "\tEffectiveness: " + eff);
    while(eff >= 50.00){
        eff *= 0.96;
        System.out.println("Month: " + (i++) + "\tEffectiveness: " + eff);
        if(eff < 50.00){
            System.out.println("\tDISCARDED");}}
    }
}