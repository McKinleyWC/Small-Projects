/*****************************************
WillMcKinley
4/18/2015
IT 145 R4219
This program takes four test scores and 
their weights, calculates the weighted 
scores, and takes their average. The input
and output of the program is done with a 
GUI window.
*****************************************/

//Imports needed packages.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

      //Creates class WeightedAvg on top of JFrame.       
public class WeightedAvg extends JFrame{

         //Declares reference variables of various types.
   private JLabel space1, space2, space3, score, weight, 
                  testS1, testS2, testS3, testS4, wghtAvgS;
         
   private JTextField testTF1, testTF2, testTF3, testTF4,
                      wghtTF1, wghtTF2, wghtTF3, wghtTF4,
                      wghtAvgTF;
         
   private JButton calculateB, exitB;
         
   private CalcButtonHandler cbHandler;
   private ExitButtonHandler ebHandler;
         
   private static final int WIDTH = 650;
   private static final int HEIGHT = 300;
         
   
   public WeightedAvg(){
      
            //Sets the title of the window.
      setTitle("Weighted Test Scores");
      
            //Creates the labels.
      space1 = new JLabel(" ", SwingConstants.RIGHT);
      
      space2 = new JLabel(" ", SwingConstants.RIGHT);
      
      space3 = new JLabel(" ", SwingConstants.RIGHT);
      
      score = new JLabel("Score", SwingConstants.CENTER);
      
      weight = new JLabel("Weight", SwingConstants.CENTER);
      
      testS1 = new JLabel("Enter the first test score: ", 
                                       SwingConstants.RIGHT);
      testS2 = new JLabel("Enter the second test score: ",
                                       SwingConstants.RIGHT);
      testS3 = new JLabel("Enter the third test score: ",
                                       SwingConstants.RIGHT);
      testS4 = new JLabel("Enter the fourth test score: ",
                                       SwingConstants.RIGHT);
      wghtAvgS = new JLabel("Average of weighted test scores: ",
                                          SwingConstants.RIGHT);
                                          
            //Creates the text fields.
      testTF1 = new JTextField(5);
      testTF2 = new JTextField(5);
      testTF3 = new JTextField(5);
      testTF4 = new JTextField(5);
      wghtTF1 = new JTextField(5);
      wghtTF2 = new JTextField(5);
      wghtTF3 = new JTextField(5);
      wghtTF4 = new JTextField(5);
      wghtAvgTF = new JTextField(5);
      
            //Creates the calculate button.
      calculateB = new JButton("Calculate");
      cbHandler = new CalcButtonHandler();
      calculateB.addActionListener(cbHandler);
            //Creates the exit button.
      exitB = new JButton("Exit");
      ebHandler = new ExitButtonHandler();
      exitB.addActionListener(ebHandler);
      
            //Get the container.
      Container pane = getContentPane();
            //Set the layout.
      pane.setLayout(new GridLayout(7, 3));
      
            //Add GUI components.
      pane.add(space1);
      pane.add(score);
      pane.add(weight);
      pane.add(testS1);
      pane.add(testTF1);
      pane.add(wghtTF1);
      pane.add(testS2);
      pane.add(testTF2);
      pane.add(wghtTF2);
      pane.add(testS3);
      pane.add(testTF3);
      pane.add(wghtTF3);
      pane.add(testS4);
      pane.add(testTF4);
      pane.add(wghtTF4);
      pane.add(wghtAvgS);
      pane.add(wghtAvgTF);
      pane.add(space2);
      pane.add(calculateB);
      pane.add(space3);
      pane.add(exitB);
      
            //Sets the size of the window and display it.
      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
         //Creates a class on top of ActionListener to handle the 
         //calculate button.
   private class CalcButtonHandler implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
         
         double t1, t2, t3, t4, wt1, wt2, wt3, wt4,
                average;
         
         t1 = Double.parseDouble(testTF1.getText());
         t2 = Double.parseDouble(testTF2.getText());
         t3 = Double.parseDouble(testTF3.getText());
         t4 = Double.parseDouble(testTF4.getText());
         wt1 = Double.parseDouble(wghtTF1.getText());
         wt2 = Double.parseDouble(wghtTF2.getText());
         wt3 = Double.parseDouble(wghtTF3.getText());
         wt4 = Double.parseDouble(wghtTF4.getText());
         
         average = (t1 * wt1) + (t2 * wt2) + (t3 * wt3) + (t4 * wt4);
         
         wghtAvgTF.setText(" " + average);
      }
   }
   
         //Creates a class on top of ActionListener to handle the 
         //exit button.
   private class ExitButtonHandler implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
      
      System.exit(0);
      }
   }
   
         //Main method which calls the WeightedAvg class.
   public static void main(String[] args){
   
      WeightedAvg weightObject = new WeightedAvg();
   }
}