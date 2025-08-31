
/**
 * Write a program in Java to input three numbers and display the greatest and
 * the smallest among them. 
 * Use Math.min() and Math.max() function.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P155_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();
        
        // Using Math.max and Math.min functions
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        
        System.out.println("Greatest number: " + max);
        System.out.println("Smallest number: " + min);
        
        scanner.close();
    }
}
