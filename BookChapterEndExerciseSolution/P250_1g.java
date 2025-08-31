
/**
 * Write a program to display first 10 terms of series 1,9,25,49...
 *
 * Pattern: Squares of odd number
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1g
{
    public static void main(String[] args)
    {
        System.out.println("First 10 terms of the series 1, 9, 25, 49...:");

        for (int i = 1; i <= 10; i++)
        {
            int oddNum = 2 * i - 1;  // Generates odd numbers: 1, 3, 5, 7, ...
            int term = oddNum * oddNum;  // Square of the odd number
            System.out.print(term);

            if (i < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
