
/**
 * Write a program in Java to find and dispay the sum of the following:
 * (ax2)+ (ax3) + (ax4) + ... ... ... + (ax20)
 * 
 * General term : (axn) where n ranges from 2 to 20 (both inclusive).
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10c
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input the value of 'a'
        System.out.print("\nEnter the value of a: ");
        double a = sc.nextDouble();
        
        double sum = 0;
        
        // Calculate the sum of the series
        for (int n = 2; n <= 20; n++)
        {
            
            sum += (a*n);
        }
        
        // Display the result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}