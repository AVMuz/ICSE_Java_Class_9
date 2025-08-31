
/**
 * Write a program to find and display the sum of the following series:
 *  1 + 4 + 9 + ... ... + 400
 *
 * General term: n^2, start 1, end 20
 * 
 * @author ANOOP VERMA
 * @version 2.0
 */

public class P250_7aver2
{
    public static void main(String[] args)
    {
        int sum = 0;
        int n = 20; 
        
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++)
        {
            int square = i * i;
            sum += square;
            
            // Print the series element
            System.out.print(square);
            if (i < n)
            {
                System.out.print("+");
            }
        }
        
        System.out.println("\nSum of the series: " + sum);
    }
}
