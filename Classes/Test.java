
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    
    
    
    public static void main(String[] args)
    {
        System.out.println("InnerClass.i = " + new TestNested.InnerClass().i); // obviously,int i (access modifier privat-package) visible in same package 
    }
    
}
