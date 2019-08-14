public class JFrameMethods 

public JFrame()
   //Used when an object of type JFrame is
   //instantiated and the window is created
   //without any title.
   //EX: JFrame myWindow = new JFrame();
   //    myWindow is a window with no title.
   
public JFrame(String s)
   //Used when an object of type JFrame is
   //instantiated and the title specified 
   //by the string s.
   //EX: JFrame myWindow = new JFrame("Rectangle");
   //    myWindow is a window with the title Rectangle.

public void setSize(int w, int h)
   //Method to set the size of the window.
   //EX: The statement
   //    myWindow.setSize(400, 300);
   //    sets the width of the window to 400 pixels and
   //    the height to 300 pixels.
   
public void setTitle(String s)
   //Method to set the title of the window.
   //EX: myWindow.setTitle("Rectangle");
   //    sets the title of the window to Rectangle.

public void setVisible(boolean b)
   //Method to display the window in the program. If the value of b is 
   //true, the window will be displayed on the screen.
   //EX: myWindow.setVisible(true);
   //    After this statement executes, the window will be shown 
   //    during program execution.

public void setDefaultCloseOperation(int operation)
   //Method to determine the action to be taken when the user clicks
   //on the window closing button, x, to close the window.
   //Choices for the parameter operation are named constants -
   //EXIT_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, and
   //DO_NOTHING_ON_CLOSE. The named constant EXIT_ON_CLOSE is defined
   //in the class JFrame. THe last three named constants are defined in 
   //javax.swing.WindowConstants.
   //EX: The statement
   //    setDefaultCloseOperation(EXIT_ON_CLOSE);
   //sets the default close option of the window closing to close the 
   //window and terminate the program when the user clicks the
   //window closing button, x.

public void addWindowListener(WindowEvent e)
   //Method to register a window listener object to a JFrame. 