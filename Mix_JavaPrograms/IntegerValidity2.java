/* Program to check the validity of a 3-digit integer, with error handling */

import java.util.Scanner;
import java.util.InputMismatchException;

public class IntegerValidity2
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n;

        do
		{
            System.out.print("Enter a 3-digit integer (100-999): ");
            
            // Check if input is an integer
            while (!sc.hasNextInt())
			{
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear invalid input
                System.out.print("Enter a 3-digit integer (100-999): ");
            }
            
            n = sc.nextInt();

            // Check if input is a 3-digit number
            if (n < 100 || n > 999)
			{
                System.out.println("Error: Number must be between 100 and 999.");
            }
        } while (n < 100 || n > 999);

        System.out.println("Data is correct: " + n);
        sc.close();
    }
}
