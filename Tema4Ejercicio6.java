/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio6 {

	/**
	 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
	 * Aplica la fórmula t = √2h g siendo g = 9.81m/s2
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, introduce la altura desde la que caerá el objeto");
		System.out.print("Para que pueda calcular el tiempo que tardará en caer. Gracias. ");
		double h = teclado.nextDouble();
		double t;
		t = Math.sqrt((2*h)/9.81);
		System.out.println("El tiempo que tardará el objeto en caer será de " + t + " segundos");

		
	}

}
