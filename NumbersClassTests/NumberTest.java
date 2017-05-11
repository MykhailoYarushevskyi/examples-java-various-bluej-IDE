import java.io.*;
import java.util.Scanner;
import java.util.*;
/**
 * A description of class NumberTest here.
 * Tests for objects of class Number and other numbers types
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberTest
{
    // instance variables - replace the example below with your own
    private int x;
    public static Scanner inputCon = new Scanner(System.in);
    /**
     * Constructor for objects of class NumberTest
     */
    public NumberTest()
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
    public static void main(String[] arhs)
    {
        
        Number[] nm_array = {0,0,0};
        Number nm = 0;
        String number_str = "";
        int number_int = 0;
        float number_f = 0;
        double number_db = 0;
        int nm_int = 0;
        float nm_float = 0;
        double nm_double = 0;
                
        System.out.print("Input string for number: ");
        number_str = inputCon.nextLine();
        System.out.print("Input int number: ");
        //number_int = inputCon.nextInt();
        nm_array[0] = inputCon.nextInt();        
        //Attention! For correct input from the console number of double or float you must use format 123,5 (non 123.5) 
        System.out.print("Input double number: ");
        nm_array[1] = inputCon.nextDouble();
        System.out.print("Input float number: ");
        nm_array[2] = inputCon.nextFloat();
        
        for (int i = 0; i < nm_array.length; i++){
            nm = nm_array[i];
            nm_int = nm.intValue();
            nm_float = nm.floatValue();
            nm_double = nm.doubleValue();
            System.out.println("Number (Double) value = " + nm + "; int = " + nm_int + "; float = " + nm_float + "; double = " + nm_double);
        
        }
        Integer value_int;
        value_int = nm.intValue();
        System.out.println( "Integer = " + value_int);
        
    
    }
}
