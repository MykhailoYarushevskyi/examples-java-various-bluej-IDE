
/**
 * Write a description of class SplitTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SplitTest
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
    public static void main(String[] args) {
		double doubParseResult = 0.0;
		String strToNumber = "12 2 3 4 * 10.5 5 / + * +"; //12 2 3 4 * 10 5 / + * +
		String[] resultSplit;
		
		resultSplit = strToNumber.split(" ");
		for(String subStr : resultSplit){
		    boolean isSubStrCorrect = subStr.matches("((-|\\+)?\\d+\\.?(\\d+)?)|(\\+)|(-)|(\\*)|(/)");
		    //System.out.println("Are the proper symbols in the input string \"" + subStr + "\" ? :" + isSubStrCorrect);
		    if(!isSubStrCorrect){
		        //throw new RPNParserException(); throw exception - not proper symbol in the input string
		        System.out.println("throw new RPNParserException(); throw exception - not proper symbol in the input string");
		    }
		    else if(subStr.matches("(-|\\+)?\\d+\\.?(\\d+)?")){  //as well works: else if(subStr.matches("^-*\\d+(\\.\\d+)*$"))  
		        doubParseResult = Double.parseDouble(subStr);
		        System.out.println("substring \"" + subStr + "\" converted in double type and  = " + doubParseResult);
		    }
		    else if(subStr.matches("(\\+)|(-)|(\\*)|(/)")){        //as well works: else if(subStr.matches("^[+\\-*/]$"))
		        System.out.println("substring \"" + subStr + "\" is operator type.");
		    }
		}
        // "^-*\\d+(\\.\\d+)*$" - число положительное или отрицательное с дробной частью или без нее.
        // "^[+\\-*/]$" - операторы.
		/*
	    resultSplit = strToNumber.split(""); //!!! with "" return an array of all symbols from string  
	    System.out.println("resultSplit.length = " + resultSplit.length);
	    for(String subStr : resultSplit){
		    System.out.println(subStr);
	    }
	    */
    }
}
