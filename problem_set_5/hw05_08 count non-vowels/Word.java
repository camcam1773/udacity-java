
//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    private String word=new String();
    
    public Word(String word) {
        this.word=word.toLowerCase();
    }
    
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount()
    {
        //TODO Write the code return the number of non-vowels
        //String low=word.toLowerCase();
        int count=0;
        for (int i=0; i<word.length();i++) {
            String curChar=word.substring(i,i+1);
            if (!"aeiou".contains(curChar)) count++;
        }
        return count;
    }
}
