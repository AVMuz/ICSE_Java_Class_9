
/**
 * A shopkeeper offers 10% discount on the printed price of a digital camera.
 * However, a customer has to pay 6% GST on the remaining amount. Write a 
 * program in Java to calculate and display the amount to be paid by the 
 * customer taking printed price as an input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Get the printed price from the user
        System.out.print("Enter the printed price of the digital camera: ");
        double printedPrice = scanner.nextDouble();
        
        // Calculate discount (10% of printed price)
        double discount = printedPrice * 0.10;
        
        // Calculate price after discount
        double priceAfterDiscount = printedPrice - discount;
        
        // Calculate GST (6% of price after discount)
        double gst = priceAfterDiscount * 0.06;
        
        // Calculate final amount to be paid
        double finalAmount = priceAfterDiscount + gst;
        
        // Display the breakdown and final amount
        System.out.println("\nBill Details:\n");
        System.out.printf("Printed Price: Rs. %.2f%n", printedPrice);
        System.out.printf("Discount (10%%): Rs. %.2f%n", discount);
        System.out.printf("Price after discount: Rs. %.2f%n", priceAfterDiscount);
        System.out.printf("GST (6%%): Rs. %.2f%n", gst);
        System.out.printf("Final Amount to Pay: Rs. %.2f%n", finalAmount);
        
        scanner.close();
    }
}