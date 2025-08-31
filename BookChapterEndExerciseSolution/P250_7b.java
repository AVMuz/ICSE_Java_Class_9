
/**
 * Write a program to find and display the sum of series:
 * 1 + 1/2 + 1/3 + ... ... + 1/20
 * 
 * General term: 1/n, n from 1 to 20
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_7b
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        int terms = 20;
        
        System.out.print("Series: ");
        for (int i = 1; i <= terms; i++)
        {
            sum += 1.0 / i;
            
            // Print the series term
            System.out.print("1/" + i);
            if (i < terms)
            {
                System.out.print("+");
            }
        }
        
        System.out.println("\nSum of the series: " + sum);
    }
}
