
/**
 * Write a Java program to accept a number and check whether the number is 
 * divisible by 3 as well as 5. Otherwise, decide:
 * (a) Is the number divisible by 3 and not by 5?
 * (b) Is the number divisible by 5 and not by 3?
 * (c) Is the number neither divisible by 3 nor by 5?
 * 
 * @author ANOOP VERMA
 * @version 1.0
 * */
 
import java.util.Scanner;

public class P192_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check divisibility conditions
        if (number % 3 == 0 && number % 5 == 0)
        {
            System.out.println(number + " is divisible by both 3 and 5.");
        }
        else if (number % 3 == 0)
        {
            System.out.println(number + " is divisible by 3 but not by 5.");
        }
        else if (number % 5 == 0)
        {
            System.out.println(number + " is divisible by 5 but not by 3.");
        }
        else
        {
            System.out.println(number + " is neither divisible by 3 nor by 5.");
        }

        sc.close();
    }
}
