
/**
 * The GCD (Greatest Common Divisor) of two integers is calculated by the 
 * continued division method. Divide the larger number by smaller, the 
 * remainder then divides the previous divisor. The process repeats unless the
 * remainder reaches zero. The last divisor results in GCD.
 * Write a program to accepts two numbers. Find and display their GCD by using
 * the technique discussed above. 
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Ensure a is always the larger number
        if (num2 > num1)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        while (num2 != 0)
        {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        // Display result
        System.out.println("GCD is: " + num1);
    }
}
