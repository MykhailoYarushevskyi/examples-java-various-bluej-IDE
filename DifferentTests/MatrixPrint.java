
/**
 * Write a description of class MatrixPrint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrixPrint
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MatrixPrint
     */
    public MatrixPrint()
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
    public static void main(String[] args)
    {
        String[][] arrayMatrix = new String[][]{{" *", " 2", " 3", " 4", " *"},{" 6", " *", " 8", " *", "10"}, {"11", "12", " *", "14", "15"}, {"16", " *", "18", " *", "20"},
                                                  {" *", "22", "23", "24", " *"}};
        
        int lengthRow = arrayMatrix.length;
        int lengthCol = arrayMatrix[0].length;
        int j;
        for(int i = 0; i <  lengthRow; i++){
            for(j = 0; j < lengthCol-1; j++){
                System.out.print(arrayMatrix[i][j] + " ");
            }
            System.out.println(arrayMatrix[i][j] + " ");
        }
    }
    
}
