
public class CountryNameTester
{
   public static void main(String[] args)
   {
       CountryNames tester = new CountryNames();
       System.out.println(tester.getCompleteName("Albanie"));
       System.out.println("Expected: l'Albanie");
       System.out.println(tester.getCompleteName("Pays-Bas"));
       System.out.println("Expected: les Pays-Bas");
       System.out.println(tester.getCompleteName("Inde"));
       System.out.println("Expected: l'Inde");
       System.out.println(tester.getCompleteName("Belize"));
       System.out.println("Expected: le Belize");
       System.out.println(tester.getCompleteName("Barbade"));
       System.out.println("Expected: la Barbade");
       System.out.println(tester.getCompleteName("Bolivie"));
       System.out.println("Expected: Bolivie");
   }
}