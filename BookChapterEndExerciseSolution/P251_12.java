
/**
 * Write a program to input Principal (P), Rate (r) and Time (t). Calculate and
 * display the amount for first five years which is compounded annually for 
 * each year by using the formula: Simple Interest (SI) = (P*r*t)/100.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input principal amount, rate, and time
        System.out.print("Enter Principal amount (P): ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Rate of interest (r): ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (t in years): ");
        int t = sc.nextInt();
        
        // Calculate and display simple interest for each year
        System.out.println("\nYear\tSimple Interest\tAmount");
        System.out.println("----------------------------------");
        
        for (int year = 1; year <= t; year++)
        {
            double si = (p* r * year) / 100;
            double amount = p + si;
            
            System.out.printf("%d\t%.2f\t\t%.2f%n", year, si, amount);
        }
    }
}
