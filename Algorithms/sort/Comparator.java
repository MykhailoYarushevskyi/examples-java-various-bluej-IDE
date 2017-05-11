package sort;


/**
 * Write a description of class Comparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comparator {
	public int compare(int a, int b){
		if (a>b) {
			return 1;
		} else if (a == b){
			return 0;
		} else {
			return -1;
		}
	}
}