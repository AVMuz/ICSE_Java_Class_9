
/**
 * Write a Java program to display the mathematical tables from 5 to 10 for 10
 * iterations in the given format:
 * Table of 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P281_1
{
    public static void main(String[] args)
    {
        // Loop through tables from 5 to 10
        for (int table = 5; table <= 10; table++)
        {
            System.out.println("Table of " + table + ":");
            
            // Print multiplication for 1 to 10
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            
            // Add a blank line between tables for better readability
            System.out.println();
        }
    }
}
