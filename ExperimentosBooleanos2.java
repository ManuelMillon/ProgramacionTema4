/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ExperimentosBooleanos2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Are you above 18?- ");  
        Scanner sc = new Scanner(System.in);  
        boolean bn = sc.nextBoolean();  
        if (bn == true) {  
            System.out.println("You are over 18");  
        } else if (bn == false) {  
            System.out.println("You are under 18");  
        }  
        sc.close();
		

	}

}
