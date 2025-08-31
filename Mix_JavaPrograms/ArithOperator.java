/* Write a program to accept two integers and display the sum, difference, product, quotient
   and remainder.
*/

import java.util.Scanner;

public class ArithOperator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		int num2 = sc.nextInt();
		
		System.out.println("Sum = " + (num1+num2));
		System.out.println("Difference = " + (num1-num2));
		System.out.println("Product = " + (num1*num2));
		
		System.out.println("Quotient = " + (num1/num2));
		System.out.println("Remainder = " + (num1%num2));
		
		sc.close();
	}
}
