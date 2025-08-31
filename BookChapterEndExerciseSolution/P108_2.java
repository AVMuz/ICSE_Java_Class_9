
/**
 * A person is paid Rs. 350 each day he works and fined Rs. 30 for each day 
 * he remains absent. Write a program to calculate and display his monthly
 * income, if he is present for 25 days and remains absent for 5 days.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_2
{
    public static void main(String[] args)
    {
        int days_present = 25;
        int days_absent = 5;
        
        int wages = (days_present*350) - (days_absent*30);
        
        System.out.println("Monthly wages = " + wages);
    }
}