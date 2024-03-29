package draft;

// Ignore this class. It is just here so I can test if you implemented the interface correctly
public class InterfaceTester
{
   public static void main(String[] args)
   {
       GeometricSolid blob = new Blob();
       System.out.println(blob.getSurfaceArea());
       System.out.println("Expected: 0.0");
       System.out.println(blob.getVolume());
       System.out.println("Expected: 0.0");
       
       GeometricSolid solid = new Sphere(10.0);
      
       System.out.printf("Volume: %.2f\n",solid.getVolume());
       System.out.println("Expected: 4188.79");
       System.out.printf("SurfaceArea: %.2f\n",solid.getSurfaceArea());
       System.out.println("Expected: 1256.64");       
       
       solid = new Sphere(5.1);
       System.out.printf("Volume: %.2f\n",solid.getVolume());
       System.out.println("Expected:  555.65");
       System.out.printf("SurfaceArea: %.2f\n",solid.getSurfaceArea());
       System.out.println("Expected: 326.85"); 
       
       solid  = new Cube(5.0);
       System.out.printf("Volume: %.2f\n",solid.getVolume());
       System.out.println("Expected: 125.00");
       System.out.printf("SurfaceArea: %.2f\n",solid.getSurfaceArea());
       System.out.println("Expected: 150.00");    

       solid  = new Cube(3.0);
       System.out.printf("Volume: %.2f\n",solid.getVolume());
       System.out.println("Expected: 27.00");
       System.out.printf("SurfaceArea: %.2f\n",solid.getSurfaceArea());
       System.out.println("Expected: 54.00"); 
   }
}
