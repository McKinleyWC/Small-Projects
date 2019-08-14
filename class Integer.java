class Integer
//Some members of class Integer.

//NAMED CONSTANTS
public static final int MAX_VALUE = 2147483647;
public static final int MIN_VALUE = -2147483648;

//CONSTRUCTORS
public Integer(int num)
   //Creates an object initialized to the values specified
   //by num.
   
public Integer(String str)
   //Creates an object initialized to the value specified
   // by the num contained in str.

//METHODS
int compareTo(Integer anotherInteger)
   //Compares two Integer objects numerically.
   //Returns the value 0 if the value of this Inteer object is
   //equal to the value of anotherInteger object, a value less
   //than 0 if the value of this Integer is less than the value of 
   //anotherInteger object, and a value greater than 0 if the value 
   //of this Integer is greater than the value of
   //anotherInteger object.

public int intValue()
   //Returns the value of the object as an int value.
   
public double doubleValue()
   //Returns the value of the object as a double value.

public boolean equals(Object obj)
   //Returns true if the value of this object is equal
   //to the value of the object specified by obj;
   //otherwise returns false.

public static int parseInt(String str)
   //Returns the value of the number contained in str.

public String toString()
   //Returns the int value,of the object, as a string.
   
public static String toString(int num)
   //Returns the value of num as a string.

public static Integer valueOf(String str)
   //Returns an Integer object initialized to the value
   //specified by str.