import java.util.Scanner;

public class cdow
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a date ( >14 October 1582): ");
		
		System.out.print("Enter day (dd): ");
		int dd = sc.nextInt();
		System.out.print("Enter month (mm): ");
		int mm = sc.nextInt();
		System.out.print("Enter year (yyyy): ");
		int yy = sc.nextInt();
		
		int leap = 0;
		
		if (yy%100 == 0)
		{
			if (yy%400 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
		}
		else
		{
			if (yy%4 ==0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
		}
			
		int jd, fours, hundreds, fourHundreds, cday;
		
		if (leap==1)
		{
			jd = 1;
		}
		else
		{
			jd = 0;
		}
		
		if (mm == 1)
			jd = jd + dd;
		if (mm == 2)
			jd = jd + 31 + dd;
		if (mm == 3)
			jd = jd + 31 + 28 + dd;
		if (mm == 4)
			jd = jd + 31 + 28 + 31 + dd;
		if (mm == 5)
			jd = jd + 31 + 28 + 31 + 30 + dd;
		if (mm == 6)
			jd = jd + 31 + 28 + 31 + 30 + 31 + dd;
		if (mm == 7)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + dd;
		if (mm == 8)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + 31 + dd;
		if (mm == 9)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dd;
		if (mm == 10)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dd;
		if (mm == 11)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dd;
		if (mm == 12)
			jd = jd + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + dd;
		
		fours = (yy-1)/4;
		hundreds = (yy-1)/100;
		fourHundreds = (yy-1)/400;
		
		cday = (yy + jd + fours - hundreds + fourHundreds) % 7;
		
		if (cday == 0)
			System.out.println("Saturdat");
		if (cday == 1)
			System.out.println("Sunday");
		if (cday == 2)
			System.out.println("Monday");
		if (cday == 3)
			System.out.println("Tuesday");
		if (cday == 4)
			System.out.println("Wednesday");
		if (cday == 5)
			System.out.println("Thursday");
		if (cday == 6)
			System.out.println("Friday");
	}
}

		
		