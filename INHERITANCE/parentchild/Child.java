package parentchild;


/**
 * Write a description of class Child here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Child extends Parent
{
    // instance variables - replace the example below with your own
    private int x = 20;
    /* */
    public Child()
    {
        //super();
        foo();
    }
    /* */
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void foo()
    {
        System.out.printf("x=%d",x);
    }
}
