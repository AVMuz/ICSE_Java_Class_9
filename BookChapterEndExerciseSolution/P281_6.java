
/**
 * Write a program to display the factorial of any 10 numbers.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P281_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        
        System.out.println("Enter 10 positive integers (0-20):");
        
        // Input 10 numbers from user
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        
        System.out.println("\nFactorial Results:");
        
        // Calculate and display factorial for each number
        for (int n : num)   // n in num, instead of 'for(int i=1;i<=10;i++)'
        {
            if (n < 0)
            {
                System.out.println(n + "! = Negative numbers not allowed");
            }
            else if (n > 20)
            {
                System.out.println(n + "! = Too large (max 20)");
            }
            else
            {
                long fact = 1;
                for (int i = 2; i <= n; i++)
                {
                    fact *= i;
                }
                System.out.println(n + "! = " + fact);
            }
        }
        
        sc.close();
    }
}
