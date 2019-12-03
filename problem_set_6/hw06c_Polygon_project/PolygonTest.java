import java.awt.Point;

public class PolygonTest
{
 
    public static void main(String[] args)
    {
       
       Polygon shape = new Polygon();
       shape.add(new Point(0, 0));
       shape.add(new Point(0, 30));
       shape.add(new Point(40, 30));
       System.out.println(shape.perimeter());
       System.out.println("Expected: 120");
       shape.draw();
    }
}
