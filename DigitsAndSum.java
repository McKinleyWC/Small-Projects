/*
Will McKinley
3/6/2015
IT 145 R4219
This program prompts the 
user to enter an integer,
then outputs the separated 
digits and their sum.
*/

import java.util.*;

public class DigitsAndSum
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int num, length, i;
      int sum = 0;
      String strNum;
      
      System.out.print("Enter an integer: ");
      
      strNum = console.next();
      num = Integer.parseInt(strNum);
      length = strNum.length();
      
      System.out.print("The digits of the integer are: ");
      
      if (num > 0)
      {
         for (i = 0; i <= (length - 1); i++)
            System.out.print(strNum.charAt(i) + " ");
      }
      else if (num < 0)
      {
         System.out.print("-");
         for(i = 1; i <= (length - 1); i++)
            System.out.print(strNum.charAt(i) + " ");
      }
      
      if (num > 0)
      {
         for (i = length; i > 0; i--)
         {
         sum = sum + num % 10;
         num = num / 10;
         }
      }
      else if (num < 0)
      {
         for (i = length; i > 2; i--)
         {
         num = Math.abs(num);
         sum = sum + num % 10;
         num = num / 10;
         }
         sum = sum + (0-num);
      }
      System.out.print("\nThe sum of the digits is: " + sum);
   }
}