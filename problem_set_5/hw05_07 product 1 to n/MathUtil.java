//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
        int sum=1;
        for (int i=1; i<=n ;i++) {
            sum*=i;
        }
        return sum;
   }
}

