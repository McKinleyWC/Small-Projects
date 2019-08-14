/*
Will McKinley
3/5/2015
IT 145 R4219
This program prompts the user to
enter an integer, and then outputs
the separate digits and their sum.
*/

import javax.swing.JOptionPane;

public class SeparateDigitsAndTheirSum
{
   public static void main(String[] args)
   {
      String inMess;
      String inStr;
      String outStr1, outStr2, outNeg; 
      int num, length, temp;
      int k;
      int sum;
      
      inMess = "This program will separate\n "
             + "the digits of an integer,\n"
             + "and output the digits and their sum.\n"
             + "Please enter an integer: ";
      
      inStr = JOptionPane.showInputDialog(inMess);
      
      num = Integer.parseInt(inStr);
      
      length = inStr.length ();
      
      outStr1 = "The separate digits of the number you "
              + "entered are: ";
      
      outStr2 = "The sum of the digits is: ";
      
      outNeg = "-";
      
      sum = 0;
      
      
      
      if (num > 0)
      {
         for (k = length; k > 0; k--)
         {
         sum = sum + num % 10;
         num = num / 10;
         }   
      }
      else if (num < 0)
      {
         for (k = length; k > 2; k--)
         {
            num = Math.abs(num);
            sum = sum + num % 10;
            num = num / 10;
         }
         sum = sum + (0 - num);
      }
   if (num > 0)
      JOptionPane.showMessageDialog(null, outStr1 + "\n" + strNum 
                  + "\n" + outStr2 + "\n" + sum, "Separated Numbers and Their Sum", 
                                    JOptionPane.INFORMATION_MESSAGE);
   else if (num < 0)
      JOptionPane.showMessageDialog(null, outStr1 + "\n" + outNeg + strNum 
                  + "\n" + outStr2 + "\n" + sum, "Separated Numbers and Their Sum", 
                                    JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
   }      
   
}