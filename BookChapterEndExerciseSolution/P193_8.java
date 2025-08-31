
/**
 * Write a program to input three unequal numbers. Display the greatest and the smallest 
 * number.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P193_8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three unequal numbers:");
        
        // Input three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        // Check if all numbers are unequal
        if (num1 == num2 || num1 == num3 || num2 == num3)
        {
            System.out.println("Error: Please enter three unequal numbers.");
            return;
        }
        
        // Find the greatest number
        double greatest = num1;
        if (num2 > greatest)
        {
            greatest = num2;
        }
        if (num3 > greatest)
        {
            greatest = num3;
        }
        
        // Find the smallest number
        double smallest = num1;
        if (num2 < smallest)
        {
            smallest = num2;
        }
        if (num3 < smallest)
        {
            smallest = num3;
        }
        
        // Display the results
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + smallest);
        
        scanner.close();
    }
}
