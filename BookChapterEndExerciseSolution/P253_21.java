
/**
 * Using a switch statement, write a menu driven program to
 * (a) Generate and display the first 10 ten terms of the Fibonacci series
 * (b) Find and display the sum of the digits of an integer that is input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P253_21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Display first 10 Fibonacci numbers");
            System.out.println("2. Calculate sum of digits of a number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    fibNumbers();
                    break;
                    
                case 2:
                    digitSum(sc);
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
    
    // Option 1: Display first 10 Fibonacci numbers
    public static void fibNumbers()
    {
        System.out.println("First 10 Fibonacci numbers:");
        int a = 0, b = 1;
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
    
    // Option 2: Calculate sum of digits of a number
    public static void digitSum(Scanner scanner)
    {
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int num = n;
        int sum = 0;
        
        while (n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
