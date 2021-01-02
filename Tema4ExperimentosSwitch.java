/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4ExperimentosSwitch {

	/**
	 * Experimentos con Switch
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Dime si eres socio: ");
		String socio = kboard.nextLine();
		System.out.print("Dime el precio total: ");
		double precio = kboard.nextDouble();

		switch (socio) {
		case "si":
			precio = precio - (precio / 10);
			System.out.println("Eres socio");
			break;
		case "no":
			precio = precio;
			System.out.println("No eres socio");
			break;
		default:
		}
		System.out.println("El precio es de " + precio + " euros.");


	}

}
