
/**
 * Write a program to print the following patter using loop.
 * 
 *  *
 *  * #
 *  * # *
 *  * # * #
 *  * # * # *
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P281_3a
{
    public static void main(String[] args)
    {
        int rows = 5; // Number of rows in the pattern
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++)
        {
            // Inner loop for columns
            for (int j = 1; j <= i; j++)
            {
                // Alternate between '*' and '#'
                if (j % 2 == 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("# ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
