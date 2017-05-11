import java.util.Scanner;
//import java.io.FileReader;
import java.io.IOException;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Write a description of class URItest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class URItest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class URItest
     */
    public URItest()
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
    public static void main(String[] args) throws IOException,  URISyntaxException
    {

        Scanner inputConsol = new Scanner(System.in);
       
        URI absolute = new URI("http://android.com/");
        URI relative = new URI("robots.txt");
        URI resolved = new URI("http://android.com/robots.txt");

        // print "http://android.com/robots.txt"
        System.out.println(absolute.resolve(relative));

        // print "robots.txt"
        System.out.println(absolute.relativize(resolved));
        
    
    }
}
