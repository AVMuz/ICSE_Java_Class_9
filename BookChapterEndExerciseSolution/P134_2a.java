
/** Write a program by using class 'Employee' to accept Basic Pay of an 
 * employee. Calculate the allowances/deductions as given below.
 * Allowance/Deduction Rate
 * Dearness Allowance (DA)      :   30% of Basic Pay
 * House Rent Allowance (HRA)   :   15% of Basic Pay
 * Provident Fund (PF)          :   12.5% of Basic Pay
 * Gross Pay = Basic Pay + Dearness Allowance + House Rent Allowance
 * Net Pay = Gross Pay - Provident Fund
 * Finally display the gross and Net Pay.
 * 
 * @author ANOOP VERMA
 * @version 2.0, Fully OOP version
 */

import java.util.Scanner;

class Employee
{
    private double basicPay;
    private double da;
    private double hra;
    private double pf;
    private double grossPay;
    private double netPay;

    // Constructor to initialize basic pay
    public Employee(double basicPay)
    {
        this.basicPay = basicPay;
        calculateAllowances();
        calculateDeductions();
        calculateGrossPay();
        calculateNetPay();
    }

    // Method to calculate allowances
    private void calculateAllowances()
    {
        this.da = 0.30 * basicPay;  // 30% of basic pay
        this.hra = 0.15 * basicPay; // 15% of basic pay
    }

    // Method to calculate deductions
    private void calculateDeductions()
    {
        this.pf = 0.125 * basicPay; // 12.5% of basic pay
    }

    // Method to calculate gross pay
    private void calculateGrossPay()
    {
        this.grossPay = basicPay + da + hra;
    }

    // Method to calculate net pay
    private void calculateNetPay()
    {
        this.netPay = grossPay - pf;
    }

    // Method to display salary details
    public void displaySalaryDetails()
    {
        System.out.println("\nSalary Details:");
        System.out.println("Basic Pay                 : " + basicPay);
        System.out.println("Dearness Allowance (DA)   : " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Provident Fund (PF)       : " + pf);
        System.out.println("Gross Pay                 : " + grossPay);
        System.out.println("Net Pay                   : " + netPay);
    }
}

public class P134_2a
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get basic pay input from user
        System.out.print("Enter the Basic Pay of the employee: ");
        double basicPay = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(basicPay);

        // Display salary details
        employee.displaySalaryDetails();

        scanner.close();
    }
}