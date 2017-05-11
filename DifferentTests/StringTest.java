import java.util.Properties;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class StringTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringTest
     */
    public StringTest()
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
        Properties propList = new Properties();
        propList = System.getProperties();
        System.out.println("Properties propList= " + propList);
        
        String osName = "";
        osName = System.getProperty("os.name", "not Property");
        if("Windows".equals(osName.substring(0,7)))System.out.println("osName= " + osName + " - I am using Os Windows");
        else System.out.println("osName= " + osName + " - I am not expect my Os");
        
        
    }
    
}
