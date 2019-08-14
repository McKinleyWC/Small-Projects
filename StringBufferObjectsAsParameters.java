//This program illustrates how StringBuffer objects as
//parameters work.

public class StringBufferObjectsAsParameters{

   public static void main(String[] args){
   
      StringBuffer str = new StringBuffer("Hello");
      
      System.out.println("Line 6: str before "
                       + "calling the method "
                       + "stringBufferParameter: "
                       + str);
      
      stringBufferParameter(str);
      
      System.out.println("Line 8: str after "
                      + "calling the method "
                      + "stringBufferParameter: "
                      + str);
   }  //end main
   
   public static void stringBufferParameter
                               (StringBuffer pStr){
   
      System.out.println("Line 12: Int the method "
                       + "stringBufferParameter ");
                       
      System.out.println("Line 13: pStr before "
                       + "changing its value: "
                       + pStr);
                       
      pStr.append(" There");
      
      System.out.println("Line 15: pStr after "
                       + "changing its value: "
                       + pStr);
   }  //end stringBufferParameter
}