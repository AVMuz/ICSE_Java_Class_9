
/**
 * Write a program to find and display the percentage difference when a number
 * is updates from 80 to 90.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_4a
{
    public static void main(String[] args)
    {
        int start_num = 80;
        int end_num = 90;
        
        int diff = end_num - start_num;
        
        double perc_diff = (double)(diff*100)/start_num;
    
        System.out.println("Percent difference = " + perc_diff);
    }
}