public class JTextFieldMethods

public JTextField(int columns)
   //Constructor to set the size of the text field.
   
public JTextField(String str)
   //Constructor to initialize the object with the text specified
   //by str.

public JTextField(String str, int columns)
   //Constructor to initialize the object with the text specified
   //by str and to set the size of the text field.

public void setText(String str)
   //Method to set the text of the text field to the string specified
   //by str.

public String getText()
   //Method to return the text contained in the text field.

public void setEditTable(boolean b)
   //If the value of the boolean variable b is false, the user cannot
   //type in the text field.
   //In this case, the text field is used as a tool to display 
   //the result.
   
public void setActionListener(ActionListener obj)
   //Method to register a listener object to a JTextField.
   