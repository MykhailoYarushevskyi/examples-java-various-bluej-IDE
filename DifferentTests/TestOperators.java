import java.util.Random;
/**
 * Write a description of class TestOperators here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestOperators
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TestOperators
     */
    public TestOperators()
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
    public boolean instatceofTest()
    {
        Random objRrandom = new Random();
        
        boolean trueFalse = true;
        
        //trueFalse = objRrandom instanceof Math; //!! Error of Compilation: incompatible types: java.util.Random cannot be converted to java.lang.Math
        System.out.println("objRrandom instanceof Math is " + trueFalse);
        trueFalse = objRrandom instanceof Random;
        System.out.println("objRrandom instanceof Random is " + trueFalse);
        trueFalse = objRrandom instanceof Object;
        System.out.println("objRrandom instanceof Object is " + trueFalse);
        
        
        return objRrandom instanceof Random;
    }
    
    public static void main(String[] args)
    {
        TestOperators test = new TestOperators();
        
        // Test operator "instanceof"
        boolean trueOrFalse = test.instatceofTest();
        System.out.println("objRrandom instanceof Random told " + trueOrFalse);
        
        
    }
}
