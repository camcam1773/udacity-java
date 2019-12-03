/**
 * Tester for method to find soum of odd digits
 */
public class SumOfDigitsTester
{
   public static void main(String[] args)
   {
       MathUtil util = new MathUtil();
       
       int value = util.sumOfOdd(765423);
       System.out.println (value);
       System.out.println("Expected: 15");
       
       value = util.sumOfOdd(-3431);
       System.out.println (value);
       System.out.println("Expected: 7");
   }
}
