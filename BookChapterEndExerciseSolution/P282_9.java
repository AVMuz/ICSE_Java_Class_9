
/**
 * Write a program to input a number and check whether the number is Unique or
 * not. (A number is Unique number, if it is a positive interger (without 
 * leading zero) and with no duplicate digits. 
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P282_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isUnique(num))
        {
            System.out.println(num + " is a Unique Number");
        } 
        else
        {
            System.out.println(num + " is NOT a Unique Number");
        }
        sc.close();
    }
    
    public static boolean isUnique(int n)
    {
        // Handle negative numbers by taking absolute value
        n = Math.abs(n);
        
        // Array to track seen digits (0-9)
        boolean[] digitSeen = new boolean[10];
        
        while (n > 0)
        {
            int digit = n % 10;  // Extract last digit
            
            if (digitSeen[digit])
            {
                return false;  // Digit already seen
            }
            
            digitSeen[digit] = true;  // Mark digit as seen
            n /= 10;  // Remove last digit
        }
        
        return true;  // All digits were unique
    }
}
