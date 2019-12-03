//Create a class Word. Word has a constructor that takes a string argument
//and one method getSubstrings which returns a String containing
//all substring of word, sorted by length.
//
//For example, if the user provides the input "rum", the method returns a
//string that will print like this

//r
//u
//m
//ru
//um
//rum


//You can concatenate the substrings in a String, separating them with a newline
//("\n"). Then return the string

//For the draft provide the constructor, the instance method ,
//and a stub for the getSubstring method that returns null.

public class Word
{
    private String input;
    public Word(String input){
        this.input=input;
    }

    /**
     * Gets all the substrings of this Word.
     * @return all substrings of this Word separated by newline
     */

    public String getSubstrings()
    {
       String cat="";
       for (int i=1;i<=input.length();i++) {
           for (int j=0;j+i<=input.length();j++) {
               cat=cat+input.substring(j,j+i)+"\n";
           }
       }
       return cat;
    }
}
