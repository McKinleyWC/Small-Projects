public class JLabelMethods

public JLabel(String str)
   //Constructor to create a label with left-aligned text specified
   //by str.
   //EX: JLabel lengthL;
   //    lengthL = new JLabel("Enter the length:")
   // Creates the label lengthL with the title Enter the length:

public JLabel(String str, int align)
   //Constructor to create a label with the text specified by str.
   //    The value of align can be any one of the following:
   //    SwingConstants.LEFT, SwingConstants.RIGHT,
   //    SwingConstants.CENTER
   //EX: 
   //    JLabel lengthL
   //    lengthL = new JLabel("Enter the length:", 
   //                         SwingConstants.RIGHT);
   //    The label lengthL is right aligned.

public JLabel(String t, Icon icon, int align)
   //Constructs a JLabel with both text and an icon.
   //The icon is to the left of the text.

public JLabel(Icon icon)
   //Constructs a JLabel with an icon.