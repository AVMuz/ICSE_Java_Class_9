
/**
 * Write a program to input a number. Evaluate and display the results based 
 * on the number entered by the use:
 * (a) Natural logarithm of the number
 * (b) Absolute value of the number
 * (c) Square root of thr number
 * (d) Cube of the number
 * (e) Random numbers between o(zero) and 1(one).
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;
import java.lang.Math;

public class P155_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        
        // (a) Natural logarithm of the number
        if (number > 0)
        {
            double naturalLog = Math.log(number);
            System.out.println("(a) Natural logarithm: " + naturalLog);
        }
        else
        {
            System.out.println("(a) Natural logarithm is undefined for non-positive numbers");
        }
        
        // (b) Absolute value of the number
        double absoluteValue = Math.abs(number);
        System.out.println("(b) Absolute value: " + absoluteValue);
        
        // (c) Square root of the number
        if (number >= 0)
        {
            double squareRoot = Math.sqrt(number);
            System.out.println("(c) Square root: " + squareRoot);
        }
        else
        {
            System.out.println("(c) Square root is undefined for negative numbers");
        }
        
        // (d) Cube of the number
        double cube = Math.pow(number, 3);
        System.out.println("(d) Cube: " + cube);
        
        // (e) Random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("(e) Random number between 0 and 1: " + randomNumber);
        
        sc.close();
    }
}
