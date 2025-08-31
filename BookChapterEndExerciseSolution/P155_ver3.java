
/**
 * Write a program in Java to calculate and display the radius of a circle by 
 * taking the area as input.
 *
 * @author ANOOP VERMA
 * @version 3.0 Input validation & Formatted output
 */

import java.util.Scanner;
import java.lang.Math;

public class P155_ver3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the area of the circle (must be positive): ");
        double area = sc.nextDouble();
        
        if (area <= 0)
        {
            System.out.println("Error: Area must be a positive number.");
        }
        else
        {
            // Calculate radius and round to 2 decimal places
            double radius = Math.sqrt(area / Math.PI);
            System.out.printf("Radius of the circle: %.2f%n", radius);
        }
        
        sc.close();
    }
}
