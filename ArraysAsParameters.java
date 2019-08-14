//This program illustrates how arrays are passed as parameters
//to methods.

import java.util.*;

public class ArraysAsParameters
{
   static final int ARRAY_SIZE = 10;
   
   public static void main(String[] args)
   {
      int[] listA = new int[ARRAY_SIZE];
      int[] listB = new int[ARRAY_SIZE];
      
      System.out.print("Line 9: listA elements: ");
      
         //output the elements of listA using
         //the method printArray
      OneDimArrayMethods.printArray(listA,
                                    listA.length);
      System.out.println();
      
      System.out.print("Line 12: Enter " + listA.length
                     + "integers: ");
      
         //input data into listA using the method fillArray
      OneDimArrayMethods.fillArray(listA, 
                                   listA.length);
      System.out.println();
      
      System.out.print("Line 15: After filling "
                     + "listA, the elements are:"
                     + "\n        ");
      
         //output the elements of listA
      OneDimArrayMethods.printArray(listA,
                                    listA.length);
      System.out.println();
      
         //find and output the sum of the elements of listA
      System.out.println("Line 18: The sum of the "
                  + "elements of listA is: "
                  + OneDimArrayMethods.sumArray(listA,
                                    listA.length));
      
         //find and output the position of the (first)
         //largest element in lisA
      System.out.println("Line 19: The position of "
               + "the largest element in "
               + "listA is: "
               + OneDimArrayMethods.indexLargestElement
                            (listA, listA.length));
      
         //find and output the largest element in listA
      System.out.println("Line 20: The largest element "
          + "in listA is: "
          + listA[OneDimArrayMethods.indexLargestElement
                             (listA, listA.length)]);
      
         //copy the elements of listA into listB
         //using the method copyArray
      OneDimArrayMethods.copyArray(listA, 0, listB, 0,
                                   listA.length);
      System.out.print("Line 22: After copying the "
                 + "elements of listA into listB\n"
                 + "         listB elements are: ");
      
         //output the elements of listB
      OneDimArrayMethods.printArray(listB,
                                    listB.length);
      System.out.println();
   }  //end main
}