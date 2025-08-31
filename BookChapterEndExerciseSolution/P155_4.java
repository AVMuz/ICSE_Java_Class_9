
/**
 * In an examination, you have appeared for three subjects i.e. Physics, 
 * Chemistry and Biology. Write a program in Java to calculate the average 
 * marks obtained and finally display the marks in rounded-off form.
 * Take Physics, Chemistry and Biology marks as inputs.
 *
 * @author ANOOP VERMA
 * @version 1.0
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class P155_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks obtained in three subjects:");
        
        System.out.print("Physics: ");
        double phy = sc.nextDouble();
        
        System.out.print("Chemistry: ");
        double chem = sc.nextDouble();
        
        System.out.print("Biology: ");
        double bio = sc.nextDouble();
        
        // Calculate average
        double avg = (phy + chem + bio) / 3.0;
        
        // Round off the average
        long roundedAvg = Math.round(avg);
        
        System.out.println("Average marks: " + avg);
        System.out.println("Rounded-off average: " + roundedAvg);
        
        sc.close();
    }
}
