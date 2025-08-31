
/**
 * Write a program to input marks in English, Maths and Science of 10 students
 * who have passed ICSE Examination 2014. Now, perform the following tasks:
 * (a) Find and display the number of students, who have secured 95% or more 
 *     in aggreagate.
 * (b) Find and display the number of students, who have secured 90% or more
 *     in English, Maths and Science.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P250_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Arrays to store marks of 10 students
        int[] eng = new int[10];
        int[] math = new int[10];
        int[] sci = new int[10];

        // Input marks for 10 students
        System.out.println("Enter marks for 10 students:");
        for (int i = 0; i < 10; i++)
        {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("English: ");
            eng[i] = sc.nextInt();
            System.out.print("Maths: ");
            math[i] = sc.nextInt();
            System.out.print("Science: ");
            sci[i] = sc.nextInt();
        }

        // (a) Count students with 95% or more in aggregate
        int count95 = 0;
        for (int i = 0; i < 10; i++)
        {
            double total = (eng[i] + math[i] + sci[i]) / 3.0;
            if (total >= 95.0)
            {
                count95++;
            }
        }
        System.out.println("\nNumber of students with 95% or more in aggregate: " + count95);

        // (b) Count students with 90% or more in all three subjects
        int count90All = 0;
        for (int i = 0; i < 10; i++)
        {
            if (eng[i] >= 90 && math[i] >= 90 && sci[i] >= 90)
            {
                count90All++;
            }
        }
        System.out.println("Number of students with 90% or more in all subjects: " + count90All);

        sc.close();
    }
}
