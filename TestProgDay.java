/************************************
Will McKinley
5/3/2015
IT 145 R4219
This program uses GUI class JFrame
and class JOptionPane to test class
Day.
************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

   //Class extends JFrame to test class Day
   //and its methods.
public class TestProgDay extends JFrame{

   private static int x; 
   private static String day;
   
   private static String strDay, strDay1, strDay2, strDay3;
   private static String calc;
  
   private JLabel dayL, calcDayL;
   private static JTextField dayTF, calcDayTF;
   private JButton executeB, exitB;
   
   private ExecuteButtonHandler ebHandler1;
   private ExitButtonHandler ebHandler2;
   
   private static final int WIDTH = 600;
   private static final int LENGTH = 250;
   
      //Default method to initialize GUI 
      //components.
   public TestProgDay(){
    
      setTitle("Days of the Week");
      
      dayL = new JLabel("Enter a day: ", SwingConstants.RIGHT);
      calcDayL = 
         new JLabel("Enter the number of days after the first day: ",
                                           + SwingConstants.RIGHT);
      
      dayTF = new JTextField(9);
      calcDayTF = new JTextField(10);
      
      executeB = new JButton("Execute");
      ebHandler1 = new ExecuteButtonHandler();
      executeB.addActionListener(ebHandler1);
      
      exitB = new JButton("Exit");
      ebHandler2 = new ExitButtonHandler();
      exitB.addActionListener(ebHandler2);
      
      Container pane = getContentPane();
      pane.setLayout(new GridLayout (3, 2));
      
      pane.add(dayL);
      pane.add(dayTF);
      pane.add(calcDayL);
      pane.add(calcDayTF);
      pane.add(executeB);
      pane.add(exitB);
         
      setSize(WIDTH, LENGTH);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
      //Inner class to handle the exit button.
   private class ExitButtonHandler implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
      
         System.exit(0);
      }
   }
   
      //Inner class to hande the execute button.
   private class ExecuteButtonHandler implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
      
         x = Integer.parseInt(calcDayTF.getText());
         day = dayTF.getText();
         
            //Insantiates new object of class Day.
         Day dayObject = new Day();
      
         dayObject.setDay(day);                       //Sets the day.
      
         strDay = dayObject.getDay();                 //Gets the day.
         strDay1 = dayObject.getNextDay();            //Gets next day.   
         strDay2 = dayObject.getDayAfterNext();       //Gets day after next.
         strDay3 = dayObject.getYesterday();          //Gets day before.
         calc = dayObject.incrementDay(x);            //Increments day x number of days.
            
            //Outputs the results of the program in a JOptionPane window. 
         JOptionPane.showMessageDialog(null, "The day you entered is " + strDay + "\n"
                                      + "The next day is " + strDay1 + "\n" 
                                      + "The day after that is " + strDay2 + "\n"
                                      + "The day before was " + strDay3 + "\n"
                                      + "The day " + x + " days after is " 
                                      + calc, "Days of the Week", JOptionPane.INFORMATION_MESSAGE); 
      }
   }
   
      //Method main, insantiating a new object.
   public static void main(String[] args){
   
      TestProgDay testObj = new TestProgDay();   
   }
}