
/**
 * Using switch-case statement, write a menu driven program to
 * (a) find and display all the factors of a number input by user (ncluding 1 
 *     and excluding the number itself. 
 * (b) find and display the factorial of a number input by user (the factorial
 *     of a non-negative integer n, denoted by n!, is the product of all 
 *     integers less than or equal to n.)
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P253_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Find factors of a number (excluding itself)");
            System.out.println("2. Calculate factorial of a number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    factors(sc);
                    break;
                    
                case 2:
                    factorial(sc);
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice...");
            }
        } while (ch != 3);
        
        sc.close();
    }
    
    // Option 1: Find factors of a number (excluding the number itself)
    public static void factors(Scanner scanner)
    {
        System.out.print("Enter a number to find its factors: ");
        int num = scanner.nextInt();
        
        if (num <= 1)
        {
            System.out.println("Number must be greater than 1.");
            return;
        }
        
        System.out.print("Factors of " + num + " (excluding itself): 1");
        for (int i = 2; i <= num/2; i++)
        {
            if (num % i == 0)
            {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
    
    // Option 2: Calculate factorial of a non-negative integer
    public static void factorial(Scanner scanner)
    {
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        if (num < 0)
        {
            System.out.println("Enter a non-negative integer.");
            return;
        }
        
        long fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        
        System.out.println(num + "! = " + fact);
    }
}
