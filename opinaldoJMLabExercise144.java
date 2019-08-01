/*Exercise 44 --- e^x

One of the more amazing facts from calculus is that the following sum gets closer 
and closer to the value ex the more terms you add in:

e^x = 1 + x + (x^2)/2! + (x^3)/3! + (x^4)/4! + (x^5)/5! + (x^6)/6! + . . . . 

Remember that n! means n factorial, n*(n-1)*(n-2)* ... *1. For example, if x is 
2 then 

e^2 = 1 + 2 + (2^2)/2! + (2^3)/3! + (2^)4/4! + (2^5)/5! . . . . 
e^2 = 1 + 2 + 4/2 + 8/6 + 16/24 + 32/120 + . . . .

e^2 = 1 + 2 + 2 + 1.3333 + 0.6666 + 0.2666 + . . . . 
e^2 ~ 7.266

More exactly, e^2 = 7.38907... 

Write a program that asks the user to enter x, then calculates e^x using a loop 
to add up successive terms until the current term is less than 1.0E-12. Then write 
out the value Math.exp(x) to see how your value compares.

To do this program sensibly, the loop will add in a term each iteration. 

sum = sum + term; 

Look carefully at the first equation for e^x. Notice that each term is:

(x^N)/N! 

for some N. This is the same as:

[x^(N-1)]/[(N-1)!]   *   x/N 

This is the same as the previous term times x/N. So each iteration of the loop 
merely has to multiply the previous term by x/N and add it to the accumulating sum.

Don't let the math scare you away! This is actually a fairly easy program, and 
is typical of a type of calculation that computers are often used for.

Enter x: 
2 
n:1     term: 2.0               sum: 3.0 
n:2     term: 2.0               sum: 5.0 
n:3     term: 1.3333333333333333                sum: 6.333333333333333 
n:4     term: 0.6666666666666666                sum: 7.0 
n:5     term: 0.26666666666666666               sum: 7.266666666666667
n:6     term: 0.08888888888888889               sum: 7.355555555555555 
n:7     term: 0.025396825396825397              sum: 7.3809523809523805 
n:8     term: 0.006349206349206349              sum: 7.387301587301587 
n:9     term: 0.0014109347442680777             sum: 7.3887125220458545 
n:10    term: 2.8218694885361555E-4             sum: 7.388994708994708 
n:11    term: 5.130671797338464E-5              sum: 7.389046015712681 
n:12    term: 8.551119662230774E-6              sum: 7.3890545668323435
n:13    term: 1.3155568711124268E-6             sum: 7.389055882389215 
n:14    term: 1.8793669587320383E-7             sum: 7.3890560703259105 
n:15    term: 2.5058226116427178E-8             sum: 7.389056095384136 
n:16    term: 3.1322782645533972E-9             sum: 7.389056098516415 
n:17    term: 3.6850332524157613E-10            sum: 7.389056098884918 
n:18    term: 4.094481391573068E-11             sum: 7.389056098925863 
n:19    term: 4.309980412182177E-12             sum: 7.3890560989301735 
n:20    term: 4.309980412182177E-13             sum: 7.389056098930604
my e^x: 7.389056098930604
real e^x: 7.38905609893065*/

package opinaldoJMLabExercise1;

/**
 *
 * @author Justin Martin Opinaldo
 */
import java.io.*;
public class opinaldoJMLabExercise144 {
    
public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter x: ");
    String X = in.readLine();
    int x = Integer.parseInt(X);
    int n = 1;
    
    double term, e = 1E-12, sum = 1, x1 = x, f = 1;
    while (true){
        term = x1 / f;
        sum += term;
        System.out.println("n:" + n + " \tterm: " + term + "\tsum: " + sum);
        n++;
        x1 *= x;
        f *= n;
            if(term < e){
                break;}}
    
    System.out.println("My e^x: " + sum);
    System.out.println("Real e^x: " + Math.exp(x));
    }
}