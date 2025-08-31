/* Write a program to accept two integers and an operator and depending on operator
   calculate and display the result.
*/

import java.util.Scanner;

public class ArithOperator2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd integer: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter operator: ");
		char ch = sc.next().charAt(0);
		
		if (ch == '+')	System.out.println("Sum = " + (num1+num2));
		if (ch == '-')	System.out.println("Difference = " + (num1-num2));
		if (ch == '*')	System.out.println("Product = " + (num1*num2));
		if (ch == '/')	System.out.println("Quotient = " + (num1/num2));
		if (ch == '%')	System.out.println("Remainder = " + (num1%num2));
		
		sc.close();
	}
}
