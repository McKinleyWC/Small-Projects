/*********************************
Will Mckinley
3/11/2015
IT 145 R2419
This program prompts the user to enter
the miles they ran for each of the last
ten weeks, calculates the list length, 
the sum of miles run total through the 
ten weeks, and the average miles run 
each week.
**********************************/

import java.util.*;

public class RunnerMiles
{
   static Scanner console = new Scanner(System.in);      
   //instantiates new Scanner console
   
   public static void main(String[] args)
   {
      double[] runMiles = new double[10];     
      //declares and instantiates new double array
      int index;              
      double sum, avg;
      //declares variables
      
      System.out.print("Please enter miles run "
                     + "for each of the last ten weeks" + "\n"
                     + "(separated by spaces: ");
      for (index = 0; index < runMiles.length; index++)
         runMiles[index] = console.nextDouble();            
         //prompts user to enter miles run
      
      System.out.println(); 
      
      System.out.println("When the index of the array is 2, " + "\n"
                     + "the element value is: " + runMiles[2]);     
                     //outputs the value of the element at index = 2
      
      System.out.println("The length of array runMiles is: " 
                                                + runMiles.length);     
                  //outputs the list length of array runMiles
                                                
      sum = 0;
      
      for (index = 0; index < runMiles.length; index++)
         sum = sum + runMiles[index];                          
         //calculates the sum of the values of the array
      
      if (runMiles.length != 0)
         avg = sum / runMiles.length;
      else
         avg = 0.0;                         
         //calculates the average of the values of the array
      
      System.out.print("The sum of the miles run is: " + sum + "\n"
                     + "The average of the miles run is: " + avg + "\n");
      
      boolean found = false;
      int i = 4;
      //declares and initiates a boolean and an int value
      for (index = 0; index < runMiles.length; index++)
      {
         if(runMiles[index] == i)
         {
            found = true;
            break;
         }
      }//for loop to determine if the value is in the array
      if (found)
      {
         System.out.println("The value " + i + " is in the array "
                           + "at index " + index + ".");
      }
      else
      {
         System.out.println("The value " + i + " is not in the "
                                                     + "array.");
      }//if...else loop to determine what to print as output
   }
}           //end program

