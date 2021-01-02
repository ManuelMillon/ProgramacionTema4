/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, introduzca el primer número entero: ");
		int a = teclado.nextInt();
		System.out.print("Por favor, introduzca el segundo número entero: ");
		int b = teclado.nextInt();
		System.out.print("Por favor, introduzca el tercer número entero: ");
		int c = teclado.nextInt();

		if ((a > b) && (a > c) && (b > c)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + a + ", luego " + b + " y finalmente " + c + ".");
		}
		if ((a > b) && (a > c) && (b > c)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + a + ", luego " + c + " y finalmente " + b + ".");
		}
		if ((b > a) && (b > c) && (a > c)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + b + ", luego " + a + " y finalmente " + c + ".");
		}
		if ((b > a) && (b > c) && (c > a)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + b + ", luego " + c + " y finalmente " + a + ".");
		}
		if ((c > a) && (c > b) && (a > b)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + c + ", luego " + a + " y finalmente " + b + ".");
		}
		if ((c > a) && (c > b) && (b > a)) {
			System.out.println("El orden de los números, de mayor a menor, sería " + c + ", luego " + b + " y finalmente " + a + ".");
		}

	}

}
