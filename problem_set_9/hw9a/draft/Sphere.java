package draft;

// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// complete the code so that Shpere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Sphere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    //other methods
    public double getSurfaceArea() {
        return Math.PI*4*Math.pow(radius, 2);
    }    
    public double getVolume() {
        return Math.PI*4*Math.pow(radius, 3)/3;
    }

}
