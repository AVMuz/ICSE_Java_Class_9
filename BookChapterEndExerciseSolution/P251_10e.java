
/**
 * Write a program in Java to find and display the sum of the following:
 * 1 + (2^2)/a + (3^3)/a + ... ... ... n terms
 * 
 * General term : (a^n) where n ranges from 1 to n (both inclusive).
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10e
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input values
        System.out.print("\nEnter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        
        double sum = 0;
        
        // Calculate sum of series
        for (int i = 1; i <= n; i++)
        {
            if (i == 1)
            {
                sum += 1;  // First term is 1
            }
            else
            {
                sum += (i * i) / a;  // Subsequent terms are (i^2)/a
            }
        }
        
        // Display result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}
