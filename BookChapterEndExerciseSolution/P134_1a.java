/**
 * Write a java program to calculate the time period of a simple pendulum, 
 * the length and acceleration due to gravity is given as input by he user.
 *
 * @author ANOOP VERMA
 * @version 2.0, Uses PI from Math library
 */

import java.util.Scanner;

public class P134_1a
{
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Constants
        double PI = Math.PI;
        
        // Get input from user
        System.out.print("Length of the pendulum (in meters)? ");
        double length = scanner.nextDouble();
        
        System.out.print("Accel. due to gravity (in mps squared)? ");
        double gravity = scanner.nextDouble();
        
        // Calculate the time period
        
        double timePeriod = 2 * PI * Math.sqrt(length / gravity);
        
        // Display the result
        System.out.printf("The time period of the simple pendulum is: %.2f seconds", timePeriod);
        
        // Close the scanner
        scanner.close();
    }
}
