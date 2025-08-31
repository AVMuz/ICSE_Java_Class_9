
/**
 * Write a program to display first 10 terms of the series 0, 7, 26 ...
 * 
 * (Pattern: n^3-1)
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1f
{
    public static void main(String[] args)
    {
        System.out.println("First 10 terms of the series 0, 7, 26...:");

        for (int n = 1; n <= 10; n++)
        {
            int term = (n * n * n) - 1;  // n^3 - 1
            System.out.print(term);

            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
