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
	 *Calcula la nota de un trimestre de la asignatura Programaci�n. El programa
	 * pedir� las dos notas que ha sacado el alumno en los dos primeros controles.
	 * Si la media de los dos controles da un n�mero mayor o igual a 5, el alumno
	 * est� aprobado y se mostrar� la media. En caso de que la media sea un n�mero
	 * menor que 5, el alumno habr� tenido que hacer el examen de recuperaci�n que
	 * se califica como apto o no apto, por tanto se debe preguntar al usuario
	 * �Cu�l ha sido el resultado de la recuperaci�n? (apto/no apto). Si el
	 * resultado de la recuperaci�n es apto, la nota ser� un 5; en caso
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
			System.out.println("Su nota media en Programaci�n es de " + notamedia + ".");
		}
		if (notamedia < 5) {
			System.out.print("�Cu�l ha sido la nota de su recuperaci�n? ");
			double recuperacion = s.nextDouble();
			if (recuperacion >= 5) {
				System.out.println("Apto. Su nota final en Programaci�n es 5.");
			} else {
				System.out.println("Lo siento, en Programaci�n no es apto.");
			}
		}
	}

}
