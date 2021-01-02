/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio20 {

	/**
	 * Realiza un programa que diga si un número entero positivo introducido por
	 * teclado es capicúa. Se permiten números de hasta 5 cifras.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		boolean capicua = false;
		System.out.print("Introduzca un número de cinco cifras: ");
		int numero = s.nextInt();
		if (numero < 10) {
				capicua = true;
				}
				
			if  ((numero >= 10) && (numero < 100)) {
				if ((numero / 10) == (numero % 10)) {
					capicua = true;
				}
			}				
		
			
			if  ((numero >= 100) && (numero < 1000)) {
				if ((numero / 100) == (numero % 10)) {
					capicua = true;
				}
			}
						
			if ((numero >= 1000) && (numero < 10000)) {
				if (((numero / 1000) == (numero %10)) && (((numero /100 ) % 10) == ((numero / 10) % 10))){
					capicua = true;
			}
				}
			if ((numero >= 10000) && (numero < 99999)) {
			
					if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
					capicua = true;
			}
				}

			if (capicua) {
				System.out.println("El número introducido es capicúa.");
				} else {
				System.out.println("El número introducido no es capicúa.");
				}

		
		

	}

}
