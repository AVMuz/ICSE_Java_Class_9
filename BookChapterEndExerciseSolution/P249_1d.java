
/**
 * Write a program to display first ten terms of the series 4,8,16,32...
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P249_1d
{
    public static void main(String[] args)
    {
        System.out.println("First ten terms of the series 4, 8, 16, 32...:");

        int term = 4;  // First term
        for (int n = 1; n <= 10; n++)
        {
            System.out.print(term);
            if (n < 10)
            {
                System.out.print(", ");
            }
            term *= 2;  // Next term is twice the previous term
        }
    }
}
