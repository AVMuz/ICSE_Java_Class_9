
/**
 * Write a Java program to input 10 numbers (including positive and negative). 
 * Perform the following tasks:
 * (a) Count and display the positive numbers
 * (b) Count and display the negative numbers.
 *
 * @author ANOOP VERMA
 * @version 2.0, Storing original data in array
 */

import java.util.Scanner;

public class P250_2ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];    // Array to store the numbers
        int pCount = 0;
        int nCount = 0;
        
        System.out.println("Enter 10 numbers (positive or negative):");
        
        // Input 10 numbers
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            
            // Check if number is positive or negative
            if (numbers[i] > 0)
            {
                pCount++;
            } 
            else if (numbers[i] < 0)
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
