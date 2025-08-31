/* Write a program to accept an integer and display all its factors*/

import java.util.Scanner;

public class FactorsOfInteger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter an integer: ");
		int num = sc.nextInt();
		
		System.out.println("Factors of integer " + num + " are:");
		for (int i=1; i<=num; i++)
		{
			if (num%i == 0)
				System.out.print(i + " ");
		}
		
		sc.close();
	}
}
