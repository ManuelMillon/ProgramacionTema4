/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio18 {

	/**
	 * 18. Escribe un programa que diga cuál es la primera cifra de un número
	 * entero introducido por teclado. Se permiten números de hasta 5 cifras.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Por favor introduzca un número entero: ");
		int n, primera = 0;
		
		
		if (n < 10) {
			primera = n;
		}
		if ((n >= 10) && (n < 100)) {
			primera = n/10;
		}
		if ((n >= 100) && (n < 1000)) {
			primera = n/100;
		}
		
		if ((n >= 1000) && (n < 10000)) {
			primera = n/1000;
		
			System.out.println("La primera cifra del número introducido es: " + primera);
		
		
	}

}
