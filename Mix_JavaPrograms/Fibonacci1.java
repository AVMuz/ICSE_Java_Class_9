/* Write a program to accept an integer 'n', and display n-terms of Fibonacci series */

import java.util.Scanner;

public class Fibonacci1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter an integer: ");
		int n = sc.nextInt();
		
		int a = 0, b = 1, c;
		
		System.out.println("Fibonacci Series (first " + n + " terms): ");
		
		for (int i = 1; i <= n; i++)
		{
            System.out.print(a + " ");  // Print current term
            c = a + b;  // Compute next term
            a = b;      // Update previous term
			b = c;      // Update next term
		}
		
		sc.close();
	}
}
