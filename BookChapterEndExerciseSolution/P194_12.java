
/**
 * A company announces revised Dearness Allowance (DA) and Special Allowance
 * (SA) for their employees as per the tariff given below:
 *      Basic                   DA          SA
 *      Up o Rs 10000           10%         5%
 *      Rs 10001 - Rs 20000     12%         8%
 *      Rs 20001 - Rs 30000     15%         10%
 *      Rs 30001 & above        20%         12%
 * Write a Java program to accept the name and Basic Salary (BS) of an 
 * employee. Calculate and display the gross salary.
 * Gross Salary = Basic + DA + SA
 * Display the information in the format given below:
 * Name     Basic       Dearness Allowance      Spl Allowance    Gross Salary
 *  xxx     xxx         xxx                     xxx                xxx
 *  
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P194_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input employee details
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter basic salary: Rs. ");
        double basicSalary = sc.nextDouble();
        
        // Calculate allowances
        double da, sa;
        
        if (basicSalary <= 10000)
        {
            da = basicSalary * 0.10;
            sa = basicSalary * 0.05;
        }
        else if (basicSalary <= 20000)
        {
            da = basicSalary * 0.12;
            sa = basicSalary * 0.08;
        }
        else if (basicSalary <= 30000)
        {
            da = basicSalary * 0.15;
            sa = basicSalary * 0.10;
        }
        else
        {
            da = basicSalary * 0.20;
            sa = basicSalary * 0.12;
        }
        
        // Calculate gross salary
        double grossSalary = basicSalary + da + sa;
        
        // Display the result in tabular format
        System.out.println("\nSalary Details");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-20s %-15s %-15s%n", 
                         "Name", "Basic", "Dearness Allowance", "Spl Allowance", "Gross Salary");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-20.2f %-15.2f %-15.2f%n", 
                         name, basicSalary, da, sa, grossSalary);
        System.out.println("-----------------------------------------------------------------------");
        
        sc.close();
    }
}
