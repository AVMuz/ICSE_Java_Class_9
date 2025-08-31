/* Write a program to accept a binary number and display its equivalent decimal number. Uses STRING type input*/

import java.util.Scanner;

public class BinToDecStr
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();

		String temp = binaryStr;
        int decimal = 0;
        int power = 0; // Tracks the current power of 2 (starts at 2^0)

        // Iterate from right to left (LSB to MSB)
        for (int i = binaryStr.length() - 1; i >= 0; i--)
		{
            char bit = binaryStr.charAt(i);
            if (bit == '1')
			{
                decimal += Math.pow(2, power); // Add 2^power if bit is '1'
            }
			else if (bit != '0') {
                System.out.println("Invalid binary digit: " + bit);
                return;
            }
            power++; // Move to the next higher power of 2
        }

		System.out.println("\nBinary String: " + temp);
        System.out.println("Decimal equivalent: " + decimal);
		
		sc.close();
    }
}
