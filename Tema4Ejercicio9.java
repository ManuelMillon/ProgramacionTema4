/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio9 {

	/**
	 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
	 * ax2 + bx + c = 0).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		
		double x1;
		double x2;
		System.out.print("Introduce el valor de a: ");
		double a = teclado.nextDouble();
		System.out.print("Introduce el valor de b: ");
		double b = teclado.nextDouble();
		System.out.print("Introduce el valor de c: ");
		double c = teclado.nextDouble();
		
		if (((b * b) - (4 * a * c)) < 0) {
			System.out.println("La ecuación no posee soluciones reales");
		} else {
		x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		x2 = (-b - Math.sqrt(( b* b) - (4 * a * c))) / (2 * a);
		System.out.println("Las soluciones a estas ecuaciones de segundo grado son... " + x1 + " y " + x2 + ". Soy un genio.");
		}
	}

}
