
/**
 * Write a program to find and display the value of the given expression:
 *  x+3     2x+5
 *  ---  -  ----   taking x = 5.
 *   6       3
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P107_01a
{
    public static void main(String[] args)
    {
        int x = 5;
        double ans = ((x+3)/6)-((2*x+5)/3);
        System.out.println("Answer = " + ans);
    }
}