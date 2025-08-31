
/**
 * Write a program to calculate and display the sum of series:
 *  2 - 4 + 6 - 8 + ... ... - 20.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */


public class P250e
{
    public static void main(String[] args)
    {
        int sum = 0;
        int sign = 1; // Starts with positive (1 for addition, -1 for subtraction)

        for (int i=2; i<=20; i+=2)
        {
            sum += sign * i;
            sign *= -1; // Toggle the sign for the next term
        }

        System.out.println("The sum of the series is: " + sum);
    }
}
