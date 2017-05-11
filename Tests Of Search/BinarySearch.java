import java.lang.Math;
import java.util.Scanner;

/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public int[] arrayVariableForSearch;
    
    private int lengthArrayForSearch = 0;
    private int valueForSearch;

    /**
     * Constructor for objects of class BinarySearch
     */
    public BinarySearch(int value)
    {
        // initialise instance variables
        this.arrayVariableForSearch = new int[]{2,3,6,7,11,16,25,124,1025,2055,2056};
        this.valueForSearch = value;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean checkLengthArray(int lengthArray)
    {
        boolean resultCheckParameter = false;
        if(lengthArray > 0 & lengthArray <= 11) {
            resultCheckParameter = true;
            this.lengthArrayForSearch = lengthArray;
        }
        return resultCheckParameter;
    }
    /**
     * this method doing the binary searching into the array
     * 
     * return a value rezultOfSearch >=0 (the index of array), if the result of this searching is positive
     * return a value rezultOfSearch = -1, if the result of this searching is negative
     */
    public int binSearch(int length, int valueThatWeSearch)
    {
        int rezultOfSearch = -1; //default the result of this searching is negative
        int halfIndexValue = 0;
        int minIndex = 0;
        int maxIndex = 0;
        
        boolean noResult = true;
        
        maxIndex = length-1;
        /*
        if(length = 1){
            if(valueThatWeSearch == arrayVariableForSearch[0]){
                rezultOfSearch = 0;
                return rezultOfSearch;
            }
        */
    
        while(noResult){
            halfIndexValue = (maxIndex + minIndex) / 2; //half of the sum of the indexes value
            if(valueThatWeSearch == arrayVariableForSearch[halfIndexValue]){
                rezultOfSearch = halfIndexValue;
                noResult = false;
                continue;
            }
            else if(valueThatWeSearch < arrayVariableForSearch[halfIndexValue]){
                maxIndex = halfIndexValue - 1;
            }
            else {
                minIndex = halfIndexValue + 1;
            }
            if(maxIndex < minIndex){
                rezultOfSearch = -1;
                noResult = false;
            }
        }
        
        return rezultOfSearch;
    }
    
    public static void main(String[] args){
        
        
        BinarySearch search = new BinarySearch(11);
       
        int lengthArray = 0;
        int thatWeSearch = 2056;
        int resultOfSearchIndex = -1;
       
        boolean incorrectValue = true;
       
        System.out.println("length of the Array for search = " + search.arrayVariableForSearch.length);
        Scanner scan = new Scanner(System.in);
        while(incorrectValue){
            System.out.print("Write please a length of the array for search  ");
            lengthArray = scan.nextInt();
            if(!search.checkLengthArray(lengthArray)){ //the value of length arrray is incorrect
                System.out.println ("ERROR. Incorrect the length of array");
                continue;
            }
            incorrectValue = false;
        }
        resultOfSearchIndex = search.binSearch(lengthArray, thatWeSearch);
        if(resultOfSearchIndex >= 0 ){
            System.out.println("Result of searching is positive");
            System.out.format("lengthArray = %d; thatWeSearch = %d; resultOfSearchIndex = %d; arrayVariableForSearch[%d] = %d \n",lengthArray, thatWeSearch,resultOfSearchIndex,
                              resultOfSearchIndex, search.arrayVariableForSearch[resultOfSearchIndex]);
        }
        else{
           System.out.println("Result of searching is negative");
        }                           
    }
}
