
/**
 * Write a program to display first ten terms of the series 24,99,225,399....
 *
 * Pattern: (5n)^2 - (n%2) 
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1j_complex
{
    public static void main(String[] args)
    {
        System.out.println("First 10 terms of the series 24, 99, 225, 399...:");

        for (int n = 1; n <= 10; n++)
        {
            int term = (5 * n) * (5 * n) - (n % 2);  // (5n)^2 - (n%2)
            System.out.print(term);

            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
