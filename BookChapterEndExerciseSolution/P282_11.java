
/**
 * Write a program to display all the composite numbers from 1 to 100 with its
 * factors.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P282_11
{
    public static void main(String[] args)
    {
        System.out.println("Composite numbers from 1 to 100 with their factors:");
        
        for (int num = 1; num <= 100; num++)
        {
            if (isComposite(num))
            {
                System.out.print(num + ": ");
                printFactors(num);
            }
        }
    }
    
    public static boolean isComposite(int n)
    {
        if (n <= 1)
        {
            return false;    
        }
        
        // A number is composite if it has more than 2 factors
        int factorCtr = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0) {
                factorCtr++;
                if (factorCtr > 2)
                {
                    return true;    
                }
            }
        }
        return false;
    }
    
    public static void printFactors(int n)
    {
        System.out.print("1"); // 1 is a factor of all numbers
        for (int i = 2; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
}
