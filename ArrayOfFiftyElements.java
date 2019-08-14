/******************************************
Will McKinley
4/10/2015
IT 145 R4219
This program creates an array of 50
elements and makes the first 25 elements 
equal to the square of the index variable,
and the last 25 elements equal to three 
times the index variable.
******************************************/

public class ArrayOfFiftyElements
{
   public static void main(String[] args)
   {
      double[] alpha = new double[50];   //declares and instantiates double array alpha set at 50 elements
      int index;                         //declares variables of type int
      int i = 0;
      
      for (index = 0; index < 25; index++)
      {
         alpha[i] = (Math.pow(index, 2));          //for loop to assign the first 25 elements of alpha to
         i++;                                      //the square of variable index
      }
      for (index = 25; index < 50; index++)
      {
         alpha[i] = (index * 3);                   //for loop to assign the last 25 elements of alpha to
         i++;                                      //three times the variable index
      }
      
      for (index = 0; index < alpha.length; index++)
      {
         System.out.print("  " + alpha[index]);             //for loop with embedded if 
                                                            //to format the array alpha into spaced lines
         if ((index + 1) % 10 == 0)                         //of ten numbers of type double each, and prints the array
            System.out.println();
      }
   }
}                                               //end program