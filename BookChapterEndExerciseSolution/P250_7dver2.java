
/**
 * Write a program to calculate and disply the sum of series:
 * 1/2 + 2/3 + 3/4 + ... ... + 19/20
 *
 * General term: n/n+1, where n starts from 1 and goes upto 19.
 * 
 * @author ANOOP VERMA
 * @version 2.0, gives detailed output
 */

public class P250_7dver2
{
    public static void main(String[] args)
    {
        double sum = 0.0;

        System.out.println("Terms in the series:");
        for (int n = 1; n <= 19; n++)
        {
            double term = (double) n / (n + 1);
            sum += term;
            System.out.printf("%d/%d = %.4f%n", n, n + 1, term);
        }

        System.out.printf("%nThe sum of the series is: %.6f%n", sum);
    }
}
