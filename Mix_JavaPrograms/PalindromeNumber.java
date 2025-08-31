/* Write a program to accept an integer and check whether it is a palindrome or not. */

import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter an integer: ");
		int num = sc.nextInt();
		
		int temp = num;
		int revNum = 0;
		
		while (temp>0)
		{
			int digit = temp%10;
			revNum = revNum * 10 + digit;
			temp /= 10;
		}
		
		if (num == revNum)
		{
			System.out.println(num + " is a Palindrome");
		}
		else
		{
			System.out.println(num + " is not a Palindrome");
		}
		
		sc.close();
	}
}
