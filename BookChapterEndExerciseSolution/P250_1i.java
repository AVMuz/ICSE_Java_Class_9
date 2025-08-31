
/**
 * Write a program to display first 10 terms of series 0,3,8,15....
 *
 * Pattern: One less than the perfect square
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1i
{
    public static void main(String[] args)
    {
        System.out.println("First 10 terms of the series 0, 3, 8, 15...:");

        for (int n = 1; n <= 10; n++)
        {
            int term = n * n - 1;  // n^2 - 1
            System.out.print(term);

            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
