package parentchild;
/**
 * Write a description of class Parent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Parent
{
    // instance variables - replace the example below with your own
    protected int x = 10;

    /**
     * Constructor for objects of class Parent
     */
    public Parent()
    {
        // initialise instance variables
        foo();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void foo()
    {
        // put your code here
        System.out.printf("x = %d", x);
    }
}
