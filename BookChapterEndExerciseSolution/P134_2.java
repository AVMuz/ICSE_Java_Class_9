
/**
 * Write a program by using class 'Employee' to accept Basic Pay of an employee.
 * Calculate the allowances/deductions as given below.
 * Allowance/Deduction Rate
 * Dearness Allowance (DA)      :   30% of Basic Pay
 * House Rent Allowance (HRA)   :   15% of Basic Pay
 * Provident Fund (PF)          :   12.5% of Basic Pay
 * Gross Pay = Basic Pay + Dearness Allowance + House Rent Allowance
 * Net Pay = Gross Pay - Provident Fund
 * Finally display the gross and Net Pay.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_2
{
    public static void main(String[] args)
    {
        double basicPay, da, hra, pf, grossPay, netPay;
        
        Scanner scanner = new Scanner(System.in);

        // Get basic pay input from user
        System.out.print("Enter the Basic Pay of the employee: ");
        basicPay = scanner.nextDouble();
        
        // calculate allowances
        da = 0.30 * basicPay;  // 30% of basic pay
        hra = 0.15 * basicPay; // 15% of basic pay
        
        // calculate deductions
        pf = 0.125 * basicPay; // 12.5% of basic pay
        
        // calculate gross pay
        grossPay = basicPay + da + hra;
        
        // calculate net pay
        netPay = grossPay - pf;
        
        // display salary details
        System.out.println("\nSalary Details:\n");
        System.out.println("Basic Pay                   : " + basicPay);
        System.out.println("Dearness Allowance (DA)     : " + da);
        System.out.println("House Rent Allowance (HRA)  : " + hra);
        System.out.println("Provident Fund (PF)         : " + pf);
        System.out.println("Gross Pay                   : " + grossPay);
        System.out.println("Net Pay                     : " + netPay);
        
        scanner.close();
    }
}