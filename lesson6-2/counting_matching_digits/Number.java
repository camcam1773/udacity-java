// Bluej project: lesson6/counting_matches_digits
/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {        
        int counter=0;
        long temp=number;
        while (temp>0) {
            int digit = (int)(temp % 10);        
            if (digitToMatch==digit) counter++;
            temp/=10;
        }                
        
        return counter;       
    }
}
