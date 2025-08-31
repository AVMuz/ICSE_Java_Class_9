
/**
 * Write a program in Java to find and dispay the sum of the following:
 * a^2 + a^2/2 + a^2/3 + ... ... ... + a^2/10
 * 
 * General term : a^2/n where n ranges from 1 to 10 (both inclusive).
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input the value of 'a'
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        
        double sum = 0;
        
        // Calculate the sum of the series
        for (int n = 1; n <= 10; n++)
        {
            double term = Math.pow(a,2) / n;
            sum += term;
        }
        
        // Display the result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}
