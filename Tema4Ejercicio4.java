/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Introduzca el número de horas trabajadas: ");
		int numeroHoras = keyboard.nextInt();
		
		if (numeroHoras <= 40) {
			System.out.println("El sueldo semanal es de " + (numeroHoras * 12) + " euros semanales");
		}
		if (numeroHoras > 40) {
			System.out.println("El sueldo semanal es de " + (480 + ((numeroHoras - 40) * 16)) + " euros semanales");
		}
		

	}

}
