/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio13OpcionB {

	/**
	 * Escribe un programa que ordene tres números enteros introducidos por teclado.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aux;
		
		System.out.print("Introduzca el primer número: ");
		int a = Integer.parseInt(keyboard.nextLine());

		System.out.print("Introduzca el segundo número: ");
		int b = Integer.parseInt(keyboard.nextLine());
		
		System.out.print("Introduzca el tercer número: ");
		int c = Integer.parseInt(keyboard.nextLine());
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
			}
		
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
			}
		
		System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");

		
	}

}
