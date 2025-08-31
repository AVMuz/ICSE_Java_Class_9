/* Write a program to accept a binary number and display its equivalent decimal number. */

import java.util.Scanner;

public class BinToDec
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number (as integer): ");
        int binary = sc.nextInt();

		int temp = binary;
        int decimal = 0;
        int power = 0;

        while (binary > 0)
		{
            int last = binary % 10; // Extract the rightmost digit
            if (last == 1)
			{
                decimal += Math.pow(2, power);
            } 
			else if (last != 0)
			{
                System.out.println("Invalid binary digit: " + last);
                return;
            }
            binary /= 10; // Remove the rightmost digit
            power++;
        }

        System.out.println("\nBinary number: " + temp); 
		System.out.println("Decimal equivalent: " + decimal);
		
		sc.close();
    }
}