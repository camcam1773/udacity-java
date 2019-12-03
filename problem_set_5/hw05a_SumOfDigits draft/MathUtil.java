//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//HINT: Use a method of the Math class to get the absolute value of the parameter

public class MathUtil
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * @param n the number to use
    * @return the sum of the odd digits.
    */

   public int sumOfOdd(int n)
   {
      int an=Math.abs(n);
      int sum=0;
      
      while (an>0) {
          int digit = (int)(an % 10);        
          if(digit%2==1) sum+=digit;
          an/=10;
      }
      
      return sum; 
   }
}