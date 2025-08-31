
/**
 * Write a program to input a number and display the factorial of its digit.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P281_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num<0)
        {
            System.out.println("Error: negative number not allowed.");
            return;
        }
        System.out.println("Factorial of each digit:");
                     
        // Process each digit
        while (num > 0)
        {
            int digit = num % 10;
            long fact = calcFact(digit);
            System.out.println(digit + "! = " + fact);
            num = num / 10;
        }
        
        sc.close();
    }
    
    // Method to calculate factorial of a single digit (0-9)
    private static long calcFact(int n)
    {
        if (n < 0 || n > 9) return -1; // Cannot be part of a digit
        
        long res = 1;
        for (int i = 2; i <= n; i++)
        {
            res *= i;
        }
        return res;
    }
}
