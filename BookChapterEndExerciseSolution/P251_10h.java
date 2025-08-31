
/**
 * Write a program in Java to find and display the sum of the following:
 * x/2 + x/5 + x/8 + x/11 + ... ... ... x/20
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_10h
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input the value of x
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        
        double sum = 0;
        
        // Calculate the sum of the series
        for (int denom = 2; denom <= 20; denom += 3)
        {
            sum += x / denom;
        }
        
        // Display the result
        System.out.printf("Sum of the series: %.4f", sum);
    }
}
