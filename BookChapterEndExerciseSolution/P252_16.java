
/**
 * Write a program to input a number and check whether it is a twisted prime 
 * or not.
 * A number is said to be a twisted prime, if the number as well as its 
 * reverse is also a prime and display an appropriate message accordingly.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P252_16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isTwistedPrime(num))
        {
            System.out.println(num + " is a twisted prime.");
        }
        else
        {
            System.out.println(num + " is not a twisted prime.");
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    // Method to reverse a number
    public static int reverseNumber(int n)
    {
        int reversed = 0;
        while (n != 0)
        {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    
    // Method to check if a number is a twisted prime
    public static boolean isTwistedPrime(int n)
    {
        // Check if the number itself is prime
        if (!isPrime(n))
        {
            return false;
        }
        
        // Reverse the number
        int reversedNum = reverseNumber(n);
        
        // Check if the reversed number is prime (and not a palindrome)
        return isPrime(reversedNum) && (n != reversedNum);
    }
}
