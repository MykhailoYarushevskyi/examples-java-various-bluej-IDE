
/**
 * a description of class Fibonacci.
 * 
 * @author Mykhailo 
 * @version 2017-03-07
 */
public class Fibonacci
{
    /**
     * 
     * Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
     *якщо число не можливо вирахувати поверніть -1
     */
    
    public long getNumber(int position){
        if(position <= 0){ 
            return -1; //Error of value position parameter 
        }
        if((1 == position) || (2 == position)){
        return 1;
        }
        else {
        return getNumber(position-1) + getNumber(position-2);
        }
    } //End of method public long getNumber(int position)
    
    public static void main(String[] args)
    {
        Fibonacci fib = new Fibonacci();
        int maxPositionForCycle = 10;

        for(int pos = 0; pos<= maxPositionForCycle; pos++){
            System.out.println("position = " + pos + "; Number of Fibonacci = " + fib.getNumber(pos));
        }
    }
}
