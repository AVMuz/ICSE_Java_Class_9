
/**
 * The normal temperature of human body is 98.6 degree F. Write a program to 
 * convert the temoerature into degree celsius and display it.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_5
{
    public static void main(String[] args)
    {
        double f = 98.6;
        
        double c = (5*(f-32))/9;
        
        System.out.println("Temeprature in celsius = " + c);
    }
}