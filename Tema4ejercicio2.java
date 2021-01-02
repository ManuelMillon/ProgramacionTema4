/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4ejercicio2 {

	/**
	 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
	 * d�as, buenas tardes o buenas noches seg�n la hora. Se utilizar�n los tramos
	 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. S�lo se tienen en cuenta
	 * las horas, los minutos no se deben introducir por teclado.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, introduzca la hora que sea: ");

		int hora = teclado.nextInt();

		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("Buenos d�as");
		}

		if ((hora >= 13) && (hora <= 20)) {
			System.out.println("Buenas tardes");
		}

		if (((hora >= 21) && (hora <= 24)) || ((hora >= 0) && (hora <= 5))) {
			System.out.println("Buenas noches");
		}

		if ((hora < 0) || (hora > 24)) {
			System.out.println("la hora indicada no es correcta");
		}

	}

}
