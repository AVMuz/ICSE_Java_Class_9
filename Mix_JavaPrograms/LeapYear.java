import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year (all 4-digits): ");
		int year = sc.nextInt();
		
		boolean leap = false;
		
		if (year%100 == 0)
		{
			if (year%400 == 0)
				leap = true;
		}
		else
		{
			if (year%4 == 0)
				leap = true;
			else
				leap = false;
		}
		
		if (leap == true)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is NOT a leap year");
		}
	}
}
