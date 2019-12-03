
/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
import java.math.*;

public class MathUtil
{

   public int largestPowerOf2(int n)
   {
       int x=1;
       while (x<n) {
           x=x*2;           
       }
       return x/2;
   }
}
