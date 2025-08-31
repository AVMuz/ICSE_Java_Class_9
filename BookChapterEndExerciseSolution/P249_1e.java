
/**
 * Write a program to display the first ten terms of the 
 * series 1.5,3.0,4.5,6.0 ...
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P249_1e
{
    public static void main(String[] args)
    {
        System.out.println("First ten terms of the series 1.5, 3.0, 4.5, 6.0...:");
        
        for (int n = 1; n <= 10; n++)
        {
            double term = 1.5 * n;
            System.out.print(term);
            
            // Format output with commas between terms
            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
