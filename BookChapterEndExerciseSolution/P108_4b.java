
/**
 * Write a program to find and display the percentage difference when a number
 * is updates from 80 to 90.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_4b
{
    public static void main(String[] args)
    {
        double start_num = 7.5;
        double end_num = 7.2;
        
        double diff = end_num - start_num;
        
        double perc_diff = (double)(diff*100)/start_num;
    
        System.out.println("Percent difference = " + perc_diff);
    }
}
