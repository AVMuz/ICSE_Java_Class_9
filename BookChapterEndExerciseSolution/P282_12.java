
/**
 * In a school there are four different sections. In each section, there 
 * are 40 students who have appeared for ICSE Examination. Write a program to
 * input percentage marks of each student of each section. Calculate and 
 * display the number of students of each section, securing 95% and above in 
 * the council examination.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P282_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int SECTIONS = 4;     // change from 4 to 2 to test
        final int STUDENTS_PER_SECTION = 40;    // Chage from 40 to 10 to test
        int[] topPerformCount = new int[SECTIONS];
        
        // Input marks for each section
        for (int section = 0; section < SECTIONS; section++)
        {
            System.out.println("\nEntering marks for Section " + (char)('A' + section) + ":");
            for (int student = 0; student < STUDENTS_PER_SECTION; student++)
            {
                System.out.print("Enter percentage for student " + (student + 1) + ": ");
                double percentage = sc.nextDouble();
                
                if (percentage >= 95.0)
                {
                    topPerformCount[section]++;
                }
            }
        }
        
        // Display results
        System.out.println("\nNumber of students with 95% and above:");
        for (int section = 0; section < SECTIONS; section++)
        {
            System.out.println("Section " + (char)('A' + section) + ": " + 
                             topPerformCount[section] + " students");
        }
        
        sc.close();
    }
}
