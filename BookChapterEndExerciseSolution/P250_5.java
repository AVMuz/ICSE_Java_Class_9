
/**
 * Write a program to display all the numbers between m and n input from the 
 * keyboard (where m<n, m>0, n>0), check and display the numbers that are 
 * perfect square.
 * [A number is said to be perfect square if its square root is an integer.]
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P250_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input m and n (with validation)
        int m, n;
        do
        {
            System.out.print("Enter m (must be > 0): ");
            m = sc.nextInt();
            System.out.print("Enter n (must be > m and > 0): ");
            n = sc.nextInt();

            if (m <= 0 || n <= 0 || m >= n)
            {
                System.out.println("Invalid input! m > 0, n > 0, < n. Try again.");
            }
        } while (m <= 0 || n <= 0 || m >= n);

        System.out.println("\nNumbers between " + m + " and " + n + ":");
        
        // Check for perfect squares in the range [m, n]
        System.out.println("Perfect squares in this range:");
        for (int i = m; i <= n; i++)
        {
            if (isPerfectSquare(i))
            {
                System.out.println(i + " (since " + (int) Math.sqrt(i) + "^2 = " + i + ")");
            }
        }

        sc.close();
    }
    
    // Helper method to check if a number is a perfect square
    private static boolean isPerfectSquare(int num)
    {
        int sqroot = (int) Math.sqrt(num);
        return sqroot * sqroot == num;
    }
}
