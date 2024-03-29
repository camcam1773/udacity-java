// Complete the methods below. These methods manipulate Arrays of Strings
import java.util.Arrays;
public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted, else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it
        String prev="";
        if (list.length>0) prev=list[0];
        for (int i=1;i<list.length;i++) {
            if(prev.compareTo(list[i])>0) {
                sorted=false;
                break;
            }            
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order).
     */
    public void replaceWithLargerNeighbor()
    {
        int i=1;
        if (list.length>1) {
            String last=list[list.length-1];        
            while ( i<list.length-1 ) {
                String s=list[i];
                if ( s.compareTo(list[i-1]) < 0 ) {
                    String temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
                else i++;           
            }
            list[list.length-1]=last;
        }
    }

    /**
     * Gets the number of duplicates in the array.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        int duplicates = 0;        
        for (int i=0;i<list.length-1;i++) {
            String comp=list[i];
            for (int j=i+1;j<list.length;j++) {
                if ( list[j].equals(comp) ) {
                    duplicates++;
                    break;
                }
            }
        }
        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        for (int i=0;i<list.length;i++) {
        	String current=list[i];
        	if ( "xyz".contains(current.substring(0,1)) ) {        		
        		for (int j=i;j>insertAt;j--) {
        		   String temp=list[j];
        		   list[j]=list[j-1];
        		   list[j-1]=temp;
        		}
        		insertAt++;
        	}
        }        
    }

    /**
     * gets the string representation of this array 
     * @return a string representation of the array. (do this with Arrays.toString(list))
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}
