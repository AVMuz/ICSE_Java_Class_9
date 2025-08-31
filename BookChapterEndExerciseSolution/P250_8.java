
/**
 * Write a program to input a number (upto 4-digits) and display the new number
 * after reversing the digits of the original number. The program also displays
 * the absolute difference between the original number and the reversed number.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P250_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input a number (up to 4 digits)
        System.out.print("Enter a number (up to 4 digits): ");
        int num = sc.nextInt();
        
        // Validate input is 1-4 digits
        if (num < 0 || num > 9999)
        {
            System.out.println("Enter a number between 0 and 9999.");
            return;
        }
        
        // Reverse the number
        int revNum = 0;
        int temp = num;
        
        while (temp != 0)
        {
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp /= 10;
        }
        
        // Calculate absolute difference
        int difference = Math.abs(num - revNum);
        
        // Display results
        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + revNum);
        System.out.println("Absolute difference: " + difference);
    }
}
