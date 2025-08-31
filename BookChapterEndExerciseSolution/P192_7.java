
/**
 * Without using if-else statement and ternary operators, accept three unequal
 * numbers and display the second smallest number.
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input three unequal numbers
        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();

        // Calculate second smallest using Math.min and Math.max
        double secondSmall = num1 + num2 + num3 - Math.min(Math.min(num1, num2), num3) - Math.max(Math.max(num1, num2), num3);

        System.out.println("The second smallest number is: " + secondSmall);

        sc.close();
    }
}
