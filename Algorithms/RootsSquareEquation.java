import java.lang.Math;
/**
 * Write a description of class RootsSquareEquation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RootsSquareEquation
{
    // instance variables - replace the example below with your own
    private double x1;
    private double x2;

    /**
     * Constructor for objects of class RootsSquareEquation
     */
    public RootsSquareEquation()
    {
        // initialise instance variables
        x1 = 0d;
        x2 = 0d;
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
        return  y;
    }
    
    public static void main(String[] args)
    {
        double a = 0;  //3;
        double b = 10; //2.5;
        double c = 0;  //-0.5;
        double x1;
        double x2;
        
        if((a >= 0d - 0.0001 ) & (a <= 0d + 0.0001 )) {
            if((b >= 0d - 0.0001 ) & (b <= 0d + 0.0001 )){
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else{
                x1 = -c / b;
                if(-0.0 == x1){x1 = -x1;} //This need for a correct evaluation by test of course Prometheus
                x2 = x1;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }
        else{
            if((b * b - 4 * a * c) < 0){
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else{
                x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }
        }

        //PUT YOUR CODE HERE        
    }
}
