/* Leap year check, I remeber or not */

import java.util.Scanner;

public class MyLeapChk1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int yr;
		
		do
		{
			System.out.print("Enter year ( >1582 ): ");
			yr = sc.nextInt();
		} while (yr<1582);
		
		String str = (yr%100 == 0 && yr%400==0) || (yr%100 != 0 && yr%4 == 0) ? "Leap year" : "Not leap year";
		
		System.out.println(yr + " => " + str);
		
		sc.close();
	}
}

		
		
			