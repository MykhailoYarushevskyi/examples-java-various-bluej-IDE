enum D
{
    A, B, C;
     
    private D()
    {
        System.out.print("*");
    }
}
 
enum Seasons
{
    SPRING, WINTER;
     
    private Seasons()
    {
        System.out.println("ok");
    }
}

enum Demo
{
    DEMO;
     
    int i = 10;
     
    {
        i--;
    }
     
    {
        --i;
    }
     
    private Demo()
    {
        i = i-- + --i;
    }
}

/**
 * Write a description of class EnumTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnumTest
{
    public enum Seasons
    {
        SPRING, WINTER;
    }
    
    /* Error compilation: "enum types must not be local"
    void Test()
    {
        enum Demo
        {
             
        }
    }
    */
    
    public static void main(String[] args)
    {
        // Enum enu = D.B; //print ***
         
        //Seasons seasons = new Seasons(); //Error compilation: "enum types may not be instantiated"
        
        
        /*begin test
        Seasons[] seasons= new Seasons[2];
          for (int i = 0; i  < seasons.length; i++)
        {
            System.out.print(seasons[i]);
        }
        end test */
        
        //System.out.println(EnumTest.Seasons.WINTER); // print WINTER
        
        //System.out.println(new EnumTest().Seasons.WINTER); // Error compilation: unexpected type required: class,package  found:    value
        
        System.out.println(Demo.DEMO.i); //Print: 14

    }
    
}
