
/**
 * Write a program to calculate and display the sum of series:
 * (1x2) + (2x3) + (3x4) +... ... + (19x20).
 * 
 * Gereral term: nx(n+1), where n ranges from 1 to 19.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */


public class P250_7f
{
    public static void main(String[] args)
    {
        int sum = 0; // sum of integers is a integer
        
        for (int n = 1; n <= 19; n++)
        {
            sum += n * (n + 1);
        }
        
        System.out.println("Sum of the series: " + sum);
    }
}
