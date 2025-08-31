
/**
 * Write a program to calculate and display the factorials of all the numbers
 * between m and n where m<n, m>0 and n>0.
 *
 * @author ANOOP VERMA
 * @verison 1.0 (Program works up to 20)
 */

import java.util.Scanner;

public class P281_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input validation loop
        int m, n;
        do {
            System.out.print("Enter the first positive integer (m): ");
            m = sc.nextInt();
            System.out.print("Enter the second positive integer (n, n>m): ");
            n = sc.nextInt();
            
            if (m <= 0 || n <= 0 || m >= n)
            {
                System.out.println("Invalid input...");
            }
        } while (m <= 0 || n <= 0 || m >= n);
        
        System.out.println("\nFactorials of numbers between " + m + " and " + n + ":");
        
        // Calculate and display factorials for each number in the range
        for (int i = m; i <= n; i++)
        {
            long fact = calcFact(i);
            System.out.println(i + "! = " + fact);
        }
        
        sc.close();
    }
    
    // Method to calculate factorial of a number
    private static long calcFact(int num)
    {
        long res = 1;
        for (int i = 1; i <= num; i++)
        {
            res *= i;
        }
        return res;
    }
}
