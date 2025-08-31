
/**
 * A pre-paid taxi charges from the passenger as per the tariff given below:
 *  Distance            Rate
 *  Up to 5 km          Rs. 100
 *  For next 10 km      Rs 10/km
 *  For next 10 km      Rs 8/km
 *  More than 25 km     Rs 5/km
 *  Write a program to input the distance covered and calculate the amount to
 *  be paid by the passeneger. The program displays the printed bill with the
 *  details given below.
 *  Taxi No.        :___________________
 *  Distance covered:___________________
 *  Amount          :___________________
 *  
 * @author ANOOP VERMA
 * @version 2.0, Uses a separate function to calculate the fare.
 */

import java.util.Scanner;

public class P193_9ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input taxi details
        System.out.print("Enter Taxi Number: ");
        String taxiNo = sc.nextLine();
        
        System.out.print("Enter Distance covered (in km): ");
        double distCovered = sc.nextDouble();
        
        // Calculate fare
        double amount = calculateFare(distCovered);
        
        // Print the bill
        System.out.println("\n\n");
        System.out.println("Taxi Bill");
        System.out.println("-------------------------");
        System.out.println("Taxi No.        : " + taxiNo);
        System.out.println("Distance covered: " + distCovered + " km");
        System.out.println("Amount          : Rs. " + amount);
        System.out.println("-------------------------");
        
        sc.close();
    }
    
    public static double calculateFare(double dist) {
        double fare = 0;
        
        if (dist <= 5)
        {
            fare = 100;
        }
        else if (dist <= 15)
        {
            fare = 100 + (dist - 5) * 10;
        }
        else if (dist <= 25)
        {
            fare = 100 + 10 * 10 + (dist - 15) * 8;
        }
        else
        {
            fare = 100 + 10 * 10 + 10 * 8 + (dist - 25) * 5;
        }
        
        return fare;
    }
}