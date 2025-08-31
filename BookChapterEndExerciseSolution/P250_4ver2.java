
/**
 * Write a program to enter any 10 numbers and check whether they are divisible
 * by 5 or not. If divisible the perform the following tasks:
 * (a) Display all the numbers ending with the digit 5.
 * (b) Count and display the numbers ending with 0 (zero).
 *
 * @author ANOOP VERMA
 * @version 2.0
 */

import java.util.Scanner;

public class P250_4ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int ZeroCount = 0;

        System.out.println("Enter 10 numbers:");

        // Input 10 numbers
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nNumbers divisible by 5 with numbers ending with 5:");
        
        // Check divisibility by 5 and perform tasks
        for (int i = 0; i<10; i++)   
        {
            int n = num[i];
            if (n % 5 == 0)
            {
                System.out.print(n + " "); // Print all divisible by 5

                int lastDigit = Math.abs(n) % 10; // Handle negative numbers

                if (lastDigit == 5)
                {
                    System.out.print("(ends with 5) ");
                }
                else if (lastDigit == 0)
                {
                    ZeroCount++;
                }
            }
        }

        System.out.println("\nCount of numbers ending with 0: " + ZeroCount);
        sc.close();
    }
}
