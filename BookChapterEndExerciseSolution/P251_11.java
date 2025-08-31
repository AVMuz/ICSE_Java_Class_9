
/**
 * In order to reach the top of a pole, a monkey in his first attempt reaches
 * a height of 5 feet and in the subsequent jumps, he slips down by 2% of the 
 * height attained in the previous jump. The process repeats and finally the 
 * money reaches the top of the pole. Write a Java peogram to input height of 
 * the pole. Calculate and display the number of attempts the monkey makes to
 * reach the top of the pole.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P251_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the height of the pole (in feet): ");
        double pole = sc.nextDouble();
        
        int attempt = 0;
        double curHeight = 0;
        double nextJump = 5; // First jump is 5 feet
        
        while (curHeight < pole)
        {
            attempt++;
            curHeight += nextJump;
            
            // Check if monkey has reached or exceeded the pole height
            if (curHeight >= pole)
            {
                break;
            }
            
            // Monkey slips back 2% of the height attained in previous jump
            double slip = nextJump * 0.02;
            curHeight -= slip;
            
            // Next jump is the same as the previous jump minus the slip
            nextJump -= slip;
            
            // Ensure we don't get stuck in an infinite loop with very small jumps
            if (nextJump < 0.001)
            {
                System.out.println("The monkey's jumps are becoming too small to reach the top.");
                return;
            }
        }
        
        System.out.println("Number of attempts needed: " + attempt);
    }
}

/* EXPLANATION 
 * -----------
 * Calculation for 10-foot Pole:
 * Initial Setup:
 * First jump height: 5 feet
 * Slip back: 2% of the height attained in the previous jump
 * Attempt 1:
 * Jumps up: +5 feet
 * New height: 0 + 5 = 5 feet
 * Slips back: 2% of 5 = 0.10 feet
 * New height: 5 - 0.10 = 4.90 feet
 * Next jump will be: 5 - 0.10 = 4.90 feet (original jump minus the slip)
 * Attempt 2:
 * Jumps up: +4.90 feet
 * New height: 4.90 + 4.90 = 9.80 feet
 * Slips back: 2% of 4.90 = 0.098 feet
 * New height: 9.80 - 0.098 = 9.702 feet
 * Next jump will be: 4.90 - 0.098 = 4.802 feet
 * Attempt 3:
 * Jumps up: +4.802 feet
 * New height: 9.702 + 4.802 = 14.504 feet (exceeds 10 feet)
 * Monkey reaches the top!
 */