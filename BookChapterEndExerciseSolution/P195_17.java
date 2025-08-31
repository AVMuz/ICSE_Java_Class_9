
/**
 * Write a program to input sum, rate, time and type of Interest ('S' for 
 * Simple Interest and 'C' for Compound Interest). Calculate and display the 
 * sum and interest earned. Use switch case statement.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;
import java.lang.Math;

public class P195_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input basic details
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = sc.nextDouble();
        
        // Input interest type
        System.out.print("Enter type of interest (S for Simple, C for Compound): ");
        char interestType = sc.next().charAt(0);
        
        double interest = 0;
        double amount = 0;
        
        switch(Character.toUpperCase(interestType))
        {
            case 'S':
                // Simple Interest calculation
                interest = (principal * rate * time) / 100;
                amount = principal + interest;
                System.out.println("\n--- Simple Interest Calculation ---");
                break;
                
            case 'C':
                // Compound Interest calculation
                amount = principal * Math.pow(1 + (rate / 100), time);
                interest = amount - principal;
                System.out.println("\n--- Compound Interest Calculation ---");
                break;
                
            default:
                System.out.println("Invalid interest type! Please enter 'S' or 'C'.");
                sc.close();
                return;
        }
        
        // Display results
        System.out.printf("Principal Amount: Rs. %.2f%n", principal);
        System.out.printf("Interest Rate: %.2f%%%n", rate);
        System.out.printf("Time Period: %.2f years%n", time);
        System.out.printf("Interest Earned: Rs. %.2f%n", interest);
        System.out.printf("Total Amount: Rs. %.2f%n", amount);
        
        sc.close();
    }
}
