/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio3 {

	/**
	 * Tema 3 Ejercicio 4. Escribe un programa en que dado un n�mero del 1 a 7
	 * escriba el correspondiente nombre del d�a de la semana.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, escriba un d�a del 1 al 7 para que pueda identificarlo con un d�a de la semana   ");

		int dia = teclado.nextInt();
		
		String nombreDelDia;

		switch (dia) {
		case 1:
			nombreDelDia = "lunes";
			break;
		case 2:
			nombreDelDia = "martes";
			break;
		case 3:
			nombreDelDia = "mi�rcoles";
			break;
		case 4:
			nombreDelDia = "jueves";
			break;
		case 5:
			nombreDelDia = "viernes";
			break;
		case 6:
			nombreDelDia = "s�bado";
			break;
		case 7:
			nombreDelDia = "domingo";
			break;
		default:
			nombreDelDia = "Introduce un n�mero, del 1 al 7, por favor.";
		}
		System.out.println(nombreDelDia);

	}
}
