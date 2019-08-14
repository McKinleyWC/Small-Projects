//This program evaluates a decision to stay in bed or
//wake up and go to work on time.

import javax.swing.JOptionPane;

public class WakeUpOrSleepIn
{
   public static void main(String[] args)
   {
      String inStr;
      String outStr;
      
      int wakeUp;
      int leaveForWork;
      
      leaveForWork = 700;
      
      inStr = JOptionPane.showInputDialog
         ("Enter the time you wake up" + "\n"
      + "        in 24 hour format: " + "\n "
            + "(i.e. 7:00a.m. = 700, etc.)");
      
      wakeUp = Integer.parseInt(inStr);
      
      if(wakeUp >= leaveForWork)
      {
         outStr = ("You will be late for work!");
         
         JOptionPane.showMessageDialog (null, outStr,
         "Late for work!", JOptionPane.WARNING_MESSAGE);
      }
      else
         if(wakeUp < 700 && !(wakeUp < 500))
         {
            outStr = ("You will be on time for work!");
         
            JOptionPane.showMessageDialog (null, outStr,
            "On Time!", JOptionPane.INFORMATION_MESSAGE);
         }
         else
            {
               outStr = ("You're up too early, go back to bed!");
                     JOptionPane.showMessageDialog (null, outStr,
                        "Too Early!", JOptionPane.ERROR_MESSAGE);
            }      
      System.exit(0);
   }
}