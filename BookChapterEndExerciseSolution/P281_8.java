
/**
 * Write a program to input a number and display all its prime factors.
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P281_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        
        int num = sc.nextInt();
            
        if (num <= 0)
        {
            System.out.println("Please enter a positive integer.");
            
        }
        else if (num == 1)
        {
            System.out.println("1 has no prime factors.");
        }
        else
        {
            System.out.print("Prime factors of " + num + ": ");
            printFactors(num);
        }
        
        sc.close();
    }

    public static void printFactors(int n)
    {
        // Handle 2 separately
        while (n % 2 == 0)
        {
            System.out.print("2 ");
            n /= 2;
        }
        
        // Check for odd divisors from 3 upwards
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            while (n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If remaining n is a prime > 2
        if (n > 1)
        {
            System.out.print(n);
        }
    }
}
