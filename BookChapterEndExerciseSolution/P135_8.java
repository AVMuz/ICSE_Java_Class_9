
/**
 * A shopkeeper sells two calculators for the same price. He earns 20% profit
 * on one and suffers a loss of 20% on the other. Write a program to find and
 * display the total cost price of the calculators by taking their selling 
 * price as input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P135_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input selling price (same for both calculators)
        System.out.print("Enter the selling price of each calculator: ");
        double sellingPrice = sc.nextDouble();

        // Calculate cost prices
        double cp1 = sellingPrice / (1 + 0.20);  // CP of profit-making calculator
        double cp2 = sellingPrice / (1 - 0.20);  // CP of loss-making calculator

        // Total cost price
        double totalCP = cp1 + cp2;

        // Display results
        System.out.printf("\nCost Price (Profit Calculator): Rs. %.2f%n", cp1);
        System.out.printf("Cost Price (Loss Calculator): Rs. %.2f%n", cp2);
        System.out.printf("Total Cost Price: Rs. %.2f%n", totalCP);

        sc.close();
    }
}
