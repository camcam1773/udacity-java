// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");

        System.out.print("Added redness: ");
        Scanner redInput= new Scanner(System.in);
        int reddenValue=redInput.nextInt();        
        
        pic.draw();
        
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(reddenValue); 
            pic.setColorAt(i, c);
        }
    }
}
