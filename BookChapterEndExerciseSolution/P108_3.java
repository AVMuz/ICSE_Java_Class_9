
/**
 * In a competitive examination, there were 150 questions. One candidate got 
 * 80% correct and the other 72%. Write a program to calculate and display the
 * correct answers each candidate got.
 *
 * @author ANOOP VERMA
 * @version 1.0
 */
public class P108_3
{
    public static void main(String[] args)
    {
        int ques = 150;
        double cand1 = ques * 0.8;
        double cand2 = ques * 0.72;
        
        System.out.println("Candidate 1 got " + cand1 + " questions correct.");
        System.out.println("Candidate 2 got " + cand2 + " questions correct.");
    }
}