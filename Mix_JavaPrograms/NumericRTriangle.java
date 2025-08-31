/* Program to print number pyramid 
        1 
        2 2 
        3 3 3 
        4 4 4 4 
        5 5 5 5 5 
*/

public class NumericRTriangle
{
    public static void main(String[] args)
	{
        int rows = 5; // Number of rows in the pyramid
        
        for (int i = 1; i <= rows; i++)
		{
            // Print the numbers
            for (int j = 1; j <= i; j++)
			{
                System.out.print(i + " ");
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
