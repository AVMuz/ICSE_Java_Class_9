
/**
 * Write a program to calculate and display the sum of all odd numbers and even
 * numbers between a range of numbers from m to n (both inclusive) where m < n.
 * Input m and n (where m < n).
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P250_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input the range
        System.out.print("Enter the starting number (m): ");
        int m = sc.nextInt();
        
        System.out.print("Enter the ending number (n, which is > m): ");
        int n = sc.nextInt();
        
        // Validate input
        if (m >= n)
        {
            System.out.println("Error: Ending number must be greater than starting number.");
            return;
        }
        
        int evenSum = 0;
        int oddSum = 0;
        
        // Calculate sums
        for (int i = m; i <= n; i++)
        {
            if (i % 2 == 0) // Even number
            {
                evenSum += i;  // Add to even sum
            } 
            else
            {
                oddSum += i;   // Add to odd sum
            }
        }
        
        // Display results
        System.out.println("\nResults for range " + m + " to " + n + ":");
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        
        sc.close();
    }
}
