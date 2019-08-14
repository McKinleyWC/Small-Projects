import java.util.*;

public class RoundedDecimal_2
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      System.out.println("Enter a decimal number: ");
      
      double num = console.nextDouble();
      double roundNum = Math.round(num);
      
      System.out.println("The closest integer is: " 
                        + (int)roundNum);
   }
}