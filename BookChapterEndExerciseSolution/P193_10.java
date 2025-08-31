
/**
 * A cloth showroom has announced festival discounts and gifts on the purchase
 * of items, based on the total cost as given below:
 *  Total Cost              Discount    Gift
 *  Up to Rs. 2000          5%          Calculator
 *  Rs 2001 to Rs. 5000     10%         School Bag
 *  Rs 5001 tp Rs 10000     15%         Wall Clock
 *  Above Rs. 10000         20%         Wrist Watch
 * Write a java program to input the total cose. Compute and display the 
 * amount to be paid by the customer along with the gift.  
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P193_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the total purchase amount: Rs. ");
        double totalCost = sc.nextDouble();
        
        double discount = 0;
        String gift = "";
        
        if (totalCost <= 2000)
        {
            discount = totalCost * 0.05;    // Discount 5%
            gift = "Calculator";
        } 
        else if (totalCost <= 5000)
        {
            discount = totalCost * 0.10;    // Discount 10%
            gift = "School Bag";
        } 
        else if (totalCost <= 10000)
        {
            discount = totalCost * 0.15;    // Discount 15%
            gift = "Wall Clock";
        } 
        else
        {
            discount = totalCost * 0.20;    // Discount 20%
            gift = "Wrist Watch";
        }
        
        double amountToPay = totalCost - discount;
        
        System.out.println("\nBill Details:");
        System.out.println("-----------------------------");
        System.out.printf("Total Cost:      Rs. %.2f%n", totalCost);
        System.out.printf("Discount:        Rs. %.2f%n", discount);
        System.out.printf("Amount to Pay:   Rs. %.2f%n", amountToPay);
        System.out.println("Gift:            " + gift);
        System.out.println("-----------------------------");
        
        sc.close();
    }
}
