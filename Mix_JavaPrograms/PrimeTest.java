/* Program to check for prime number */

import java.util.Scanner;

public class PrimeTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean prime = true;
		
		System.out.print("Enter integer: ");
		int n = sc.nextInt();
		
		for (int i=2; i<n/2; i++)
		{
			if (n%i==0)
			{
				prime = false;
				break;
			}
		}
		if (prime==true && n!=1)
			System.out.println(n + " is Prime");
		else
			System.out.println(n + " is NOT Prime");
		
		sc.close();
	}
}
