import java.util.Scanner;

public class WorkDay
{
   static Scanner console = new Scanner(System.in);
   
   static final int SENTINEL = -999;
   
   public static void main(String[] args)
   {
      int hour;
      int workDay = 0;
      int count = 0;
      
      System.out.println("Enter hour by hour each hour you 
                     + "worked, ending with " + SENTINEL);
      
      hour = console.nextInt();
      
      while (hour != SENTINEL)
      {
         count++;
         number = console.nextInt();
      }
      
      System.out.print("The total number of hours worked is: " + count);
   }
}