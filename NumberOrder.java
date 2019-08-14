//William McKinley
//3/27/2015
//IT 145 R4219
//This program prompts the user to input three numbers
//into a dialog box,then uses conditional statements to 
//output them in non-descending order.

import javax.swing.JOptionPane;                    //Imports package for class JOptionPane.

public class NumberOrder
{
   public static void main(String[] args)
   {
      String inputStr1;                            
      String inputStr2;
      String inputStr3;
      String outputStr;                            //Declares string variables.
      
      int num1, num2, num3, temp;                  //Declares int variables.
      
      inputStr1 = JOptionPane.showInputDialog
                    ("Please enter a number");     //Prompts user to enter a number and initializes inputStr1.
      inputStr2 = JOptionPane.showInputDialog
             ("Please enter a second number");     //Prompt user to enter a second number and initializes inputStr2.
      inputStr3 = JOptionPane.showInputDialog
              ("Please enter a third number");     //Prompts user to enter a third number and initializes inputStr3.
      
      num1 = Integer.parseInt(inputStr1);          //Initializes num1.
      num2 = Integer.parseInt(inputStr2);          //Initializes num2.
      num3 = Integer.parseInt(inputStr3);          //Initializes num3.
      
      if(num1 >= num2)
      {
         temp = num2;
         num2 = num1;
         num1 = temp;                              //If num1 is larger than num2, they switch.
      }
      if(num2 >= num3)
      {
         temp = num3;
         num3 = num2;
         num2 = temp;                              //If num2 is larger than num3, they switch.
      }
      if(num2 <= num1)
      {
         temp = num2;
         num2 = num1;
         num1 = temp;                              //If num2 is smaller than num1 after the switch
      }                                            // with num3, then num1 and num2 switch.
      
      outputStr = "The numbers in non-descending "
                  + "order are: "
                  + String.format("%n%40d%n%40d%n%40d", num1, num2, num3);     //Initializes outputStr.
                    
      JOptionPane.showMessageDialog(null, outputStr,                      
      "Non-descending Numbers", JOptionPane.PLAIN_MESSAGE);          //Outputs the numbers in non-descending order
                                                                     //within a dialog box.
      System.exit(0);                             //Ends program.                      
                  
   }
}