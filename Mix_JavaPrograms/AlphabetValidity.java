/* Program to check the Alphabet data validity */

import java.util.Scanner;

public class AlphabetValidity
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.print("Enter an alphabetic character: ");
			ch = sc.next().charAt(0);
		} while (!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')));

		System.out.println("Data is correct");
		sc.close();
	}
}

		