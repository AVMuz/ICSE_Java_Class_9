
/**
 * Using a switch case statement, write a menu driven program to convert a 
 * given temperature from Fahrenheit to Celsius and vice-versa. FOr an 
 * incorrect choice, an appropriate message should be displayed.
 * 
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P194_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Temperature Conversion Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        double convertedTemp;
        
        switch(choice) {
            case 1:
                // Fahrenheit to Celsius conversion
                convertedTemp = (temperature - 32) * 5/9;
                System.out.printf("%.2f Degree F = %.2f Degree C%n", temperature, convertedTemp);
                break;
                
            case 2:
                // Celsius to Fahrenheit conversion
                convertedTemp = (temperature * 9/5) + 32;
                System.out.printf("%.2f Degree C = %.2f Degree F%n", temperature, convertedTemp);
                break;
                
            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
        
        sc.close();
    }
}
