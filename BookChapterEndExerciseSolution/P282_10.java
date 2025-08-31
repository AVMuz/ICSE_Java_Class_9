
/**
 * Write a program to input a number (3-digit or more). Arrange the digits of
 * the number in ascending order and display the result.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P282_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (3-digit or more): ");
        int num = sc.nextInt();
        
        if (num < 100)
        {
            System.out.println("Enter a number with 3 or more digits.");
        } 
        else
        {
            int sortNum = sortDigit(num);
            System.out.println("Original number: " + num);
            System.out.println("Digits in ascending order: " + sortNum);
        }
        
        sc.close();
    }
    
    public static int sortDigit(int n)
    {
        n = Math.abs(n); // Handle negative numbers
        int result = 0;
        
        // Process digits from 0 to 9
        for (int digit = 0; digit <= 9; digit++)
        {
            int temp = n;
            
            // Extract and add matching digits
            while (temp > 0)
            {
                int curDigit = temp % 10;
                temp /= 10;
                
                if (curDigit == digit)
                {
                    result = result * 10 + digit;
                }
            }
        }
        
        return result;
    }
}
