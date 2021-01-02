/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio15 {

	/**
	 * 15. Escribe un programa que pinte una pir�mide rellena con un car�cter
	 * introducido por teclado que podr� ser una letra, un n�mero o un
	 * s�mbolo como *, +, -, $, &, etc. El programa debe permitir al
	 * usuario mediante un men� elegir si el v�rtice de la pir�mide est�
	 * apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
	 * derecha.
	 */
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Construye una pir�mide con los caracteres que quieras. S�lo tienes que pulsar una tecla cada vez. ");
		
		System.out.print("Introduzca el car�ter de relleno: ");
		String a = teclado.nextLine();
		
		System.out.println("Introduzca la direcci�n del v�rtice de la pir�mide:");
		System.out.println("1. V�rtice hacia arriba.");
		System.out.println("2. V�rtice hacia la derecha.");
		System.out.println("3. V�rtice hacia abajo.");
		System.out.println("4. V�rtice hacia la izquierda.");
		int direccion = teclado.nextInt();

		switch (direccion) {
			case 1:
				System.out.println(" " + " " + a);
				System.out.println(" " + a + a + a);
				System.out.println(a + a + a + a + a);
				break;
			case 2:
				System.out.println(a);
				System.out.println(a + a + a );
				System.out.println(a + a + a + a + a);
				System.out.println(a + a + a );
				System.out.println(a);
				break;
			case 3:
				System.out.println(a + a + a + a + a);
				System.out.println(" " + a + a + a);
				System.out.println(" " + " " + a);
				break;
			case 4:
				System.out.println(" " + " " + " " + " " + a);
				System.out.println(" " + " " + a + a + a );
				System.out.println(a + a + a + a + a);
				System.out.println(" " + " " + a + a + a );
				System.out.println(" " + " " + " " + " " + a);
				break;
				
			default:
				System.out.println("Lo siento, esa entrada es incorrecta.");
		
		
		}

	}


}
