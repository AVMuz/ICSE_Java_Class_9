
/**
 * A certain sum is invested at the rate of 10% per annum for 3 years. Write a
 * program to find and display the difference between Compound Interest (CI) 
 * and Simple Interest (SI). Take the sum as an input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the sum: ");
        int p = sc.nextInt();
        
        int r = 10; // rate is 10% per annum
        int t = 3;  // time is 3 years
        
        double si = (p * r * t)/100.0;
        
        double a = p * Math.pow((1 + (r/100.0)), t);
        double ci = a - p;
        
        double diff = ci - si;
        
        System.out.println("\nPrinciple amount: Rs. " + p);
        System.out.println("Rate % per annum: " + r);
        System.out.println("Time in years: " + t);
        System.out.printf("Simple Interest: Rs. %.2f%n", si);
        System.out.printf("Compound Interest: Rs. %.2f%n", ci);
        
        System.out.printf("Difference b/w CI & SI: Rs. %.2f%n", diff);
        
        sc.close();
    }
}