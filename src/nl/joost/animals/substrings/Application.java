package nl.joost.animals.substrings;


public class Application {

   public static void main(String[] args) {
    
      oefeningMaken();
   }
   
   public static void oefeningMaken() {
      String s = "--0.50";
      String substring = s.substring(1, s.length()-1);
      
      String expectedResult = "-00.50";
      
      if(expectedResult.equals(substring)) {
         System.out.println("Prima, klopt!!!");
      }
      else {
         System.out.println("Dat klopt niet, maak de oefening zelf af!!!!");
         
      }
      
      // Parse het result naar een Double
      double r = Double.parseDouble("");// maak de oefening zelf af.
      
      System.out.println(r);
   }
   
   
   
   

}
