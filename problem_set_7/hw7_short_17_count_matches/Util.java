//
// Complete this method to return the number of zeros in the int array parameter
//

public class Util
{
    public int getCount(int[] values)
    {
        int count = 0;
        for (int current : values)
        {
            // count the number of zeros
            if (current==0) count++;
        }
        return count;
    }
}
