// Bluej project: lesson6/first_match_no_long_words
// Write a program that finds the first word in Alice In Wonderland
// that is longer than 60 characters, and if there are no words
// that long, prints "There are no long words".

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = null;        
        final int THRESHOLD = 60;
        int position=-1;
        while(in.hasNext()) {
            String temp=in.next();
            if (temp.length()>THRESHOLD) {
                longWord=temp;
                break; 
            }
            position++;
        }        
        if (longWord==null) System.out.println("There are no long words");
        else System.out.println("The first long word is: " + longWord);
    }
}
