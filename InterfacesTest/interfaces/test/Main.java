package interfaces.test;


/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public Main()
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
    
    public static void main(String[] args)
    {
       A bImplementsA = new C(); 
       System.out.println("Invoked method (A bImplementA = new C()) bImplementA.test(). Rezult: ");
       bImplementsA.test();
       System.out.println("bImplementA.getvalue() returned " + bImplementsA.getvalue()); 
       Main objMain = new Main();
       System.out.println("objMain.sampleMethod(10): " + objMain.sampleMethod(10));
    }
    
}
