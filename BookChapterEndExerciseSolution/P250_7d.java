
/**
 * Write a program to calculate and disply the sum of series:
 * 1/2 + 2/3 + 3/4 + ... ... + 19/20
 *
 * General term: n/n+1, where n starts from 1 and goes upto 19.
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */


public class P250_7d
{
    public static void main(String[] args)
    {
        double sum = 0.0;

        // Calculate the sum of the series
        for (int n = 1; n <=19; n++)
        {
            double term = (double) n / (n + 1);
            sum += term;
        }

        // Display the result
        System.out.println("The sum of the series is: " + sum);
    }
}
