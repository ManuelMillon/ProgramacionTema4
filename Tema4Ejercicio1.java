/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio1 {

	/**
	 * Tema 4. Ejercicio 1. Escribe un programa que pida por teclado un día de la
	 * semana y qué asignatura toca a primera hora ese día
	 * 
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, escriba el día de la semana del que");
		System.out.print("quiera conocer la asignatura a primera hora: ");

		String dia = teclado.next();
		dia = dia.toLowerCase();

		switch (dia) {
		case "lunes":
			System.out.println("Entornos de Desarrollo");
			break;
		case "martes":
			System.out.println("Lenguaje de Marcas");
			break;
		case "miércoles":
			System.out.println("Programación");
			break;
		case "jueves":
			System.out.println("Bases de Datos");
			break;
		case "viernes":
			System.out.println("Sistemas Informáticos");
			break;
		default:
			System.out.println("Lo siento, esa entrada es incorrecta.");
		}
	}

}
