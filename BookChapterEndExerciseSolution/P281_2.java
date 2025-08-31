
/**
 * Write a program to accept any 20 numbers and display only those numebrs 
 * which are prime.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P281_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        
        System.out.println("Enter 20 numbers:");
        
        // Outer loop to accept 20 numbers
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        
        System.out.println("\nPrime numbers from the entered list:");
        
        // Outer loop to process each number
        for (int i = 0; i < 20; i++)
        {
            int curNum = num[i];
            boolean isPrime = true;
            
            // Special cases for numbers <= 1
            if (curNum <= 1)
            {
                isPrime = false;
            }
            // Inner loop to check for factors
            else
            {
                for (int j = 2; j <= curNum/2; j++)
                {
                    if (curNum % j == 0)
                    {
                        isPrime = false;
                        break; // Exit inner loop if factor found
                    }
                }
            }
            
            // Print if prime
            if (isPrime)
            {
                System.out.println(curNum);
            }
        }
        
        sc.close();
    }
}
