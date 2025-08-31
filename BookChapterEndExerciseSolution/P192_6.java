
/**
 * Write a program to input two unequal positive numbers and check whether 
 * they are perfect square numbers or not. If the user enters any negative 
 * number then the program displays the message "Square root of a negative 
 * cannot be determined".
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if numbers are equal
        if (num1 == num2)
        {
            System.out.println("Numbers are equal, they must be unequal.");
            return;
        }

        // Check for negative numbers
        if (num1 < 0 || num2 < 0)
        {
            System.out.println("Square root of a negative cannot be determined");
            return;
        }

        // Check if num1 is a perfect square
        int perSqr1 = 0;
        int sqrt1 = (int) Math.sqrt(num1);
        if (sqrt1 * sqrt1 == num1)
        {
           perSqr1 = 1; 
        }
        // Check if num2 is a perfect square
        int perSqr2 = 0;
        int sqrt2 = (int) Math.sqrt(num2);
        if (sqrt2 * sqrt2 == num2)
        {
           perSqr2 = 1; 
        }
        
        // Display results
        if (perSqr1==1 && perSqr2==1)
        {
            System.out.println(num1 + " & " + num2 + " both are perfect square"); 
        }
        if (perSqr1==1 && perSqr2==0)
        {
            System.out.println(num1 + " is perfect square, but " + num2 + " is not."); 
        }
        if (perSqr1==0 && perSqr2==1)
        {
            System.out.println(num1 + " is not perfect square, but " + num2 + " is.");
        }
        
        sc.close();
    }
}
    
    