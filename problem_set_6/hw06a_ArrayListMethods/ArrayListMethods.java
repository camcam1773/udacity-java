//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        //Determine if the array is sorted.
        String comp="a";
        for (int i=0;i<list.size();i++){
        	if (list.get(i).compareTo(comp)<0) sorted=false;
        	comp=list.get(i);
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {

        // Replace all but the first and last elements with the larger of its two neighbors
    	int i=1;
    	if (list.size()>1) {
    		String last=list.get(list.size()-1);
    	
	    	while ( i<list.size()-1 ) {
	    		String s=list.get(i);
	    		if ( s.compareTo( list.get(i-1))<0 ) {
	    			String temp = list.remove(i);
	    			list.add(i+1, temp);
	    		}
	    		else i++;    		
	    	}
        list.set(list.size()-1, last);
    	}

    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // Write the code to get the number of duplicates in the list
        for (int i=0;i<list.size()-1;i++) {
        	String comp=list.get(i);
        	for (int j=i+1;j<list.size();j++) {
        		if ( list.get(j).equals(comp) ) {
        			duplicates++;
        			break;
        		}
        	}
        }

        return duplicates;
    }

     /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        int insertAt = 0;

        // Move any word that starts with x, y, or z to 
        // the front of the ArrayList, but otherwise preserves the order
        for (int i=0;i<list.size();i++) {
        	String current=list.get(i);
        	if ( "xyz".contains(current.substring(0,1)) ) {
        		String temp=list.remove(i);
        		list.add(insertAt, temp);
        		insertAt++;
        	}
        }
        

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}
