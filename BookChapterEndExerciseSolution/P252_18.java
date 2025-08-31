
/**
 * Write a menu driven Java program to input two positive numbers m and n 
 * where (m > n) and perform the following tasks. 
 * (a) Sum of two numbers without using the + operator
 * (b) Product of two numbers without using the * operator 
 * (c) quotient and remainder of two numbers without using the / or % sign
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P252_18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        
        // Input validation for m and n (m > n, both positive)
        do 
        {
            System.out.print("Enter first positive number (m): ");
            m = sc.nextInt();
            System.out.print("Enter second positive number (n, where m > n): ");
            n = sc.nextInt();
            
            if (m <= n || m <= 0 || n <= 0)
            {
                System.out.println("Invalid input!");
            }
        } while (m <= n || m <= 0 || n <= 0);
        
        int choice;
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Sum without + operator");
            System.out.println("2. Product without * operator");
            System.out.println("3. Quotient and Remainder without / or % operators");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice)
            {
                case 1:
                    System.out.println("Sum: " + add(m, n));
                    break;
                case 2:
                    System.out.println("Product: " + mul(m, n));
                    break;
                case 3:
                    div(m, n);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        
        sc.close();
    }
    
    // (a) Sum without using + operator
    public static int add(int a, int b)
    {
        while (b != 0)
        {
            int carry = a & b;  // Bitwise AND 
            a = a ^ b;          // Bitwiese XOR       
            b = carry << 1;     // Bitwise left shift
        }
        return a;
    }
    
    // (b) Product without using * operator
    public static int mul(int a, int b)
    {
        int result = 0;
        while (b > 0)
        {
            if ((b & 1) != 0)
            {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }
    
    // (c) Quotient and Remainder without / or % operators
    public static void div(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            System.out.println("Cannot divide by zero!");
            return;
        }
        
        int quotient = 0;
        int remainder = 0;
        
        for (int i = 31; i >= 0; i--)
        {
            remainder <<= 1;
            remainder |= (dividend >> i) & 1;
            
            if (remainder >= divisor)
            {
                remainder = sub(remainder, divisor);
                quotient |= (1 << i);
            }
        }
        
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
    // Helper method for subtraction (used in division)
    public static int sub(int a, int b)
    {
        while (b != 0)
        {
            int borrow = (~a) & b;  // Bitwise NOT
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }
}
