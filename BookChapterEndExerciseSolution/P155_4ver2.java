
/**
 * In an examination, you have appeared for three subjects i.e. Physics, 
 * Chemistry and Biology. Write a program in Java to calculate the average 
 * marks obtained and finally display the marks in rounded-off form.
 * Take Physics, Chemistry and Biology marks as inputs.
 *
 * @author ANOOP VERMA
 * @version 2.0 Using DecimalFormat for custom rounding
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class P155_4ver2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Enter marks obtained in three subjects:");
        
        System.out.print("Physics: ");
        double phy = sc.nextDouble();
        
        System.out.print("Chemistry: ");
        double chem = sc.nextDouble();
        
        System.out.print("Biology: ");
        double bio = sc.nextDouble();
        
        // Calculate average
        double avg = (phy + chem + bio) / 3.0;
        
        // Display results
        System.out.println("Average marks: " + df.format(avg));
        System.out.println("Rounded-off average (nearest integer): " + Math.round(avg));
        
        sc.close();
    }
}
