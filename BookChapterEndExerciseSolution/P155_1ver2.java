
/**
 * Write a program in Java to input three numbers and display the greatest and
 * the smallest among them. 
 * 
 *
 * @author ANOOP VERMA
 * @version 2.0
 */

import java.util.Scanner;

public class P155_1ver2
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
        
        // Find the maximum number
        int max = num1;
        if (num2 > max)
        {
            max = num2;
        }
        if (num3 > max)
        {
            max = num3;
        }
        
        // Find the minimum number
        int min = num1;
        if (num2 < min)
        {
            min = num2;
        }
        if (num3 < min)
        {
            min = num3;
        }
        
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        
        scanner.close();
    }
}
