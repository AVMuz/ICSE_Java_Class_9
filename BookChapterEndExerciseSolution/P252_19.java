
/**
 * Write a menu driven program to accept a number from the user. Check and 
 * display whether it is a Prime number or an Automorphic number.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P252_19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, num;
        
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Check Prime Number");
            System.out.println("2. Check Automorphic Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    System.out.print("Enter a number to check for prime: ");
                    num = sc.nextInt();
                    if (isPrime(num))
                    {
                        System.out.println(num + " is a prime number.");
                    } 
                    else
                    {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter a number to check for automorphic: ");
                    num = sc.nextInt();
                    if (isAutomorphic(num))
                    {
                        System.out.println(num + " is an automorphic number.");
                    } 
                    else
                    {
                        System.out.println(num + " is not an automorphic number.");
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 3);
        
        sc.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        if (n == 2)
        {
            return true;
        }
        if (n % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int n)
    {
        int sq = n * n;
        int temp = n;
        int ctr = 0;
        
        // Count number of digits
        while (temp != 0)
        {
            temp /= 10;
            ctr++;
        }
        
        // Extract last 'count' digits from square
        int last2 = sq % (int)Math.pow(10, ctr);
        
        return last2 == n;
    }
}
