// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
//
import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // Initialize the string the hold the shortest string
      String shortest = ""; //initialize
      if (words.size()>0) shortest=words.get(0);

      // Write the code to find the shortest string
      for (String w:words) {
          if(w.length()<shortest.length()) shortest=w;
      }

      return shortest;
   }
}
