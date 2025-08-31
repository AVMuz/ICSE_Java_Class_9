
/**
 * Write a program to input two unequal numbers. Display the numbers after 
 * swapping their values in the variables without using a third variable.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Numbers before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("Numbers after swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        sc.close();
    }
}

    