package javadaalgavar1;
import java.util.Scanner;
/**
 * @author MkIT
 *
 */
public class Bodlogo1 {

	public static void main(String[] args) {
		    Scanner numb	 = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    int n = numb.nextInt();  // Read user input
		    System.out.println("Number is: " + n);  // Output user input 	// 
		    if (n < 60) {
		    	System.out.println("F");
		    }
		    else if (n <70){
		    	System.out.println("D");
		    }
		    else if (n <80){
		    	System.out.println("C");
		    }
		    else if (n <90){
		    	System.out.println("B");
		    }
		    else {
		    	System.out.println("A");
		    }
	}
}
