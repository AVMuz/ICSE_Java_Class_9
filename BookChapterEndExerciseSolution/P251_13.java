
/**
 * Write a program to accept a number and check whether it is a 'Spy Number' 
 * or not. (A number is a spy if the sum of its digits equals the product of 
 * its digits.)
 *
 * @author ANOOP VERMA
 * @version 1.0, using dedicated helper function
 */

import java.util.Scanner;

public class P251_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a Spy Number: ");
        int num = sc.nextInt();
        
        if (isSpyNumber(num))
        {
            System.out.println(num + " is a Spy Number.");
        } 
        else
        {
            System.out.println(num + " is not a Spy Number.");
        }
    }
    
    public static boolean isSpyNumber(int n)
    {
        int sum = 0;
        int prod = 1;
        int temp = n;
        
        // Take care of negative numbers
        n = Math.abs(n);
        
        // Special case: 0 is not considered a Spy Number
        if (n == 0)
        {
            return false;
        }
        
        while (n > 0)
        {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        
        return sum == prod;
    }
}
