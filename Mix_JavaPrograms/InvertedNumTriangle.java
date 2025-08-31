/* Program for pattern 
		5 5 5 5 5
		  4 4 4 4
		    3 3 3
			  2 2
			    1
*/

public class InvertedNumTriangle
{
    public static void main(String[] args)
	{
        int rows = 5; // Number of rows in the pyramid
        
        for (int i = rows; i >= 1; i--)
		{
            // Print spaces for alignment
            for (int j = 1; j <= 2 * (rows - i); j++)
			{
                System.out.print(" ");
            }
            
            // Print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
