/* Program to check for prime number with better efficiency for less number of repetitions*/

import java.util.Scanner;

public class PrimeTest2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean prime = true;
		int n;
		
		do
		{
			System.out.print("Enter integer: ");
			n = sc.nextInt();
		} while (n<1);		// Rejects negative integers.
		
		for (int i=2; i<Math.sqrt(n); i++)
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
