
/**
 * Write a Java program to display first ten terms of the series 1,4,9,16... 
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P249_1a
{
    public static void main(String[] args)
    {
        System.out.println("First ten terms of the series:");
        
        for (int i = 1; i <= 10; i++)
        {
            int term = i * i;  // Calculate the square of each number
            System.out.print(term);
            
            // Add comma separator except for the last term
            if (i < 10)
            {
                System.out.print(", ");
            }
        }
    }
}
