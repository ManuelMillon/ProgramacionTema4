/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio19 {

	/**
	 * Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero
	 * entero que puede ser positivo o negativo. Se permiten n�meros de
	 * hasta 5 d�gitos.

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Teclee el n�mero que desee, positivo o negativo, de hasta 5 d�gitos: ");
		int numero = s.nextInt();
		
		if ((numero > -10) && (numero < 10)) {
		System.out.println("El n�mero tiene un d�gito. ");
		}
		if (((numero > -100) && (numero <= -10)) || ((numero >= 10) && (numero < 100))) {
			System.out.println("El n�mero tiene dos d�gitos. ");
			}
		if (((numero > -1000) && (numero <= -100)) || ((numero >= 100) && (numero < 1000))) {
			System.out.println("El n�mero tiene tres d�gitos. ");
			}
		if (((numero > -10000) && (numero <= -1000)) || ((numero >= 1000) && (numero < 10000))) {
			System.out.println("El n�mero tiene cuatro d�gitos. ");
			}
		if (((numero >= -99999) && (numero <= -10000)) || ((numero >= 10000) && (numero < 99999))) {
			System.out.println("El n�mero tiene cinco d�gitos. ");
			} 
		
		
	}
}
