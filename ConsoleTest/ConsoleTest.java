/**
 * 
 */
//package testOfClasses;

import java.io.Console;
import java.lang.reflect.Array;

/**
 * @author my
 *
 */
public class ConsoleTest {

	/**
	 System.console

	- creates an instance when working with it. So the output cannot be redirected like this:

    java ConsoleExample > myLog.log

	- Console class output methods use the console encoding.
	- System.console() provides methods for reading password without echoing characters. 
   
	!!! Another important aspect is that the System.console() returns null if your application 
	    is not run in a terminal. System.console() returns null when running inside Eclipse or Netbeans IDE. 
	 */
	public ConsoleTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console cons;
		char[] passwd;
		/* passwd = {'a','b','c','1','2','3'};
		System.out.print("Beginning Password is ");
    	System.out.println(passwd);
    	cons = System.console();
    	passwd = cons.readPassword("[%s]", "Password:");
    	System.out.print("Step 2. Password is ");
    	System.out.println(passwd);
    	*/
		// Whether if((args != null) && (Array.getLength(args) != 0))  Or may be simply
		if((args != null) && (args.length != 0)){
			System.out.println("args[0]= " + args[0]);
		}
		
		if((cons = System.console()) != null &&
	     (passwd = cons.readPassword("[%s]", "Password:")) != null) {
			System.out.print("Password is ");
	    	System.out.println(passwd);	    	 
	        java.util.Arrays.fill(passwd, ' ');
	        System.out.print("Password after cleaning ");
	        System.out.println(passwd);
	    }
	}

}
