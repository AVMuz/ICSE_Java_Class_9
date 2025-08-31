
/**
 * Write a Java program to input 10 numbers (including positive and negative). 
 * Perform the following tasks:
 * (a) Count and display the positive numbers
 * (b) Count and display the negative numbers.
 *
 * @author ANOOP VERMA
 * @version 1.0, without storing the original data
 */

import java.util.Scanner;

public class P250_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pCount = 0;
        int nCount = 0;
        
        System.out.println("Enter 10 numbers (positive or negative):");
        
        // Input and count 10 numbers without storing them
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            
            // Check if number is positive or negative
            if (number > 0)
            {
                pCount++;
            } 
            else if (number < 0)
            {
                nCount++;
            }
            // Note: zero is neither positive nor negative
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("(a) Positive numbers count: " + pCount);
        System.out.println("(b) Negative numbers count: " + nCount);
        
        sc.close();
    }
}
