/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio13OpcionB {

	/**
	 * Escribe un programa que ordene tres n�meros enteros introducidos por teclado.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aux;
		
		System.out.print("Introduzca el primer n�mero: ");
		int a = Integer.parseInt(keyboard.nextLine());

		System.out.print("Introduzca el segundo n�mero: ");
		int b = Integer.parseInt(keyboard.nextLine());
		
		System.out.print("Introduzca el tercer n�mero: ");
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
		
		System.out.println("Los n�meros introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");

		
	}

}
