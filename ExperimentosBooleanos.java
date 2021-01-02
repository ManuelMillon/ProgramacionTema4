/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ExperimentosBooleanos {

	/**
	 * Experimetnos java booleanos
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		boolean a = true;
		boolean b = false;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!a = " + !a);
		System.out.println("a || (6 > 10) = " + (6 > 10));
		System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a)));
		
		
		System.out.print("¿Eres socio? ");  
        boolean socio = teclado.nextBoolean();  
        if (socio == true) {  
            System.out.println("Eres socio.");  
        } else if (socio == false) {  
            System.out.println("No eres socio.");  
        }  
       
		
		
		
	}

}
