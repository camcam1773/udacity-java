//Complete the class TripPlan which describes the cities that are visited by a tour conducted
//by Java Now Tours. Keep an arraylist of cities (just the string name). Have methods to add a 
//city, remove a city, to return the names of the cities in a String, and to reverse the order 
//of the elements in the array list.
import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    // add instance variable here
    private ArrayList<String> cities;
    
    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        // Initialize the instance variable
        this.cities=new ArrayList<String>();
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        // Write code to add a city to the array list instance variable
        cities.add(cityName);
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String ex="TripPlan[";
        for (String s:cities) {
            ex+=s+",";
        }
        ex=ex.substring(0, ex.length()-1);
        ex+="]";
        return ex;
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        cities.remove(cityName);
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {
        String temp=new String();        
        for(int i = 0; i < cities.size() / 2; i++)
        {
            temp = cities.get(i);
            cities.set(i, cities.get(cities.size() - i - 1));
            cities.set( (cities.size() - i - 1), temp);
        }      
    }
}