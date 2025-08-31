/* Compare three integers */

import java.util.Scanner;

public class Compare3Num
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int num3 = sc.nextInt();
        
        // Determine the order
		System.out.println("\nLargest comes first, then second largest and smallest");
        
		if (num1 >= num2 && num1 >= num3)
		{
            if (num2 >= num3)
			{
                System.out.println("\nFirst number then comes second & third.");
            }
			else
			{
                System.out.println("\nFirst number then comes third & second.");
            }
        }
		else
		{
			if (num2 >= num1 && num2 >= num3)
			{
				if (num1 >= num3)
				{
					System.out.println("\nSecond number then comes first & third.");
				}
				else
				{
					System.out.println("\nSecond number then comes third & first.");
				}
			}
			else	// num3 is the largest
			{ 
				if (num1 >= num2)
				{
					System.out.println("\nThird number then comes first & second.");
				}
				else
				{
					System.out.println("\nThird number then comes second & first.");
				}
			}
        }
        sc.close();
    }
}