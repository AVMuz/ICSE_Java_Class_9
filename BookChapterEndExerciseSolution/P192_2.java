
/**
 * Write a program to input the cost price & the selling price of an article.
 * If the selleing proce is more than the cost price then calculate & display
 * the actual profit and profir percent otherwise, calculate & display the 
 * actual loss and loss percent. If the cost price and the selling price are 
 * equal, the program displays the message "Neither profit nor loss".
 *
 * @author ANOOP VERMA
 * @version 1.0
 */

import java.util.Scanner;

public class P192_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input the cost price and selling price
        System.out.print("Enter the cost price of the article: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter the selling price of the article: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice)
        {
            // Calculate profit and profit percent
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100.0;
            System.out.printf("Profit: %.2f\n", profit);
            System.out.printf("Profit Percent: %.2f%%\n", profitPercent);
        } 
        else if (sellingPrice < costPrice)
        {
            // Calculate loss and loss percent
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100.0;
            System.out.printf("Loss: %.2f\n", loss);
            System.out.printf("Loss Percent: %.2f%%\n", lossPercent);
        } 
        else
        {
            // Neither profit nor loss
            System.out.println("Neither profit nor loss");
        }

        sc.close();
    }
}
