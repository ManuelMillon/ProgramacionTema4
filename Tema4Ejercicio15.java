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
	 * 15. Escribe un programa que pinte una pirámide rellena con un carácter
	 * introducido por teclado que podrá ser una letra, un número o un
	 * símbolo como *, +, -, $, &, etc. El programa debe permitir al
	 * usuario mediante un menú elegir si el vértice de la pirámide está
	 * apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
	 * derecha.
	 */
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Construye una pirámide con los caracteres que quieras. Sólo tienes que pulsar una tecla cada vez. ");
		
		System.out.print("Introduzca el caráter de relleno: ");
		String a = teclado.nextLine();
		
		System.out.println("Introduzca la dirección del vértice de la pirámide:");
		System.out.println("1. Vértice hacia arriba.");
		System.out.println("2. Vértice hacia la derecha.");
		System.out.println("3. Vértice hacia abajo.");
		System.out.println("4. Vértice hacia la izquierda.");
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
