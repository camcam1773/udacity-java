// BlueJ project: lesson5/vowels

public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        // TODO: Complete this method
        // A little piece of code to get you started
        return letters.substring(i, i + 1).equals("a")||letters.substring(i, i + 1).equals("u")||letters.substring(i, i + 1).equals("e")||letters.substring(i, i + 1).equals("i")||letters.substring(i, i + 1).equals("o");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !(this.isVowel(i));
    }
}

