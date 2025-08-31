
/**
 * A shopkeeper offers 30% discount on purchasing an article whereas the other
 * shopkeeper offers two successive discounts 20% and 10% for purchasing the
 * same article. Write a program in Java to compute and display the disounts.
 * Take the price of an article as the input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Get the price of the article from user
        System.out.print("Enter the price of the article: ");
        double price = scanner.nextDouble();
        
        // Calculate first discount scheme (single 30% discount)
        double discount1 = price * 0.30;
        double finalPrice1 = price - discount1;
        
        // Calculate second discount scheme (successive 20% + 10% discounts)
        double firstDiscount = price * 0.20;
        double afterFirstDiscount = price - firstDiscount;
        double secondDiscount = afterFirstDiscount * 0.10;
        double finalPrice2 = afterFirstDiscount - secondDiscount;
        double totalDiscount2 = firstDiscount + secondDiscount;
        
        // Display results
        System.out.println("\nDiscount Scheme Comparison:");
        System.out.printf("Original Price: \tRs. %.2f%n", price);
        
        System.out.println("\nScheme 1: Single 30% discount");
        System.out.printf("Discount Amount: \tRs. %.2f%n", discount1);
        System.out.printf("Final Price: \t\tRs. %.2f%n", finalPrice1);
        
        System.out.println("\nScheme 2: Successive 20% + 10% discounts");
        System.out.printf("First Discount (20%%): \tRs. %.2f%n", firstDiscount);
        System.out.printf("Second Discount (10%%): \tRs. %.2f%n", secondDiscount);
        System.out.printf("Total Discount: \tRs. %.2f%n", totalDiscount2);
        System.out.printf("Final Price: \t\tRs. %.2f%n", finalPrice2);
        
        scanner.close();
    }
}
