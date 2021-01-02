/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio1 {

	/**
	 * Tema 4. Ejercicio 1. Escribe un programa que pida por teclado un d�a de la
	 * semana y qu� asignatura toca a primera hora ese d�a
	 * 
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, escriba el d�a de la semana del que");
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
		case "mi�rcoles":
			System.out.println("Programaci�n");
			break;
		case "jueves":
			System.out.println("Bases de Datos");
			break;
		case "viernes":
			System.out.println("Sistemas Inform�ticos");
			break;
		default:
			System.out.println("Lo siento, esa entrada es incorrecta.");
		}
	}

}
