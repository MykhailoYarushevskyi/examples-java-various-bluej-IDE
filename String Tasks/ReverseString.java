
/**
 * Write a description of class ReverseString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseString
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ReverseString
     */
    public ReverseString()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String reverse(String stringForReverse)
    {
        char[]  charArrayForReverse = stringForReverse.toCharArray();
        char charTemp;
        int maxIndexArray = charArrayForReverse.length - 1;
       
        for(int i = 0; i < (int)charArrayForReverse.length/2; i++){
            charTemp = charArrayForReverse[i];
            charArrayForReverse[i] = charArrayForReverse[maxIndexArray - i];
            charArrayForReverse[maxIndexArray - i] = charTemp;
        }
        String stringReversed = new String(charArrayForReverse);
        return stringReversed;
    }
    
    public static void main(String[] args){
        String[] stringForReverse = {
            "123456",
            "123456789",
            "abcdefghi",
            "jklmnoprstuv"
        };
        for(String str : stringForReverse){
            System.out.println(str + " the original string");
            System.out.println(reverse(str) + " the reversing string");
        }
    }
}
