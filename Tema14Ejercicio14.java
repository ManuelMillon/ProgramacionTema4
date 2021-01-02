/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema14Ejercicio14 {

	/**
	 * Ejercicio 14 Realiza un programa que diga si un número introducido por
	 * teclado es par y/o divisible entre 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double n = teclado.nextDouble();

		System.out.print("Introduce un número, a ver si es divisible entre 7: ");

		
		if ((n % 7) == 0) {
			System.out.println("El número introducido es divisible entre 7.");
		} else {
			System.out.println("No es dividible entre 7 con ese número entero");
		}
			
			
	}

}
