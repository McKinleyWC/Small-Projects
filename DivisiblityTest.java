//program: Divisibility test by 3 and 9.

import java.util.*;

public class DivisiblityTest
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int num;
      int temp;
      int sum;
      
      System.out.print("Enter a positive integer: ");
      num = console.nextInt();
      System.out.println();
      
      temp = num;
      
      sum = 0;
      
      do
      {
         sum = sum + num % 10;
         
         num = num / 10;
      }
      while (num > 0);
      
      System.out.println("The sum of the digits = " + sum);
      
      if (sum % 3 == 0)
         System.out.println(temp + " is divisible by 3");
      else
         System.out.println(temp + " is not divisible by 3");
         
      if (sum % 3 == 0)
         System.out.println(temp + " is divisible by 9");
      else
         System.out.println(temp + " is not divisible by 9");
   }
}