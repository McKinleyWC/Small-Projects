import java.util.Scanner;

public class Reading
{
   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      int pages;
      
      for (pages = 1; pages <= 40; pages++)
         System.out.println("Keep reading pages!"
                                    + " " + pages);
         
         System.out.println("You are finished reading!");
   }
}