/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio21 {

	/**
	 *Calcula la nota de un trimestre de la asignatura Programación. El programa
	 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
	 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
	 * está aprobado y se mostrará la media. En caso de que la media sea un número
	 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
	 * se califica como apto o no apto, por tanto se debe preguntar al usuario
	 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
	 * resultado de la recuperación es apto, la nota será un 5; en caso
	 * contrario, se mantiene la nota media anterior.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la nota del primer examen: ");
		double nota1 = s.nextDouble();
		System.out.print("Introduzca la nota del segundo examen: ");
		double nota2 = s.nextDouble();
		double notamedia = (nota1 + nota2)/2;
		
		if (notamedia >= 5) {
			System.out.println("Su nota media en Programación es de " + notamedia + ".");
		}
		if (notamedia < 5) {
			System.out.print("¿Cuál ha sido la nota de su recuperación? ");
			double recuperacion = s.nextDouble();
			if (recuperacion >= 5) {
				System.out.println("Apto. Su nota final en Programación es 5.");
			} else {
				System.out.println("Lo siento, en Programación no es apto.");
			}
		}
	}

}
