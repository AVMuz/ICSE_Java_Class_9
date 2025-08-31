
/**
 * Write a program in Java to calculate and display the radius of a circle by 
 * taking the area as input.
 *
 * @author ANOOP VERMA
 * @version 2.0 Uses Math.PI 
*/

import java.util.Scanner;
import java.lang.Math;

public class P155_5ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the area of the circle: ");
        double area = sc.nextDouble();
        
        // Calculate radius using formula: radius = √(area/π)
        double radius = Math.sqrt(area /Math.PI);
        
        System.out.println("Radius of the circle: " + radius);
        
        sc.close();
    }
}
