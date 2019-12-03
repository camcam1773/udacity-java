
public class SubstringPrinter
{
   public static void main(String[] args)
   {
      Word word = new Word("rum");
      System.out.println(word.getSubstrings());   
      
      word = new Word("Udacity");
      System.out.println(word.getSubstrings()); 
   }

}

/* r u m ru um rum 
0,1 1,2 2,3 0,2 1,3 0,3
*/
