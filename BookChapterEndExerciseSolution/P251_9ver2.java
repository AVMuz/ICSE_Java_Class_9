
/**
 * The GCD (Greatest Common Divisor) of two integers is calculated by the 
 * continued division method. Divide the larger number by smaller, the 
 * remainder then divides the previous divisor. The process repeats unless the
 * remainder reaches zero. The last divisor results in GCD.
 * Write a program to accepts two numbers. Find and display their GCD by using
 * the technique discussed above. 
 *
 * @author ANOOP VERMA
 * @version 2.0, using a separate function for GCD calculation
 */

import java.util.Scanner;

public class P251_9ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculate GCD using Euclidean algorithm
        int gcd = findGCD(num1, num2);
        
        // Display result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
    
    // Method to find GCD using Euclidean algorithm
    public static int findGCD(int a, int b)
    {
        // Ensure a is always the larger number
        if (b > a)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        
        // Continue division until remainder is 0
        while (b != 0)
        {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return a;
    }
}
