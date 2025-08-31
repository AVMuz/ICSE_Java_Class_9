
/**
 * "Kumar Electronics" has announced the following seasonal discounts on 
 * purchase of certain items.
 *  Purchase Amount         Discount on Laptop    Discount on Desktop PC
 *  Up to Rs 25000          0.0%                  5.0%
 *  Rs 25001 - Rs 50000     5.0%                  7.5%
 *  Rs 50001 - Rs 100000    7.5%                  10.0%
 *  More than 100000        10.0%                 15.0%
 * Write a program to input name, amount of purchase and the type of purchase
 * ('L' for Laptop and 'D' for Desktop) by a customer. Compute and display the
 * net amount to be paid by a customer along with his/her name.
 *  Net amount = Amount of purchase - Discount
 *
 * @author ANOOP VERMA
 * @version 1.0, Uses Ternary operators, but no check for invalid input except L/D
 */

import java.util.Scanner;

public class P195_18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input customer details
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter purchase amount: Rs. ");
        double purchaseAmount = sc.nextDouble();
        
        System.out.print("Enter type of purchase (L for Laptop, D for Desktop): ");
        char purchaseType = sc.next().charAt(0);
        purchaseType = Character.toUpperCase(purchaseType);
        
        // Calculate discount
        double discountRate = 0;
        double netAmount = 0;
        
        if (purchaseType == 'L' || purchaseType == 'D')
        {
            if (purchaseAmount <= 25000)
            {
                discountRate = (purchaseType == 'L') ? 0.0 : 5.0;
            }
            else if (purchaseAmount <= 50000)
            {
                discountRate = (purchaseType == 'L') ? 5.0 : 7.5;
            }
            else if (purchaseAmount <= 100000)
            {
                discountRate = (purchaseType == 'L') ? 7.5 : 10.0;
            }
            else
            {
                discountRate = (purchaseType == 'L') ? 10.0 : 15.0;
            }
            
            double discount = purchaseAmount * discountRate / 100;
            netAmount = purchaseAmount - discount;
            
            // Display bill
            System.out.println("\n--- Kumar Electronics ---");
            System.out.println("Customer Name: " + name);
            System.out.printf("Purchase Amount: Rs. %.2f%n", purchaseAmount);
            System.out.println("Purchase Type: " + (purchaseType == 'L' ? "Laptop" : "Desktop PC"));
            System.out.printf("Discount Rate: %.1f%%%n", discountRate); // Display % in output
            System.out.printf("Discount Amount: Rs. %.2f%n", discount);
            System.out.printf("Net Amount to Pay: Rs. %.2f%n", netAmount);
            System.out.println("Thank you for shopping with us!");
        } 
        else
        {
            System.out.println("Invalid purchase type! Please enter 'L' or 'D'.");
        }
        
        sc.close();
    }
}
