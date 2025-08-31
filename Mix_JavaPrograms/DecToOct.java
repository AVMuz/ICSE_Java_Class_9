/* Write a program to convert a decimal number into its equivalent octal number. */

import java.util.Scanner;

public class DecToOct
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
		
		int temp = decimal;		// Original number safely stored.
		
        if (decimal == 0)
		{
            System.out.println("Binary: 0");
            return;
        }

        int[] octalDigits = new int[32]; 	// To store binary digits (max 32-bit integer)
        int index = 0;

        // Extract octal digits
        while (decimal > 0)
		{
            octalDigits[index] = decimal % 8;
            decimal /= 8;
            index++;
        }
		
		System.out.print("\nDecimal number: " + temp);
        // Print in reverse order
        System.out.print("\nOctal equivalent: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(octalDigits[i]);
        }
		
		sc.close();
    }
}