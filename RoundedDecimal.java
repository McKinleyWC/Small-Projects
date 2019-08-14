import java.util.*;

public class RoundedDecimal
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      System.out.println("Enter a decimal number: ");
      
      double number = console.nextDouble();
      double roundNumber = number + (0.5);
      
      System.out.println("The nearest integer is: "
                        + (int)roundNumber);
   }
}
 