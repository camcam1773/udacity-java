// BlueJ project: lesson7/friends1

// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.
import java.util.*;
public class Person
{
    private String name;
    private ArrayList<String> friends=new ArrayList<String>();
    private static final String SEPARATOR = ", ";

    public Person(String name)
    {
        this.name = name;
        //this.friends.add(name);
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends.add(friend.name);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        if (friends.size() == 0)
        {
            return "";
        }
        else
        {
            String friendlist = friends.toString();
            return friendlist.substring(1,friendlist.length()-1);
        }
    }

    /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
    public String getFriend(int friendIndex)
    {        
        if (friendIndex<friends.size()) return friends.get(friendIndex);
        else return "";
    }
}
