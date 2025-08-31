
/**
 * A tech number has even number of digits. If the number is split in two 
 * equal halves, then the square of sum of these halves is equal to the number
 * itself. Write a Java program to generate and print all four-digit tech 
 * numbers.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

public class P251_14
{
    public static void main(String[] args)
    {
        System.out.println("Four-digit tech numbers are:");
        
        for (int num = 1000; num <= 9999; num++)
        {
            // Split the number into two halves
            int half1 = num / 100;
            int half2 = num % 100;
            
            // Calculate the square of the sum of the halves
            int sumSquared = (half1 + half2) * (half1 + half2);
            
            // Check if it equals the original number
            if (sumSquared == num)
            {
                System.out.println(num);
            }
        }
    }
}
