/* Write a program to read octal number and convert it into decimal equivalent. STRING approach */

import java.util.Scanner;

public class OctToDecStr
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalStr = sc.nextLine();

		String temp = octalStr;
		
        int decimal = 0;
        int power = 0; // Tracks the current power of 8 (starts at 8^0)

        // Iterate from right to left (LSB to MSB)
        for (int i = octalStr.length() - 1; i >= 0; i--)
		{
            char digitChar = octalStr.charAt(i);
            if (digitChar < '0' || digitChar > '7')
			{
                System.out.println("Invalid octal digit: " + digitChar);
                return;
            }
            int digit = digitChar - '0'; // Convert char to int (e.g., '5' → 5)
            decimal += digit * Math.pow(8, power);
            power++;
        }

        System.out.println("Decimal: " + decimal);
    }
}
/** Explanation of int digit = digitChar - '0';
 * For example:
 *	'0' → ASCII value 48
 *	'1' → ASCII value 49
 *	'5' → ASCII value 53
 *	'9' → ASCII value 57
 * Subtracting '0' (ASCII 48) adjusts the ASCII value to the actual digit:
 * '5' - '0' → 53 - 48 → 5 (integer)
 * '9' - '0' → 57 - 48 → 9 (integer)
*/
 