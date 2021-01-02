/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio17 {

	/**
	 * 17. Escribe un programa que diga cuál es la última cifra de un número
	 * entero introducido por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor introduzca un número entero: ");
		int numero = teclado.nextInt();
		
		System.out.println("La última cifra del número introducido es: " + (numero % 10));
		
		
	}

}