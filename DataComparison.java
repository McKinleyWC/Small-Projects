/*******************************************************
Author: D.S. Malik
Program: Comparison of class Averages
This program computes and compares the class averages of
two groups of students.
*******************************************************/

import java.io.*;
import java.util.*;

public class DataComparison{

   public static void main(String[] args)
                           throws FileNotFoundException{ 
   
      String courseId1;
      String courseId2;
      
      int numberOfCourses;
      
      double avg1;
      double avg2;
      double avgGroup1;
      double avgGroup2;
      
      Scanner group1 = 
                  new Scanner(new FileReader("group1.txt"));
      Scanner group2 = 
                  new Scanner(new FileReader("group2.txt"));
      
      PrintWriter outfile = new PrintWriter("student.out");
      
      avgGroup1 = 0.0;
      avgGroup2 = 0.0;
      
      numberOfCourses = 0;
      
      outfile.println("Course ID   Group No"
                     + "   Course Average");
                     
      while (group1.hasNext() && group2.hasNext()){
      
         courseId1 = group1.next();
         courseId2 = group2.next();
         
         if (!courseId1.equals(courseId2)){
         
            System.out.println("Data error: Course IDs "
                              + "do not match.");
            System.out.println("program terminates.");
            outfile.println("Data error: Course IDs "
                           + "do not match.");
            outfile.println("Program terminates.");
            outfile.close();
            return;
         }
         else{
         
            avg1 = calculateAverage(group1);
            avg2 = calculateAverage(group2);
            printResult(outfile, courseId1,
                        1, avg1);
            printResult(outfile, courseId2,
                        2, avg2);
            avgGroup1 = avgGroup1 + avg1;
            avgGroup2 = avgGroup2 + avg2;
            outfile.println();
            numberOfCourses++;
         }
      }
      
      if (group1.hasNext() && !group2.hasNext())
         System.out.println("Ran out of data for group 2 "
                           + "before group 1.");
      else if (!group1.hasNext && group2.hasNext());
         
         System.out.println("Ran out of data for "
                           + "group 1 before group 2.");
      else{
      
         outfile.printf("Avg for group 1: %.2f %n,
                     (avgGroup1 / numberOfCourses));
         outfile.printf("Avg for group 2: %.2f %n",
                     (avgGroup2 / numberOfCourses));
      }
      
      group1.close();
      group2.close();
      outfile.close();   
   }
   
   public static double calculateAverage(Scanner inp){
   
      double totalScore = 0.0;
      int numberOfStudents = 0;
      int score = 0;
      double courseAvg;
      
      score = inp.nextInt();
      
   
   }
}