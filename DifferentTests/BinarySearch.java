
/**
 * Write a description of class BinarySearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinarySearch {

public static void main(String[] args) {

    int data[] = { 3, 6, 7, 10, 34, 56, 60 };
    int numberToFind = 10;

    // PUT YOUR CODE HERE
    int index;
    int firstindex = 0;
    int lastindex = data.length;
    while (true){
        index = (lastindex + firstindex)/2;
        if (data[index] == numberToFind){
            System.out.println(index);
            return;
        } else if (firstindex == lastindex && data[index] != numberToFind){
            System.out.println(-1);
            return;
        } else if (data[index] > numberToFind){
            lastindex = index;
        } else if (data[index] < numberToFind){
            firstindex = index;
        }
    }
    // PUT YOUR CODE HERE
}

}