//William Mckinley
//3/22/2015
//IT 145-R4219
//This program prompts the user to enter the
//mass of a person in kilograms into a dialog
//box, converts the mass in kilograms to pounds,
//and then outputs the results in a dialog box.

import javax.swing.JOptionPane;

public class KilogramsAndPounds
{
   public static void main(String[] args)
   {
      String inputStr;
      String outputStr;
      
      double kilograms;
      double pounds;
      
      inputStr = JOptionPane.showInputDialog
         ("Enter the mass of a person in kilograms");
      kilograms = Double.parseDouble(inputStr);
      
      pounds = kilograms * 2.2;
      
      outputStr = "The person weighs " 
                + String.format("%.2f", pounds) 
                + " pounds" + "\n"
                + "The person's mass is " 
                + String.format("%.2f", kilograms) 
                + " kilograms";
      
      JOptionPane.showMessageDialog(null, outputStr,
                        "Kilograms and Pounds", 
                        JOptionPane.INFORMATION_MESSAGE);
      
      System.exit(0);
   }
}