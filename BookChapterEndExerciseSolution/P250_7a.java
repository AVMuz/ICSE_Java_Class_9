
/**
 * Write a program to find and display the sum of the following series:
 *  1 + 4 + 9 + ... ... + 400
 *
 * General term: n^2, start 1, end 20
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P250_7a
{
    public static void main(String[] args)
    {
        int seriesSum = 0;
        
        for (int i=1; i<=20; i++)
        {
            seriesSum += (i * i);
        }
        
        System.out.println("Sum of series = " + seriesSum);
    }
}
