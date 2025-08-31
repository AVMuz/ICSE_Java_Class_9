
/**
 * Write a program in Java to find and display the sum of the following:
 * 1/a + 1/(a^2) + 1/(a^3) + ... ... ... n terms
 * 
 * General term : 1/(a^n) where n ranges from 1 to n (both inclusive).
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10g
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input values
        System.out.print("\nEnter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        
        // Validate input
        if (a == 0)
        {
            System.out.println("Error: 'a' cannot be zero");
            return;
        }
        
        double sum = 0;
        //double denominator = a; // Starts with a^1
        
        // Calculate sum using iterative approach
        for (int i = 1; i <= n; i++)
        {
            double denominator = Math.pow(a, i);
            sum += 1 / denominator;
        }
        
        // Display result
        System.out.printf("Sum of the series: %.6f", sum);
    }
}
