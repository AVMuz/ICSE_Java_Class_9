/**
 * Write a program to input Principal (P), Rate (r) and Time (t). Calculate and
 * display the amount for first five years which is compounded annually for 
 * each year by using the formula for Compound Interest (CI).
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_12CI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input principal amount, rate, and time
        System.out.print("Enter Principal amount (P): ");
        double p = sc.nextDouble();
        
        System.out.print("Enter Annual Interest Rate (r in %): ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Time (t in years): ");
        int t = sc.nextInt();
        
        // Calculate and display compound interest for each year
        System.out.println("\nYear\tInterest\tAmount");
        System.out.println("------------------------------");
        
        double amount = p;
        
        for (int year = 1; year <= t; year++)
        {
            double interest = (amount * r) / 100;
            amount += interest; // Compound the interest
            
            System.out.printf("%d\t%.2f\t\t%.2f%n", year, interest, amount);
        }
    }
}


