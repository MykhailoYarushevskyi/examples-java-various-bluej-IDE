import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ClassClassTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClassClassTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ClassClassTest
     */
    public ClassClassTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args){
        /*
           The following example uses a Class object to print the class name of an object:

        void printClassName(Object obj) {
            System.out.println("The class of " + obj +
                               " is " + obj.getClass().getName());
        }
     

        It is also possible to get the Class object for a named type (or for void) using a class literal. See Section 15.8.2 of The 
        Java™ Language Specification. For example:

        System.out.println("The name of class Foo is: "+Foo.class.getName()); 
        */
                
        //Test a method getClass() for taking object of class Class, that assiciated with object's class. And then farther we get a name of this class 
        String objS = new String("Hello, I am an object of class String");
        System.out.println("It is the object '" + objS + "'. And Name of my class is (objS.getClass().getName()) the " + objS.getClass().getName());
        System.out.println("And if we using literal 'class' for class String, the name of a class is same: " + String.class.getName());   
        
        //Is identical a class name, that I got from the methods 'obj.getClass().getName()' and a class name, that I got from the methods ''class name'.class.getName()'?
        List objList = new ArrayList();
        System.out.println("It is the object '" + objList + "' . Name of class for objList is: " + objList.getClass().getName());
        System.out.println("And if we using literal 'class' for class " + objList.getClass().getName()+ ", the name of a class is same: " + ArrayList.class.getName());
        boolean isEqualClassName = objList.getClass().getName().equals(ArrayList.class.getName());
        int compareClassName = objList.getClass().getName().compareTo(ArrayList.class.getName());
        System.out.format("Is identical a class name, that I got from the methods 'obj.getClass().getName()' ");
        System.out.format("and a class name, that I got from the methods 'class name'.class.getName()? \n'isEqualClassName' = %b, 'compareClassName' = %d\n", isEqualClassName,compareClassName);
        
    }
}
