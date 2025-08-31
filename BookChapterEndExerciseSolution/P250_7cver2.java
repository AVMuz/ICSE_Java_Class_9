
/*
 * Write a program to find and display the sum of series:
 * 1 + 1/3 + 1/5 + ... ... + 1/19
 * 
 * General term: 1/n, n is odd from 1 to 20
 * 
 * @author ANOOP VERMA
 * @version 2.0
 */

public class P250_7cver2
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        
        System.out.print("Series: ");
        for (int i=1; i<=20; i+=2)
        {
            sum += 1.0/i;
            
            // Print the series term
            System.out.print("1/" + i);
            if (i < 19)
            {
                System.out.print("+");
            }
        }
        
        System.out.println("\nSum of the series: " + sum);
    }
}