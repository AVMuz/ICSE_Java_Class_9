
/**
 * Write a program to accept any 20 numbers and display only those numbers  
 * which are prime.
 *
 * @author ANOOP VERMA
 * @version 2.0, normal style without nested loop
 */

import java.util.Scanner;

public class P281_2ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        
        System.out.println("Enter 20 numbers:");
        
        // Accept 20 numbers from user
        for (int i = 0; i < 20; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        
        System.out.println("\nPrime numbers from the entered list:");
        
        // Check each number for prime and display if prime
        for (int x : num)   // x in mum
        {
            if (isPrime(x))
            {
                System.out.println(x);
            }
        }
        
        sc.close();
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int n)
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
        for (int i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
