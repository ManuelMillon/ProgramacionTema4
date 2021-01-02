/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio27 {

	/**
	 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
	 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
	 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
	 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
	 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
	 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
	 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		String saborTarta = kboard.next();
		double precioTarta = 0;
		
		switch (saborTarta) {
		case "manzana":
			precioTarta = 18;
			break;
		case "fresa":
			precioTarta = 16;
			break;
		case "chocolate":
			System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
			String tipoChocolate = kboard.next();
			if (tipoChocolate.equals("blanco")) {  
				precioTarta = 14;  
	        } else if (tipoChocolate.equals("negro") ) {  
	        	precioTarta = 15;
	        }
		}
		double precioNata = 0;
		System.out.print("¿Quiere nata? (si o no): ");
		String nata = kboard.next();
			if (nata.equals("si")) {  
				precioNata = 2.50;
			} else if (nata.equals("si")) {
				precioNata = 0;
			}
			
			double precioEscritura = 0;
			System.out.print("¿Quiere ponerle un nombre? (si o no): ");
			String escritura = kboard.next();
				if (escritura.equals("si")) {  
					precioEscritura = 2.75;
				} else if (escritura.equals("no")) {
					precioEscritura = 0;
				}	
		
		System.out.println("Elija un sabor (manzana, fresa o chocolate): " + saborTarta);
		System.out.println("¿Quiere nata? (si o no): " + nata);
		System.out.println("¿Quiere ponerle un nombre? (si o no): " + escritura);
		System.out.println("Tarta de " + saborTarta + ": " + precioTarta + "€");
		System.out.println("Con nata: " + precioNata + "€");
		System.out.println("Con nombre: " + precioEscritura + "€");
		System.out.println("Total: " + (precioTarta + precioNata + precioEscritura) + "€");
		
				
				
	}

}
