package parentchild;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Parent pch = new Child();");
        Parent pch = new Child();
        pch.foo();
        System.out.println();
        
        System.out.println("Parent pp = new Parent();");
        Parent pp = new Parent();
        pp.foo();
        System.out.println();
        
        System.out.println("Child chch = new Child();");
        Child chch = new Child();
        chch.foo();
        System.out.println();
        
        System.out.println("Child chp = new Parent(); ** Compilation Eror **");
        /* Cpmpilation Error 
        Child chp = new Parent(); 
        chp.foo();
        System.out.println();
        */
    }
}
