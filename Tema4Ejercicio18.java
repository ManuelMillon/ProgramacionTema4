/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio18 {

	/**
	 * 18. Escribe un programa que diga cu�l es la primera cifra de un n�mero
	 * entero introducido por teclado. Se permiten n�meros de hasta 5 cifras.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Por favor introduzca un n�mero entero: ");
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
		
			System.out.println("La primera cifra del n�mero introducido es: " + primera);
		
		
	}

}
