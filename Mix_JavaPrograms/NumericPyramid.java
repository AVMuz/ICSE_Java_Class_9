/* Program to print number pyramid 
       1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
*/

public class NumericPyramid
{
    public static void main(String[] args)
	{
        int rows = 5; // Number of rows in the pyramid
        int num = 1;

        for (int i = 1; i <= rows; i++)
		{
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++)
			{
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++)
			{
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers (excluding the first number)
            for (int j = i - 1; j >= 1; j--)
			{
                System.out.print((num - 2) + " ");
                num--;
            }

            System.out.println();
        }
    }
}
