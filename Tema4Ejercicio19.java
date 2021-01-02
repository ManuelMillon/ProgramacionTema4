/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio19 {

	/**
	 * Realiza un programa que nos diga cuántos dígitos tiene un número
	 * entero que puede ser positivo o negativo. Se permiten números de
	 * hasta 5 dígitos.

	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Teclee el número que desee, positivo o negativo, de hasta 5 dígitos: ");
		int numero = s.nextInt();
		
		if ((numero > -10) && (numero < 10)) {
		System.out.println("El número tiene un dígito. ");
		}
		if (((numero > -100) && (numero <= -10)) || ((numero >= 10) && (numero < 100))) {
			System.out.println("El número tiene dos dígitos. ");
			}
		if (((numero > -1000) && (numero <= -100)) || ((numero >= 100) && (numero < 1000))) {
			System.out.println("El número tiene tres dígitos. ");
			}
		if (((numero > -10000) && (numero <= -1000)) || ((numero >= 1000) && (numero < 10000))) {
			System.out.println("El número tiene cuatro dígitos. ");
			}
		if (((numero >= -99999) && (numero <= -10000)) || ((numero >= 10000) && (numero < 99999))) {
			System.out.println("El número tiene cinco dígitos. ");
			} 
		
		
	}
}
