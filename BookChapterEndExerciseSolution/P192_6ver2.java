
/**
 * Write a program to input two unequal positive numbers and check whether 
 * they are perfect square numbers or not. If the user enters any negative 
 * number then the program displays the message "Square root of a negative 
 * cannot be determined".
 *
 * @author ANOOP VERMA
 * @version 2.0, Uses ternary operator and a helper function 
 */
import java.util.Scanner;

public class P192_6ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if numbers are equal
        if (num1 == num2)
        {
            System.out.println("Numbers must be unequal.");
            return;
        }

        // Check for negative numbers
        if (num1 < 0 || num2 < 0)
        {
            System.out.println("Square root of a negative cannot be determined");
            return;
        }

        // Check if num1 is a perfect square
        boolean isNum1PerfectSq = isPerfectSq(num1);
        // Check if num2 is a perfect square
        boolean isNum2PerfectSq = isPerfectSq(num2);

        // Display results
        System.out.println(num1 + " is " + (isNum1PerfectSq ? "" : "not ") + "a perfect square.");
        System.out.println(num2 + " is " + (isNum2PerfectSq ? "" : "not ") + "a perfect square.");

        sc.close();
    }

    // Helper method to check if a number is a perfect square
    private static boolean isPerfectSq(int num)
    {
        if (num < 0)
        {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}