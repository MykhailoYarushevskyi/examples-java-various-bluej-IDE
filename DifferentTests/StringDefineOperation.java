
/**
 * Write a description of class StringDefineOperation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringDefineOperation
{
    // instance variables - replace the example below with your own
    private int x;
    static int age;

    /**
     * Constructor for objects of class StringDefineOperation
     */
    public StringDefineOperation()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args){
         boolean thisTest;
        
        thisTest = false;
        if(thisTest){
            String word = new String("w");
            System.out.format("1) %s ; length = %d\n",word, word.length()); //1) w ; length = 1
            word = 'w' + "o" + "r";
            System.out.format("2) %s ; length = %d\n",word, word.length()); //2) wor ; length = 3
            //word = 'w' + 'o' + 'r'; //ERROR: incompatible types: int cannot be converted to java.lang.String
            word = 'w' + 'o' + "r"; //obviously, when we use of sum variable type char, then arithmetic sum 'w' + 'o' is converted to String
            System.out.format("3) %s ; length = %d\n",word, word.length()); //3) 230r ; length = 4
            System.out.println("3p) " + word + " ;   length = " + word.length()); //3p) 230r ;   length = 4
            word = "w" + 'o' + "r" + 'd';
            System.out.format("4) %s ; length = %d\n",word, word.length()); //4) word ; length = 4
            
            System.out.println("END OF TEST of String concatenating");
             
            age = age + 1;
            System.out.println("your age are " + age + "  years");
        }
        thisTest = true;
        if(thisTest){
            String str1="Hello";
            String str2="World";
            String str3=str1+str2;
            String str4="HelloWorld";
            System.out.println(str3 == str4); //false
            // but
            System.out.println(str3.intern() == str4); //true
            
            System.out.println("abc.charAt(0) : " + "abc".charAt(0) + ";   \"abc\".length : " + "abc".length());
            String s1 = new String("abc");
            String s2 = "abc";
            System.out.println("s1 = new String(\"abc\"); s2 = \"abc\"; s1 == s2 : rezult = " + (s1 == s2)); // false
            String s11 = "abc";
            String s12 = "abc";
            System.out.println("s11 = \"abc\"; s12 = \"abc\"; s11 == s12 : result = " + (s11 == s12)); // true
            
            
        }
        
    }
}
