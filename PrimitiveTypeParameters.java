//Example 7-8
//Program illustrating how a formal parameter of a 
//primitive data type works.

public class PrimitiveTypeParameters{

   public static void main(String[] args){
      
      int number = 6;
      
      System.out.println("Line 6: Before calling"
                        + "the method "
                        + "primFormalParam, "
                        + "number = " + number);
      
      primFormalParam(number);
      
      System.out.println("Line 8: After calling " 
                        + "the method "
                        + "primFormalParam, "
                        + "number = " + number);
   } //end main
   public static void primFormalParam(int num){
   
      System.out.println("Line 12: In the method "
                        + "primFormalParam, "
                        + "before changing, num = "
                        + num);
      
      num = 15;
      
      System.out.println("Line 14: In the method "
                        + "primFormalParam, "
                        + "after changing, num = "
                        + num);
   }  //end primFormalParam
}