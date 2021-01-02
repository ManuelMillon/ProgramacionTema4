/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio7 {

	/**
	 * Ejercicio 7
	 * Realiza un programa que calcule la media de tres notas.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, introduzca la primera nota de su examen. ");
		double x = teclado.nextDouble();
		
		System.out.print("Por favor, introduzca la segunda nota de su examen. ");
		double y = teclado.nextDouble();
		
		System.out.print("Por favor, introduzca la tercera nota de su examen. ");
		double z = teclado.nextDouble();
		
		double nota = ((x + y + z) / 3);

		System.out.println("La nota media de sus exámenes es de... " + nota + ".");
	}

}
