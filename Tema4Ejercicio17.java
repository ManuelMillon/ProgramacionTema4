/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio17 {

	/**
	 * 17. Escribe un programa que diga cu�l es la �ltima cifra de un n�mero
	 * entero introducido por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor introduzca un n�mero entero: ");
		int numero = teclado.nextInt();
		
		System.out.println("La �ltima cifra del n�mero introducido es: " + (numero % 10));
		
		
	}

}