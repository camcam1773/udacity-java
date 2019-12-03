//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

import java.util.ArrayList;
import java.awt.Point;

public class Polygon
{
    // provide the required constructor, instance variable, and methods
    private ArrayList<Point> points;
    
    public Polygon() {
        this.points=new ArrayList<Point>();
    }
    
    public void add(Point p) {
        points.add(p);
    }
    
    public double perimeter() {
        double per=0;
        double l=points.get(0).distance(points.get(points.size()-1));        
        per+=l;
        for (int i=1;i<points.size();i++) {
            l=points.get(i).distance(points.get(i-1));
            per+=l;
        }
        return per;
    }
    
    public void draw() {
        int last=points.size()-1;
        Line l=new Line(points.get(0).x, points.get(0).y,points.get(last).x, points.get(last).y);
        l.draw();
        for (int i=1;i<points.size();i++) {
            l=new Line(points.get(i-1).x, points.get(i-1).y,points.get(i).x, points.get(i).y);
            l.draw();
        }
    }
}