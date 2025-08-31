
/**
 * Write a program in Java to find and display the sum of the following:
 * (1^2)/a + (3^2)/(a^2) + (5^2)/(a^3) + ... ... ... n terms
 * 
 * General term : ((2n-1)^2)/a^n) where n ranges from 1 to n (both inclusive).
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10f
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input values
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        
        double sum = 0;
                        
        // Calculate sum of series
        for (int i = 1; i <= n; i++)
        {
            double temp = (2*i)-1;
            double numerator = Math.pow(temp,2);
            double denominator = Math.pow(a,i);
            sum += numerator/denominator;
        }
        
        // Display result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}
