
/**
 * Given below is a hypothetical table showing the rate of income tax for an 
 * Indian citizen, who is up to the age of 60 years.
 *  Taxable Income (TI) in Rs.          Income Tax in Rs.
 *  Up to 2,50,000                      Nil
 *  More than 2,50,000 and less than    (TI - 1,60,000) * 10%
 *  or equal to 5,00,000
 *  More than 5,00,000 and less than    (TI - 5,00,000) * 20% + 34,000
 *  or equal to 10,00,000
 *  More than Rs 10,00,000              (TI - 10,00,000) * 30% + 94,000
 * Write a Java program to input the name, age and taxable income of a person.
 * If the age is more than 60 years then display the message "Wrong Category".
 * If the age is less than or equal to 60 years then computer and display the
 * income tax payable along with the name of th tax payer, as per the table
 * given above.
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P193_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Input person details
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter taxable income (in Rs.): ");
        double taxableIncome = sc.nextDouble();
        
        // Check age category
        if (age > 60)
        {
            System.out.println("Wrong Category");
        } 
        else
        {
            double incomeTax;
            // Calculate income tax
            if (taxableIncome <= 250000)
            {
                incomeTax = 0;
            }
            else if (taxableIncome <= 500000)
            {
                incomeTax = (taxableIncome - 160000) * 0.10;
            }
            else if (taxableIncome <= 1000000)
            {
                incomeTax = (taxableIncome - 500000) * 0.20 + 34000;
            }
            else
            {
                incomeTax = (taxableIncome - 1000000) * 0.30 + 94000;
            }
            
            // Display result
            System.out.println("\nTax Details:");
            System.out.println("-----------------------------");
            System.out.println("Tax Payer Name: " + name);
            System.out.printf("Taxable Income: Rs. %.2f%n", taxableIncome);
            System.out.printf("Income Tax Payable: Rs. %.2f%n", incomeTax);
            System.out.println("-----------------------------");
        }
        
        sc.close();
    }
}
