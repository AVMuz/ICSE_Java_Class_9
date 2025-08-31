
/**
 * Write a program in Java to calculate and display the hypotenuse of a right-
 * angled triangle by taking perpendicular and base as inputs.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P155_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the perpendicular: ");
        double p = sc.nextDouble();
        
        System.out.print("Enter the base: ");
        double b = sc.nextDouble();
        
        double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2));
        
        System.out.println("Hypotenuse = " + h);
        
        sc.close();
    }
}