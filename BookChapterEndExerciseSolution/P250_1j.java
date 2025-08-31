
/**
 * Write a program to display first ten terms of the series 24,99,224,399....
 *
 * Pattern: (5n)^2 - 1 
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1j
{
    public static void main(String[] args)
    {
        System.out.println("First 10 terms of the series 24, 99, 224, 399...:");

        for (int n = 1; n <= 10; n++)
        {
            int term = (5 * n) * (5 * n) - 1;  // (5n)^2 - 1
            System.out.print(term);

            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
