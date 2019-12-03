import java.io.*;

public class FileOpen
{
    public static void main(String[] args) {
        String fileName="file.txt";
        try {
            InputStreamReader in=
               new InputStreamReader(new FileInputStream(fileName));
            
            System.out.println(in.read());
            in.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }        
    }
    
}
