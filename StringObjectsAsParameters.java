//This program illustrates how String objects as parameters work.

public class StringObjectsAsParameters{

   public static void main(String[] args){
   
      String str = "Hello";
      
      System.out.println("Line 6: str before "
                       + "calling the method "
                       + "stringParameter: " + str);
      
      stringParameter(str);
      
      System.out.println("Line 8: str after "
                       + "calling the method "
                       + "stringParameter: " + str); 
   }  //end main
   
   public static void stringParameter(String pStr){
   
      System.out.println("Line 12: In the method "
                       + "stringParameter");
      System.out.println("Line 13: pStr before "
                       + "changing its value: "
                       + pStr);
      
      pStr = "Sunny Day";
      
      System.out.println("Line 15: pStr after "
                       + "changing its value: "
                       + pStr);
   }  //end stringParameter
}