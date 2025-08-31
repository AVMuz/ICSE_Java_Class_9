
/**
 * Write a program to print the following patter using loop.
 *  
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3 
 * 5 4 
 * 5
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P281_3b
{
    public static void main(String[] args)
    {
        int rows = 5; // Number of rows in the pattern
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++)
        {
            // Inner loop for numbers in each row
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
