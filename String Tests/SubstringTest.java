
/**
 * Write a description of class SubstringTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubstringTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SubstringTest
     */
    public SubstringTest()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    static String middle(String s, int positionBegin, int positionEnd)
    {
        if(positionEnd > s.length()-1){
            positionEnd = s.length()-1;
        }
        return s.substring(positionBegin, positionEnd);
    }
    
    static String  rest(String s, int positionBegin){
        return s.substring(positionBegin);
    }
    
    static char oneElement(String s, int position){
        return s.charAt(position);
    }
    
    static int length(String s){
        return s.length();
    }
    
    public static void main(String[] args){
        String str = "Good day. How do you do?";
        System.out.println("length of the " + str + " is " + length(str) + " chars");
        System.out.println("======= static char oneElement(String s, int position) =======");
        for(int i = 0; i < str.length(); i++){
            System.out.print(oneElement(str, i) + " ");
        }
        System.out.println();
        System.out.println("======= static String middle(String s, int positionBegin, int positionEnd) =======");
        for(int i = 0; i < str.length()/2; i++){
            System.out.println(middle(str, i, str.length()-i));
        }
        System.out.println("======= static String  rest(String s, int positionBegin =======");
        for(int i = 0; i < str.length(); i++){
            System.out.println(rest(str, i));
        }
    }
    
}
