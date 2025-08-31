
/**
 * Write a program to input the year. The program checks and displays whether
 * it is (a) a Leap year (b) a Century Leap year (c) a Century year but not a
 * Leap year.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year (4-digits): ");
        int year = sc.nextInt();

        // Check if it's a century year (divisible by 100)
        boolean isCentury = (year % 100 == 0);

        // Check leap year conditions
        boolean isLeap;     // Default value is 'false'
        if (isCentury)
        {
            // Century leap year must be divisible by 400
            isLeap = (year % 400 == 0);
        }
        else
        {
            // Non-century leap year must be divisible by 4
            isLeap = (year % 4 == 0);
        }

        // Display the result
        if (isCentury)
        {
            if (isLeap)
            {
                System.out.println(year + " is a Century Leap Year.");
            }
            else
            {
                System.out.println(year + " is a Century Year but not a Leap Year.");
            }
        } 
        else
        {
            if (isLeap)
            {
                System.out.println(year + " is a Leap Year.");
            }
            else
            {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}
