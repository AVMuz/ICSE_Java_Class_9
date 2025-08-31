
/**
 * Write a program to display first 10 terms of series 4,16,36,64....
 *
 * Pattern: Square of even numbers
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_1h
{
    public static void main(String[] args) {
        System.out.println("First 10 terms of the series 4, 16, 36, 64...:");

        for (int i = 1; i <= 10; i++)
        {
            int evenNum = 2 * i;  // Generates even numbers: 2, 4, 6, 8, ...
            int term = evenNum * evenNum;  // Square of the even number
            System.out.print(term);

            if (i < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
