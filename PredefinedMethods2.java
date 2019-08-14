//How to use predefined methods.

import static java.lang.Math.*;
import static java.lang.Character.*;

public class PredefinedMethods2{
   public static void main(String[] args){
      
      int x;
      double u;
      double v;
      
      System.out.println("Line 1: Uppercase a is "
                        + toUpperCase('a'));
      
      u = 4.2;
      v = 3.0;
      
      System.out.printf("Line 4: %.1f to the power "
                      + "of %.1f = %.2f%n",
                         u, v, pow(u, v));
      
      System.out.printf("Line 5: 5 to the power of "
                      + "4 = %.2f%n", pow(5, 4));
      
      u = u + Math.pow(3, 3);
      System.out.printf("Line 7: u = %.2f%n", u);
      
      x = -15;
      System.out.printf("Line 9: The absolute value "
                      + "of %d = %d%n", x, abs(x));
   }
}