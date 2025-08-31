
/**
 * Write a program to input three numbers and check whether they are equal or
 * not. If they are unequal numbers then display the greatest among them 
 * otherwise, display the message "All numbers are equal".
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Check if all three numbers are equal
        if (num1 == num2 && num2 == num3)
        {
            System.out.println("All numbers are equal.");
        }
        else
        {
            // Find the greatest number
            double max = num1;
            if (num2 > max)
            {
                max = num2;
            }
            if (num3 > max)
            {
                max = num3;
            }
            System.out.println("The greatest number is: " + max);
        }

        sc.close();
    }
}
