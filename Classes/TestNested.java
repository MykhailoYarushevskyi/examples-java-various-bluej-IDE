
/**
 * Write a description of class TestNested here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestNested
{
    
    /* =============Illegal static declaration in inner class B
    modifier 'static' is only allowed in constant variable declarations
    
    void test()
    {
        class B
        {
            static void demo(){ }
        }
    }
    */
   
    /* ===============Illegal static declaration in inner class TestNested.B
    modifier 'static' is only allowed in constant variable declarations
    
     class B
    {
        static void test()
        {
            System.out.println("ok");
        }
    }
    */  
   
      static class InnerClass
    {
        int i = 125;
    }    

    
    public static void main(String[] args)
    {
        System.out.println("InnerClass.i = " + new TestNested.InnerClass().i);
        //System.out.println("InnerClass.i = " + TestNested.InnerClass.i); //Error cmpilation: non-static variable i cannot be referenced from a static context
        
    }
}
