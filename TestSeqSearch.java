//This program illustrates how to use a sequential search in a 
//program.

import java.util.*;

public class TestSeqSearch
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int[] intList = new int[10];
      int number;
      int index;
      
      System.out.println("Line 10: Enter "
                     + intList.length + " integers.");
      
      for (index = 0; index < intList.length; index++)
          intList[index] = console.nextInt();
      
      System.out.println();
      
      System.out.print("Line 14: Enter the number "
                     + "to be searched: ");
      number = console.nextInt();
      System.out.println();
      
      index = OneDimArrayMethods.seqSearch(intList,
                             intList.length, number);
      
      if (index  != -1)
          System.out.println("Line 19: " + number
                           + " is found at position "
                           + index);
      else
          System.out.println("Line 21: " + number
                         + " is not in the list.");
   }
}