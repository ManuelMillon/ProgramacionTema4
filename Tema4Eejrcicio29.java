/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Eejrcicio29 {

	/**
	 * Ejercicio 29 Realiza un programa que calcule el precio de un desayuno. El
	 * programa preguntará primero qué ha tomado el usuario de comer: palmera, donut
	 * o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
	 * programa debe preguntar además si era con aceite o con tortilla; el primero
	 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
	 * café a 1’50 y 1’20 respectivamente.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		String desayunoSolido = kboard.next();
		double precioSolido = 0;
		
		switch (desayunoSolido) {
		case "palmera":
			precioSolido = 1.40;
			break;
		case "donut":
			precioSolido = 1.00;
			break;
		case "pitufo":
			System.out.print("¿Con qué quiere tomar el pitufo? ¿aceite o tortilla? ");
			String tipoPitufo = kboard.next();
			
			if (tipoPitufo.equals("aceite")) {
				precioSolido = 1.20;
			}
			if (tipoPitufo.equals("tortilla")) {
				precioSolido = 1.60;
			}
			break;
		default:
		}
		
		System.out.print("¿Qué va a tomar de beber? ");
		
		String desayunoLiquido = kboard.next();
		double precioLiquido = 0;

		switch (desayunoLiquido) {
		case "cafe":
			precioLiquido = 1.20;
			System.out.println("¿Qué ha tomado de beber? Café.");
			break;
		case "zumo":
			precioLiquido = 1.50;
			System.out.println("¿Qué ha tomado de beber? Zumo.");
			break;
		default:
		}

		double totalDesayuno = (precioSolido + precioLiquido);
		System.out.println(desayunoSolido + ": " + precioSolido + "€");
		System.out.println(desayunoLiquido + ": " + precioLiquido + "€");
		System.out.printf("Total desayuno: %.2f", totalDesayuno);

	}

}
