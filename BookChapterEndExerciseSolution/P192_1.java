
/**
 * Write a program to input three angles of a triangle and check whether its
 * construction is possible or not. If possible then check and display whether
 * it is an acute-angled triangle, right-angles triangle or an obtuse-angled 
 * triangle. Otherwise, display the message "A triangle is not possible".
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the three angles of the triangle:");
        System.out.print("Angle 1: ");
        int angle1 = scanner.nextInt();
        
        System.out.print("Angle 2: ");
        int angle2 = scanner.nextInt();
        
        System.out.print("Angle 3: ");
        int angle3 = scanner.nextInt();
        
        // Check if triangle is possible
        if (angle1+angle2+angle3 == 180 && angle1>0 && angle2>0 && angle3>0)
        {
            // Triangle is possible, now determine its type
            if (angle1 == 90 || angle2 == 90 || angle3 == 90)
            {
                System.out.println("Right-angled triangle");
            }
            else if (angle1 < 90 && angle2 < 90 && angle3 < 90)
            {
                System.out.println("Acute-angled triangle");
            }
            else
            {
                System.out.println("Obtuse-angled triangle");
            }
        }
        else
        {
            System.out.println("A triangle is not possible with these angles");
        }
        
        scanner.close();
    }
}
