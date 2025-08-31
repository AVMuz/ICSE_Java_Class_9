/* Write a program to accept a 4-digit integer and display the sum of its digits. */

import java.util.Scanner;

public class SumOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a 4-digit number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num>0)
		{
			int digit = num%10;
			sum += digit;
			num /= 10;
		}
		
		System.out.println("Sum of digits = " + sum);
		
		sc.close();
	}
}