
/**
 * Write a Java program to display first ten terms of the series 1,2,4,7,11... 
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P249_1b
{
    public static void main(String[] args)
    {
        System.out.println("First ten terms of the series:");
        
        int term = 1;
        int nextTerm = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(term);
            
            if (i < 10) // Put separator between all terms except last one.
            {
                System.out.print(", ");
            }
            
            nextTerm++;
            term += nextTerm;
        }
    }
}
