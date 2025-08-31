/* Write a program that accepts integers until 0 is entered. When 0 is given as input, the program 
   displays the sum of all integers given before 0.
*/

import java.util.Scanner;

public class SumOfIntegers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int ctr = 0;
		int sum = 0;
		int num;
		do
		{
			System.out.print("Enter integer: ");
			num = sc.nextInt();
			ctr++;
			
			if (num !=0)	sum += num;
		} while (num!=0);
		
		System.out.println("Sum of " + (ctr-1) + " integers entered = " + sum);
		
		sc.close();
	}
}
