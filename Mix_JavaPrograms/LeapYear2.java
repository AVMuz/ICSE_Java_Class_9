import java.util.Scanner;

public class LeapYear2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year (all 4-digits): ");
		int year = sc.nextInt();

		boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true: false;
		
		if (leap == true)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is NOT a leap year");
	}
}
	