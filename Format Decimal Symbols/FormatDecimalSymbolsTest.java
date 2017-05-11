import java.text.DecimalFormatSymbols;
/**
 * Write a description of class FormatDecimalSymbolsTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FormatDecimalSymbolsTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FormatDecimalSymbolsTest
     */
    public FormatDecimalSymbolsTest()
    {
    }

    public static void main(String[] args){
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        
        System.out.println("string used to represent infinity      : " + dfs.getInfinity());
        System.out.println("character used for decimal sign        : " + dfs.getDecimalSeparator());
        System.out.println("character used for a digit in a pattern: " + dfs.getDigit());
    }
}
