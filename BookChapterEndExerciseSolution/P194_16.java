
/**
 * The equivalent resistance of series and parallel connections of two 
 * resistances is given by the formula:
 * (a) R1 = r1 + r2 (Series)
 * (b) R2 = (r1 * r2)/(r1 + r2) (Parallel)
 * Using the switch case statement, write a Java program to enter the values 
 * r1 and r2. Calculate and display the equivalent resistance accordingly.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P194_16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Resistance Calculator");
        System.out.println("1. Series Connection");
        System.out.println("2. Parallel Connection");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        if (choice != 1 || choice !=2)
        {
            System.out.println("Invalid choice...");
            return;
        }
        
        System.out.print("Enter resistance r1 (in ohms): ");
        double r1 = sc.nextDouble();
        
        System.out.print("Enter resistance r2 (in ohms): ");
        double r2 = sc.nextDouble();
        
        double eqR;
        
        switch(choice) {
            case 1:
                // Series connection: R = r1 + r2
                eqR = r1 + r2;
                System.out.printf("Equivalent resistance in series: %.2f ohms%n", eqR);
                break;
                
            case 2:
                // Parallel connection: R = (r1*r2)/(r1+r2)
                if (r1 + r2 == 0)
                {
                    System.out.println("Error: Sum of resistances cannot be zero for parallel connection");
                } 
                else
                {
                    eqR = (r1 * r2) / (r1 + r2);
                    System.out.printf("Equivalent resistance in parallel: %.2f ohms%n", eqR);
                }
                break;
                
            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
        
        sc.close();
    }
}
