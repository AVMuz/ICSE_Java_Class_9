
/**
 * Write a program to input a number and check whether the number is a lead
 * number or not. A lead number is the one whose sum of even digits is equal 
 * to the sum of odd digits.
 * e.g. 3669, 3+9 (sum of odd digits) = 6+6 (sum of even digits)
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P252_15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isLeadNum(num))
        {
            System.out.println(num + " is a lead number.");
        } 
        else
        {
            System.out.println(num + " is not a lead number.");
        }
    }
    
    public static boolean isLeadNum(int n)
    {
        int sumEven = 0;
        int sumOdd = 0;
        
        // Handle negative numbers by taking absolute value
        n = Math.abs(n);
        
        while (n > 0)
        {
            int digit = n % 10;
            if (digit % 2 == 0)
            {
                sumEven += digit;
            }
            else
            {
                sumOdd += digit;
            }
            n /= 10;
        }
        
        return sumEven == sumOdd;
    }
}
