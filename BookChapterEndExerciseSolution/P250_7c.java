/**
 * Write a program to find and display the sum of series:
 * 1 + 1/3 + 1/5 + ... ... + 1/19
 * 
 * General term: 1/n, n is odd from 1 to 20
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_7c
{
    public static void main(String[] args)
    {
        double seriesSum = 0.0;
        
        for (int i=1; i<=20; i+=2)
        {
            if (i%2!=0)
            {
                seriesSum += 1.0/i;
            }
        }
        
        System.out.println("Sum of series = " +seriesSum);
    }
}