
/**
 * The volume of solids viz. cuboid, cylinder and cone can be calculated by 
 * the formulae:
 * 1. Volume of a cuboid (v=l*b*h)
 * 2. Volume of a cylinder (v=pi*r^2*h)
 * 3. Volume of a cone (v=1/3 Pi*r^2*h)
 * Using a switch case statement, write a program to find and display the
 * volume of different solids by taking suitable varibles and data types as
 * input.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P194_14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        
        System.out.println("Volume Calculator");
        System.out.println("1. Cuboid");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();
        
        double volume = 0;
        
        switch(choice)
        {
            case 1: // Cuboid
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                volume = length * breadth * height;
                System.out.printf("Volume of cuboid: %.2f cubic units%n", volume);
                break;
                
            case 2: // Cylinder
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.print("Enter height: ");
                height = sc.nextDouble();
                volume = PI * radius * radius * height;
                System.out.printf("Volume of cylinder: %.2f cubic units%n", volume);
                break;
                
            case 3: // Cone
                System.out.print("Enter radius: ");
                radius = sc.nextDouble();
                System.out.print("Enter height: ");
                height = sc.nextDouble();
                volume = (1.0/3) * PI * radius * radius * height;
                System.out.printf("Volume of cone: %.2f cubic units%n", volume);
                break;
                
            default:
                System.out.println("Invalid choice! Please select 1-3.");
        }
        
        sc.close();
    }
}
