/* Write a program to convert a decimal number into its equivalent hexadecimal number. */

import java.util.Scanner;

public class DecToHex
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

		int temp = decimal;
		
        if (decimal == 0)
		{
            System.out.println("Hexadecimal: 0");
            return;
        }

        char[] hexDigits = new char[32]; // Stores hex characters
        int index = 0;

        // Convert decimal to hex
        while (decimal > 0)
		{
            int remainder = decimal % 16;
            // Convert remainder to hex digit
            char hexChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            hexDigits[index++] = hexChar;
            decimal /= 16;
        }

		System.out.println("\nDecimal number: " + temp);
        // Print in reverse order
        System.out.print("Hexadecimal: ");
        for (int i = index - 1; i >= 0; i--)
		{
            System.out.print(hexDigits[i]);
        }
    }
}
