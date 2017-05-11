import java.util.Arrays;

/**
 * Write a description of class Anagram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anagram
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Anagram
     */
    public Anagram()
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
    public static boolean compareForAnagram(String stringforCompareFirst, String  stringforCompareSecond)
    {
        boolean isAnagram = true;
        
        if(null == stringforCompareFirst || null == stringforCompareSecond || stringforCompareFirst.length() != stringforCompareSecond.length()){
            return false;
        }
        char[] charArrayforCompareFirst = stringforCompareFirst.toCharArray();
        char[] charArrayforCompareSecond = stringforCompareSecond.toCharArray();
        
        Arrays.sort(charArrayforCompareFirst);
        Arrays.sort(charArrayforCompareSecond);
        for(int i = 0; i < charArrayforCompareFirst.length; i++){
            if(charArrayforCompareFirst[i] != charArrayforCompareSecond[i]){
                isAnagram = false;
                break;
            }
        }
        
        return isAnagram;
    }
    
    public static void main(String[] args){
        
        String[][] stringForAnagramTest= {
            {"school master", "the classroom"},
            {"мука", "кума"}, {"літо", "тіло"},
            {"anagram", "manager"},
            {"apple", "pilot"},
            {null, "abc"},
            {"def", null},
            {"", ""}
        };
        
        for(int i = 0; i < stringForAnagramTest.length; i++){
            System.out.println("\"" + stringForAnagramTest[i][0] + "\"" + "  and  " +  "\"" + stringForAnagramTest[i][1] + "\"" +
            " is Anagram? : " + compareForAnagram(stringForAnagramTest[i][0], stringForAnagramTest[i][1]));
        }
    }
}
