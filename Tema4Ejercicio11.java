/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio11 {

	/**
	 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
	 * los segundos que faltan para llegar a la medianoche.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, introduzca la hora que desee. ");
		int horas = teclado.nextInt();
		System.out.print("Y ahora los minutos, si es tan amable. ");
		int minutos = teclado.nextInt();
		
		int segundos = ((horas * 3600) + (minutos * 60));
		System.out.println("Para terminar el día quedan " + (86400 - segundos) + " segundos.");
		
		
	}

}
