import java.util.*;

public class TestDay{

   static Scanner console = new Scanner(System.in);
   
   public static void main(String[] args){
   
      Day dayObject = new Day();
      String day, day2, day3, day4, day5;
      int x;
      System.out.print("Please enter a day of the week: ");
      day = console.next();
      System.out.println();
      dayObject.setDay(day);
      dayObject.printDay();
      
      System.out.print("Please enter the number of days after "
                        + "the day you entered: ");
      x = console.nextInt();
      System.out.println();
     
      day2 = dayObject.getNextDay();
      day3 = dayObject.getDayAfterNext();
      day4 = dayObject.getYesterday();
      day5 = dayObject.incrementDay(x);
      
      System.out.print("The next day is: " + day2 + "\n"
                      + "The day after next is: " + day3 + "\n"
                      + "The day before was: " + day4 + "\n"
                      + "The day " + x 
                      + " days after is: " + day5);   
   }
}