//hw05_11
//
// Complete this method to read integer scores from the user and find the average
 // Stop asking for input when the user enters zero or  a negative number
// keep a running total and keep track of the number of entries
// then find and return the average
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        //TODO Find and return the average of the numbers entered.
        int count=0;
        double sum=0;
        System.out.print("Enter a score. -1 to quit: ");
        Scanner input=new Scanner(System.in);       
        while (input.hasNextInt()) {            
            int userIn=input.nextInt();
            if (userIn<0) break;
            sum+=userIn;
            count++;
            System.out.print("Enter a score. -1 to quit: ");
        }
        if (count==0) return 0;
        else {
            System.out.println(sum/count);
            return sum/count;
        }
    }
}
