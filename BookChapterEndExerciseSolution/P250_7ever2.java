
/**
 * Write a program to calculate and display the sum of series:
 *  2 - 4 + 6 - 8 + ... ... - 20.
 *
 * @author ANOOP VERMA
 * @version 2.0, easy method by adding +ve & -Ve in two variables.
 */
public class P250_7ever2
{
    public static void main(String[] args)
    {
        int psum = 0; // Positive terms sum
        int nsum = 0; // Negative terms sum
        
        for (int i = 2; i <= 20; i += 2)
        {
            if ((i/2) % 2 == 1)
            { // Odd positions (1st, 3rd, etc.)
                psum += i;
            } else
            {              // Even positions (2nd, 4th, etc.)
                nsum += i;
            }
        }
        
        int result = psum - nsum;
        System.out.println("Sum of series = " + result);
    }
}
