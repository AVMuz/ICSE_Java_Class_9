
/**
 * Write a program to display the ten terms of the series 3,6,9,12...
 *
 * @author ANOOP VERMA
 * @version 1.0
 */


public class P249_1c
{
    public static void main(String[] args)
    {
        System.out.println("First ten terms of the series 3, 6, 9, 12...:");

        for (int n = 1; n <= 10; n++)
        {
            int term = 3 * n;  // Calculate each term, 3 times the term
            System.out.print(term);

            // Add a comma and space if not the last term
            if (n < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
