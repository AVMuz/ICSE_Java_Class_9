
/**
 * Write a program to input the time in seconds. Display the time after 
 * converting it into hours, minutes and seconds.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P134_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Input time in seconds
        System.out.print("Enter time in seconds: ");
        int totalSeconds = scanner.nextInt();
        
        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        // Display the converted time
        System.out.printf("\n%d seconds = %d Hours, %d Minutes, and %d Seconds\n",
                         totalSeconds, hours, minutes, seconds);
               
        scanner.close();
    }
}    