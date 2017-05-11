package interfaces.test;  
/**
 * Write a description of interface InterfaseTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
interface A
{
    void test();
    public int getvalue(); 
}
 
abstract class B implements A
{
    public void test()
    {
        System.out.println("Ok");
    }
}
class C extends B
{
    public int getvalue()
    {
        return 0;
    }
}
    
