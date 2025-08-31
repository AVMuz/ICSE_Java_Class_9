/* Write a program to accept a person's height in feet and inches, and display it in metres 
   and centimeters
*/

import java.util.Scanner;

public class PersonHeight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a person's height");
		System.out.print("Enter feet part: ");
		int feet = sc.nextInt();
		System.out.print("Enter inch part: ");
		double inch = sc.nextDouble();
		
		double totalInch = (feet*12) + inch;	// 12 inch = 1 feet
		
		double centimeter = totalInch * 2.54;	// 2.54 cm = 1 inch
		
		double metre = centimeter/100; 			// 100 cm = 1 m
		
		System.out.println("Original Height given " + feet + "\'-" + inch + "\"");
		System.out.println("Height converted to centimeters = " + centimeter + " cm");
		System.out.println("Height converted to metres = " + metre + " m");
		
		sc.close();
	}
}
