/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio5 {

	/**
	 * Realiza un programa que resuelva una ecuaci�n de primer grado (del tipo ax+b = 0).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.print("Por favor, introduzca el valor de a, como valor entero: ");
		double a = teclado.nextDouble();
		
		System.out.print("Y ahora, si es tan amable, introduzca el valor de b, como valor entero. ");
		double b = teclado.nextDouble();
		
		double x;
		System.out.println("El valor de x es de " + (x = -b/a));
		
		/**
		 * Y ahora haz que diga que la ecuaci�n no tiene soluci�n real si es que no tiene soluci�n real.
		 */
		
		if (a == 0) {
			System.out.println("Esa ecuaci�n no tiene soluci�n real, pedazo de buena persona.");
		}
	}

}
