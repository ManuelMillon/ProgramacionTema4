/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio22 {

	/**
	 * Realiza un programa que, dado un d�a de la semana (de lunes a viernes) y
	 * una hora (horas y minutos), calcule cu�ntos minutos faltan para el fin de
	 * semana. Se considerar� que el fin de semana comienza el viernes a las 15:00h.
	 * Se da por hecho que el usuario introducir� un d�a y hora correctos,
	 * anterior al viernes a las 15:00h.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca la hora: ");
		int horas = s.nextInt();
		System.out.print("Introduzca los minutos: ");
		int minutos = s.nextInt();

		System.out.print("Introduzca el d�a de la semana: ");
		String dia = s.next();
		dia = dia.toLowerCase();
		int numeroDeMinutosPorDia = 0;

		switch (dia) {
		case "lunes":
			numeroDeMinutosPorDia = 4320 + 840 + ((23 - horas) * 60) + (60 - minutos);
			break;
		case "martes":
			numeroDeMinutosPorDia = 2880 + 840 + ((23 - horas) * 60) + (60 - minutos);
			break;
		case "mi�rcoles":
			numeroDeMinutosPorDia = 1440 + 840 + ((23 - horas) * 60) + (60 - minutos);
			break;
		case "jueves":
			numeroDeMinutosPorDia = 840 + ((23 - horas) * 60) + (60 - minutos);
			break;
		case "viernes":
			numeroDeMinutosPorDia = ((14 - horas) * 60) + (60 - minutos) ;
			break;
		default:
		}
		System.out.println("Para que llegue el fin de semana quedan " + numeroDeMinutosPorDia + ". Buena suerte en la espera.");
		
	}

}
