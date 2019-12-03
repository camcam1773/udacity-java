// Write a class that describes a flower. A flower has a location, a
// constructor and a draw method.
// The flower should look like the picture below:
// http://i.imgur.com/OC4EA29.png

// The constructor takes the (x, y) coordinate of the upper left-hand
// corner of the flower. The arrow points to the x,y coordinates of
// the flower.
 
// There are four pink petals and a yellow center. Each petal and the
// center is a circle with a diameter of 20. A circle is an ellipse in
// which the width and height are both equal to the diameter of the
// circle. The pink circles touch the yellow one.

// The stem is green and is on the center line of the flower. Its
// length is 3 times the diameter.

// When implementing the draw method, I recommend that you start with
// the top petal, figure out its coordinates, instantiate a circle at
// that point with a diameter of 20, and call its draw method.

// Then test. You can create a flower object in BlueJ and invoke its
// draw method. Pick another of the circles; calculate its coordinates;
// instantiate a circle at that location; and. Call its draw method.
// Now test again.

// Note: When drawing an Ellipse, you specify the x, y coordinates and
// the width and height of the rectangle that would surround the
// ellipse. See the video "More about Graphics"

// Here is how you would draw a circle of diameter 20 when the
// surrounding rectangle has x, y coordinates of 30, 50
//      Ellipse circle = new Ellipse(30, 50, 20,20);
//      circle.draw();
//import 
public class Flower
{
    private int x;
    private int y;
   
    public Flower(int theX, int theY)
    {
        x=theX;
        y=theY;        
    }
    
    /**
    * This function draws the flower.
    */
    public void draw()
    {
        int r=20;
        Ellipse ctop = new Ellipse(x+r,y,r,r);
        ctop.setColor(Color.PINK);
        ctop.fill();
        
        Ellipse cleft = new Ellipse(x,y+r,r,r);
        cleft.setColor(Color.PINK);
        cleft.fill();
        
        Ellipse cright = new Ellipse(x+2*r,y+r,r,r);
        cright.setColor(Color.PINK);
        cright.fill();
        
        Ellipse cbottom = new Ellipse(x+r,y+2*r,r,r);
        cbottom.setColor(Color.PINK);
        cbottom.fill();
        
        Ellipse cCenter= new Ellipse(x+r,y+r,r,r);
        cCenter.setColor(Color.YELLOW);
        cCenter.fill();

        Line stem = new Line(x+1.5*r, y+r*3, x+1.5*r, y+r*6);
        stem.setColor(Color.GREEN);
        stem.draw();
    }
}
