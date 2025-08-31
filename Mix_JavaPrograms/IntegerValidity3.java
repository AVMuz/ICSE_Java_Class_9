/* Program to check the validity of a 3-digit integer, with try-catch, the most robust code */

import java.util.Scanner;

public class IntegerValidity3
{
    public static void main(String[] args)
	{
        try (Scanner sc = new Scanner(System.in))	// Auto-closes Scanner
		{  
            int n;
            
            while (true)
			{
                System.out.print("Enter a 3-digit integer (100-999): ");
                String input = sc.nextLine();
                
                try {
                    n = Integer.parseInt(input);

                    if (n >= 100 && n <= 999)
					{
                        System.out.println("Data is correct: " + n);
                        break;
                    }
					else
					{
                        System.out.println("Error: Number must be between 100 and 999.");
                    }
                }
				catch (NumberFormatException e)
				{
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
    }
}
