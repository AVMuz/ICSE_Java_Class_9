
/**
 * Using switch case statement, write a menu driven program for the following
 * (a) To find and display the sum of series given below
 *      x^1 -x^2 + x^3 -x^4 + x^5 - ... .... -x^20, where x = 2 
 * (b) To display the series:
 *     1, 11, 111, 1111, 11111. 
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P253_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Display sum of alternating power series (x=2)");
            System.out.println("2. Display pattern series: 1, 11, 111, 1111, 11111");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    seriesSum();
                    break;
                    
                case 2:
                    displayPattern();
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid option...");
            }
        } while (ch != 3);
        
        sc.close();
    }
    
    // Option 1: Sum of alternating power series x^1 -x^2 +x^3 -x^4 ... -x^20 (x=2)
    public static void seriesSum()
    {
        final int x = 2;    // Because x is a constant
        double sum = 0;
        
        System.out.print("Series: ");
        for (int n = 1; n <= 20; n++)
        {
            double term = Math.pow(x, n);
            if (n % 2 == 0)
            {
                term = -term; // Negative sign for even exponents
                System.out.print(" - " + x + "^" + n);
            }
            else
            {
                if (n > 1)
                {
                    System.out.print(" + " + x + "^" + n);
                }
                else
                {
                    System.out.print(x + "^" + n);
                }
            }
            sum += term;
        }
        
        System.out.println("\nSum of the series: " + sum);
    }
    
    // Option 2: Display pattern series 1, 11, 111, 1111, 11111
    public static void displayPattern()
    {
        System.out.println("Series:");
        StringBuilder number = new StringBuilder("1");
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(number);
            if (i < 5)
            {
                System.out.print(", ");
            }
            number.append("1");
        }
        System.out.println();
    }
}
