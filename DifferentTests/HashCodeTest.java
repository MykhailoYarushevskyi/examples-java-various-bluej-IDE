
/**
 * Write a description of class HashCodeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashCodeTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HashCodeTest
     */
    public HashCodeTest()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public static void main(String[] args){
        
        Object obj = new Object();
        System.out.println("1) obj.hashCode() = " + obj.hashCode());
        System.out.println("2) obj.hashCode() = " + obj.hashCode());
        System.out.println("3) obj.hashCode() = " + obj.hashCode());
        System.out.println("4) obj.hashCode() = " + obj.hashCode());
        
    
    }
}
