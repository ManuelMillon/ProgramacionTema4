/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class EjerciciosTema4 {

	/**
	 * Ejercicio switch
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, escribe el número del mes:  ");
		int mes = teclado.nextInt();
		
		String nombreDelMes = null;
			switch (mes) {
			case 1:
				nombreDelMes ="enero";
				break;
			case 2:
				nombreDelMes ="febrero";
				break;
			case 3:
				nombreDelMes ="marzo";
				break;
			case 4:
				nombreDelMes ="abril";
				break;
			case 5:
				nombreDelMes ="mayo";
				break;
			case 6:
				nombreDelMes ="junio";
				break;
			case 7:
				nombreDelMes ="julio";
				break;
			case 8:
				nombreDelMes ="agosto";
				break;
			case 9:
				nombreDelMes ="septiembre";
				break;
			case 10:
				nombreDelMes ="octubre";
				break;
			case 11:
				nombreDelMes ="noviembre";
				break;
			case 12:
				nombreDelMes ="diciembre";
				break;
			}
			
			System.out.println("Mes " + mes + ": " + nombreDelMes);
		}
		
			
	}


