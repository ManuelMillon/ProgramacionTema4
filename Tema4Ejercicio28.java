/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio28 {

	/**
	 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
	 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
	 * opci�n incorrecta, el programa deber� mostrar un mensaje de error.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Mano del Jugador 1... piedra, papel o tijeras:  ");
		String jugador1 = kboard.next();

		switch (jugador1) {
		case "piedra":
			System.out.print("Mano del Jugador 2... piedra, papel o tijeras: ");
			String jugador2 = kboard.next();
			if (jugador2.equals("piedra")) {
				System.out.println("Empate");
			}
			if (jugador2.equals("papel")) {
				System.out.println("Papel gana a piedra. Gana jugador 2.");
			}
			if (jugador2.equals("tijeras")) {
				System.out.println("Tijeras gana a piedra. Gana jugador 1.");
			}
			break;
		case "papel":
			System.out.print("Mano del Jugador 2... piedra, papel o tijeras: ");
			jugador2 = kboard.next();
			if (jugador2.equals("piedra")) {
				System.out.println("Papel gana a piedra. Gana jugador 1.");
			}
			if (jugador2.equals("papel")) {
				System.out.println("Empate.");
			}
			if (jugador2.equals("tijeras")) {
				System.out.println("Tijeras gana a papel. Gana jugador 2.");
			}
			break;
		case "tijeras":
			System.out.print("Mano del Jugador 2... piedra, papel o tijeras: ");
			jugador2 = kboard.next();
			if (jugador2.equals("piedra")) {
				System.out.println("Piedra gana a tijeras. Gana jugador 2.");
			}
			if (jugador2.equals("papel")) {
				System.out.println("Tijeras gana a papel. Gana jugador 1.");
			}
			if (jugador2.equals("tijeras")) {
				System.out.println("Empate.");
			}
			break;
		default:
			System.out.println("Error. Esa opci�n no es v�lida.");
		}

	}

}
