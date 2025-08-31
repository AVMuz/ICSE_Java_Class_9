
/**
 * Write a program in Java to find and dispay the sum of the following:
 * a + a^2 + a^3 + ... ... ... + a^n
 * 
 * General term : (a^n) where n ranges from 1 to n (both inclusive).
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10d
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input the values of 'a' and 'n'
        System.out.print("\nEnter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        double sum = 0;
               
        // Calculate the sum of the series
        for (int i = 1; i <= n; i++)
        {
            sum += Math.pow(a, i);
        }
        
        // Display the result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}
