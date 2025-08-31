
/**
 * The angles of a quadrilateral are in the ratio of 3:4:5:6. Write a program 
 * calculate and display all the angles.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_6
{
    public static void main(String[] args)
    {
        int ratio1 = 3, ratio2 = 4, ratio3 = 5, ratio4 = 6;
        
        int sumOfAngles = 360;
        
        int sumOfRatios = ratio1 + ratio2 + ratio3 + ratio4;
        
        // calculate each angle;
        double angle1 = (ratio1 * sumOfAngles)/(double)sumOfRatios;
        double angle2 = (ratio2 * sumOfAngles)/(double)sumOfRatios;
        double angle3 = (ratio3 * sumOfAngles)/(double)sumOfRatios;
        double angle4 = (ratio4 * sumOfAngles)/(double)sumOfRatios;
        
        System.out.println("The angles of quadrilateral are:");
        System.out.println("Angle 1 = " + angle1 + " degrees");
        System.out.println("Angle 2 = " + angle2 + " degrees");
        System.out.println("Angle 3 = " + angle3 + " degrees");
        System.out.println("Angle 4 = " + angle4 + " degrees");
    }
}