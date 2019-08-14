//Will Mckinley
//4/25/2015
//IT 145 R4219
//This program includes a method to reverse the digits of 
//an integer.

import java.util.*;        //imports packages

public class Reverse{
   
   static Scanner console = new Scanner(System.in);         //instantiates a new Scanner console
   
   public static void main(String[] args){
      
      int num, reverseNum;                //declares variables
       
      System.out.println("Enter an integer: ");             //prompts user
      
      num = console.nextInt();
      
      if (num == 10){
         System.out.println("The integer with its "
                           + "digits reversed is: "
                           + "01");                            //accounts for instance of number equals 10
      }
      else
      System.out.println("The integer with its "
                        + "digits reversed is: "
                        + reverseDigit(num));                  //calls method reverseDigit and out puts reversed digits
   }

   //Method to reverse the digits of an integer.
   public static int reverseDigit(int num){
   
      String strNum = Integer.toString(num);          //converts number to String
      int counter, temp;                              //declares variables
      int x = strNum.length();                        //gets length of String
      StringBuffer strNum1 = new StringBuffer();      //calls class StringBuffer      
      
      
      if (num < 10){
         return num;   
      }                             //accounts for number being a single digit
      
      for (counter = x - 1; counter >= 0; counter--){
         
         temp = num % 10;
         num = (num - temp) / 10;
         strNum1.append(temp);
      }                                               //for loop to reverse the digits of the number
         String revStr = strNum1.toString();          //converts StringBuffer back to String
         int revNum = Integer.parseInt(revStr);       //converts String back to int   
         return revNum;                               //returns value achieved by the method
   } //end method reverseDigit
}  //end program