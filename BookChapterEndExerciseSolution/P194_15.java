
/**
 * A mega store has different floores which display varieties of dresses as 
 * mentioned below:
 *  1. Ground floor: Kids Wear
 *  2. First floor : Ladies Wear
 *  3. Second floor: Designer Sarees
 *  4. Third floor : Men's Wear
 * The user should enter the floor number to get the information regarding 
 * different items of the Mega Store. After shopping, the shopkeeper inputs 
 * the item purchased and the cost of the item and prints a bill to be paid by
 * the customer in the given format:
 *  Name of the Store: City Mart
 *  Total Amount     : _____________________
 *  Visit Again!!!
 * Write a Java program to perform the above task as per the user's choice. 
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P194_15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Display store information
        System.out.println("Welcome to City Mart");
        System.out.println("Floor Information:");
        System.out.println("1. Ground floor: Kids Wear");
        System.out.println("2. First floor : Ladies Wear");
        System.out.println("3. Second floor: Designer Sarees");
        System.out.println("4. Third floor : Men's Wear");
        
        // Get floor choice
        System.out.print("\nEnter floor number (1-4) to view items: ");
        int floorChoice = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        // Display floor items
        switch(floorChoice)
        {
            case 1:
                System.out.println("\nKids Wear Available:");
                System.out.println("- T-shirts\n- Dresses\n- Shorts\n- Shoes");
                break;
            case 2:
                System.out.println("\nLadies Wear Available:");
                System.out.println("- Kurtas\n- Jeans\n- Tops\n- Dresses");
                break;
            case 3:
                System.out.println("\nDesigner Sarees Available:");
                System.out.println("- Silk Sarees\n- Cotton Sarees\n- Designer Blouses");
                break;
            case 4:
                System.out.println("\nMen's Wear Available:");
                System.out.println("- Shirts\n- Trousers\n- T-shirts\n- Formal Wear");
                break;
            default:
                System.out.println("Invalid floor number!");
                sc.close();
                return;
        }
        
        // Shopping and billing
        System.out.println("\n--- Shopping ---");
        System.out.print("Enter number of different items purchased: ");
        int itemCount = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        double totalAmount = 0;
        
        for(int i = 1; i <= itemCount; i++) {
            System.out.print("\nEnter item " + i + " name: ");
            String itemName = sc.nextLine();
            
            System.out.print("Enter item " + i + " price: Rs. ");
            double itemPrice = sc.nextDouble();
            sc.nextLine(); // Consume newline
            
            totalAmount += itemPrice;
        }
        
        // Print bill
        System.out.println("\n--- Your Bill ---");
        System.out.println("Name of the Store: City Mart");
        System.out.printf("Total Amount     : Rs. %.2f%n", totalAmount);
        System.out.println("Visit Again!!!");
        
        sc.close();
    }
}
