/* Write a program to accept an integer 'n', and display nth term of Fibonacci series */

import java.util.Scanner;

public class Fibonacci2
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter term number: ");
        int n = sc.nextInt();
 
		int a = 0, b = 1, c = 0;

        if (n == 1)
		{
			c = a;
        }
		else if (n == 2)
		{
            c = b;
        }
		else
		{
            for (int i = 3; i <= n; i++)
			{
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println("Term number " + n + " of Fibonacci series: = " + c);
		
		sc.close();
    }
}