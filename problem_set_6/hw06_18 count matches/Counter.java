// Complete the method in this class to return the number of strings
// that start with the target
import java.util.ArrayList;
public class Counter
{
   /**
    * Gets the number of strings that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the count of strings starting with target
    */
    public int getCount(ArrayList<String> text, String target)
    {       
       int count=0;
       for (String s:text){
           if (s.substring(0, 1).equals(target)) count++;
       }
       return count;
    }
}
