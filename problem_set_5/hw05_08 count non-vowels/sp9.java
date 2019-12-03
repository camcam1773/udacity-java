
public class sp9
{      
    public static void main(String[] args)
    {
        int n=1,sum=1;
        
        do {
            sum+=n;
            n++;
        } while(sum>10*n);
        
        System.out.println(sum);
    }
}
