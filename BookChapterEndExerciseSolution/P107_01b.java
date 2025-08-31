
/**
 * Write a program to find and display the value of the given expression:
 *  a^2 + b^2 +c^2
 *  -------------- taking a = 5, b = 4, c= 3.
 *       abc
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P107_01b
{
    public static void main(String[] args)
    {
        int a = 5, b = 4, c = 3;
        double ans = (a*a +b*b + c*c)/(a*b*c);
        System.out.println("Answer = " + ans);
    }
}