/* Program to check the integer validity */

import java.util.Scanner;

public class IntegerValidity
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		do
		{
			System.out.print("Enter a 3-digit integer: ");
			n = sc.nextInt();
		} while (n<100 || n>999);

		System.out.println("Data is correct");
		sc.close();
	}
}

		