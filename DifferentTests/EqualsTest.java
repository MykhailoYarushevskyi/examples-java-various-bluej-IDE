
/**
 * Write a description of class EqualsTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class T{}

public class EqualsTest {

    public static void main(String[] args) {

        T t = new T();

        T t1 = new T();
        // WHY FALSE? T class used hashCode() and equals() with base class Object.
        //But hashCode() genereted hash code of object, as int value of address this object. And two object with different addresses will be not equal
        System.out.println("t equals t1: " + t.equals(t1)); //  FALSE
        
        System.out.println("object t = " + t);
        System.out.println("object t1 = " + t1);
        
        String s = new String("abc");
        String s1 = new String("abc");
        System.out.println("s equals s1: " + s.equals(s1)); // TRUE. Class String is override methods hashCode() and equals()
        System.out.println("object s = " + s);
        System.out.println("object s1 = " + s1);
        
    }

}