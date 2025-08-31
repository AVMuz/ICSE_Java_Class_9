
/**
 * Write a program to input a three-digit number. Display its digits raised to
 * the power of their respective positions.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P252_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        
        // Validate input is a 3-digit number
        if (num < 100 || num > 999)
        {
            System.out.println("Error: Enter a valid 3-digit number.");
            return;
        }
        
        // Extract digits
        int h = num / 100;        // Position 3
        int t = (num / 10) % 10;      // Position 2
        int u = num % 10;              // Position 1
        
        // Calculate powers
        int hPower = h * h * h;
        int tPower = t * t;
        int uPower = u * 1;
        
        // Display results
        System.out.println("\nDigit Power Calculations:");
        System.out.println(u + "^1 = " + uPower);
        System.out.println(t + "^2 = " + tPower);
        System.out.println(h + "^3 = " + hPower);
                
        sc.close();
    }
}
