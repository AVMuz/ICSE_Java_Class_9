
/**
 * Write a menu driven program to perform the following task by using the 
 * switch-case statement.
 * (a) To display the series 0, 3, 8, 15, 24.... up to n terms (n is to be 
 *     given by user.)
 * (b) To find and display the sum of series 1/2 + 3/4 + 5/6 + 7/8 ... + 19/20
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P253_20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do 
        {
            System.out.println("\nMenu:");
            System.out.println("1. Display series 0, 3, 8, 15, 24... up to n terms");
            System.out.println("2. Display sum of series 1/2 + 3/4 + 5/6 + ... + 19/20");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            switch (ch)
            {
                case 1:
                    displaySeries(sc);
                    break;
                    
                case 2:
                    seriesSum();
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid choice...Please try again.");
            }
        } while (ch != 3);
        
        sc.close();
    }
    
    // Option 1: Display series 0, 3, 8, 15, 24... up to n terms
    public static void displaySeries(Scanner scanner)
    {
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++)
        {
            int term = (i * i) - 1;
            System.out.print(term);
            if (i < n)
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    // Option 2: Display sum of series 1/2 + 3/4 + 5/6 + ... + 19/20
    public static void seriesSum()
    {
        double sum = 0.0;
        
        System.out.print("Series: ");
        for (int i = 1; i <= 19; i += 2)
        {
            System.out.print(i + "/" + (i + 1));
            if (i < 19)
            {
                System.out.print(" + ");
            }
            sum += (double)i / (i + 1);
        }
        
        System.out.println("\nSum of the series: " + sum);
    }
}
