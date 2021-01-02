/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio16 {

	/**
	 * 16. Realiza un programa que nos diga si hay probabilidad de que nuestra
	 * pareja nos está siendo infiel. El programa irá haciendo preguntas que el
	 * usuario contestará con una v (verdadero) o una f (falso). Cada pregunta
	 * contestada con v sumará 3 puntos. Las preguntas contestadas con f no suman
	 * puntos. Utiliza el fichero test_infidelidad.txt para obtener las preguntas y
	 * las conclusiones del programa.
	 * 
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int puntos = 0;
		System.out.println(
				"Vamos a saber matemáticamente si tienes más cuernos que un torero en su salón. Escribe v o f");

		String respuesta;
		System.out.print("Tu pareja ha cambiado de hábitos últimamente: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}

		System.out.print("De repente, los planes de actividades comunes se van al traste: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Te presta más atención de la habitual: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("La persona en cuestión es joven: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Antes de conocerte se acostaba con cualquiera: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Hay diferencias en el deseo sexual. Especialmente si no hay matrimonio de por medio: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Piensa que eres tú quien le pone los cuernos: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Tu pareja se pone de mal humor por motivos sin motivo: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}
		System.out.print("Has visto a tu pareja darse el lote con otra persona: ");
		respuesta = teclado.nextLine();
		if (respuesta.equals("v")) {
			puntos += 3;
		}

		if (puntos < 8) {
			System.out.println("Tal vez la cosa vaya bien y el problema de miedos lo tengas tú.");
		}
		if ((puntos >= 8) && (puntos < 15)) {
			System.out.println("A ver, no creo que sea para tanto. No sé, tal vez haya algo.");
		}
		if ((puntos >= 15) && (puntos < 22)) {
			System.out.println("Bueno, digamos que las probabilidades empiezan a ser interesantes.");
		}
		if ((puntos >= 23) && (puntos < 30)) {
			System.out.println("Oye, ten cuidado con las astas, no vayas a sacarme un ojo");
		}

	}

}
