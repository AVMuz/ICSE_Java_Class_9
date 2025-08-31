/* Write a program to convert a Hexadecimal number to its decimal equivalent. */

import java.util.Scanner;

public class HexToDec
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexStr = sc.nextLine().toUpperCase(); // Convert to uppercase for uniformity

		String temp = hexStr;
        int decimal = 0;
        int power = 0; // Tracks the current power of 16 (starts at 16^0)

        // Iterate from right to left (LSB to MSB)
        for (int i = hexStr.length() - 1; i >= 0; i--)
		{
            char hexChar = hexStr.charAt(i);
            int digit;

            // Convert hex character to decimal value
            if (hexChar >= '0' && hexChar <= '9')
			{
                digit = hexChar - '0'; // '0'-'9' → 0-9
            }
			else if (hexChar >= 'A' && hexChar <= 'F')
			{
                digit = 10 + (hexChar - 'A'); // 'A' → 10, 'B' → 11, ..., 'F' → 15
            }
			else
			{
                System.out.println("Invalid hexadecimal digit: " + hexChar);
                return;
            }

            decimal += digit * Math.pow(16, power);
            power++;
        }

		System.out.println("\nHexadecimal number: " + temp);
        System.out.println("Decimal equivalent: " + decimal);
		
		sc.close();
    }
}
