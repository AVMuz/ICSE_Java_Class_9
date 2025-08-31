/* Write a program to check whether the integer given is a prime number or not. */

import java.util.Scanner;

public class PrimeNumCheck
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPrime(num))
		{
            System.out.println(num + " is a prime number.");
        } 
		else
		{
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int n)
	{
        if (n <= 1)
		{
            return false; // 0 and 1 are not prime numbers
        }
        if (n == 2)
		{
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0)
		{
            return false; // Even numbers greater than 2 are not prime
        }
        
        // Check for divisors up to the square root of the number
        for (int i = 3; i <= Math.sqrt(n); i += 2)
		{
            if (n % i == 0)
			{
                return false;
            }
        }
        return true;
    }
}