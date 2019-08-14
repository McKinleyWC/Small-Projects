/*******************************************
Will McKinley
5/3/2015
IT 145 R4219
This is the definition of class Day and its
members.
*******************************************/

public class Day{

   private String sun = new String("Sunday");         //String objects to hold the strings for each
   private String mon = new String("Monday");         //day of the week.
   private String tues = new String("Tuesday"); 
   private String wed = new String("Wednesday");
   private String thurs = new String("Thursday"); 
   private String fri = new String("Friday");
   private String sat = new String("Saturday");
   private String day;
   private int dayNum, temp;
   public int a = 1;
   public int b = 2;
   public int c = 3;
   public int d = 4;
   public int e = 5;
   public int f = 6;
   public int g = 7;
   
      //Default constructor.
   public Day(){
   
      setDay("");
      dayNum = 0;
      temp = 0;
   }
   
      //Constructor with parameters.
   public Day(String today){
   
      setDay(today);
   }
   
      //Method to set the day.
   public void setDay(String today){
   
      if (sun.equals(today)){
         day = today;
         dayNum = a;
      }
      if (mon.equals(today)){
         day = today;
         dayNum = b;
      }
      if (tues.equals(today)){
         day = today;
         dayNum = c;
      }
      if (wed.equals(today)){
         day = today;
         dayNum = d;
      }
      if (thurs.equals(today)){
         day = today;
         dayNum = e;
      }
      if (fri.equals(today)){
         day = today;
         dayNum = f;
      }
      if (sat.equals(today)){
         day = today;
         dayNum = g;
      }
   }
   
      //Method to print the day.
   public void printDay(){
   
      System.out.println("The day you entered was: " + day);
   }
      
      //Method to return the day.
   public String getDay(){
   
      return day;
   }
   
      //Method to return the next day.
   public String getNextDay(){
      
      temp = dayNum;
      temp++;
      
      if (temp > 7){
         temp = temp -7;
      }
      
      numDay();
      
      return day;
   }
   
      //Method to return the day 
      //after the next day.
   public String getDayAfterNext(){
   
      temp = dayNum;
      temp++;
      temp++;
      
      if (temp > 7){
         temp = temp -7;
      }
     
      numDay();
         
      return day;
   }
   
      //Method to return the day before.
   public String getYesterday(){
   
      temp = dayNum;
      temp--;
      
      if (temp == 0)
         temp = 7; 
      
      
      numDay();
      
      return day;
   }
   
      //Method to return the day 
      //x number of days later.
   public String incrementDay(int x){
      
      temp = dayNum + x;
      
      if (temp > 7) 
         temp = (dayNum + x) % 7;
      
      numDay();       
         
      return day;
   }
   
      //Method to assign a number (int)
      //value to each day of the week.
      //Saves time in each of the incremental 
      //methods of class Day.
      //Saves from unnecessary repitition of code.
   private void numDay(){
   
      if (temp == a)
         day = sun;
      if (temp == b)
         day = mon;
      if (temp == c)
         day = tues;
      if (temp == d)
         day = wed;
      if (temp == e)
         day = thurs;
      if (temp == f)
         day = fri;
      if (temp == g)
         day = sat;
        
   }
}