/* Write a program to accept an integer and display the number made by reversing its digits. */

import java.util.Scanner;

public class ReverseDigits
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
		
		System.out.println("Original number: " + num);
		System.out.println("New number     : " + revNum);
		
		sc.close();
	}
}
