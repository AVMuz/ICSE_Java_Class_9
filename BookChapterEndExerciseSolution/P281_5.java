
/**
 * Write a menu driven program to display all the prime and non-prime numbers
 * from 1 to 100.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P281_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do
        {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Display all prime numbers (1-100)");
            System.out.println("2. Display all non-prime numbers (1-100)");
            System.out.println("3. Display both prime and non-prime numbers");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    displayPrimes(true);
                    break;
                case 2:
                    displayPrimes(false);
                    break;
                case 3:
                    System.out.println("\nPrime numbers (1-100):");
                    displayPrimes(true);
                    System.out.println("\nNon-prime numbers (1-100):");
                    displayPrimes(false);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while(ch != 4);
        
        sc.close();
    }
    
    // Method to check if a number is prime
    private static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;    
        }
        if (num == 2)
        {
            return true;
        }
        if (num % 2 == 0)
        {
            return false;
        }
        
        for (int i = 3; i * i <= num; i += 2)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    // Method to display numbers based on prime status
    private static void displayPrimes(boolean showPrime)
    {
        int ctr = 0;
        for (int i = 1; i <= 100; i++)
        {
            if (isPrime(i) == showPrime)
            {
                System.out.print(i + " ");
                ctr++;
                // Format output with 10 numbers per line
                if (ctr % 10 == 0)
                {
                    System.out.println();    
                }
            }
        }
        System.out.println("\nTotal: " + ctr + " numbers");
    }
}
