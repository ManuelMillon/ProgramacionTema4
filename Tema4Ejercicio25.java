/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;


/**
 * @author Usuario
 *
 */
public class Tema4Ejercicio25 {

	/**
	 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
	 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
	 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
	 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
	 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
	 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la bandera en cm: ");
		double altura = keyboard.nextDouble();
		
		System.out.print("Ahora introduzca la anchura en cm: ");
		double anchura = keyboard.nextDouble();
				
		double superficie = altura * anchura;
		System.out.print("¿Quiere escudo bordado? (s/n): ");
		String escudo = keyboard.next();
		double precioEscudo = 0;	
		
		if (escudo.equals("s")) {
		precioEscudo = 2.50;
		}
		if (escudo.equals("n")) {
		precioEscudo = 0;
		} 
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		System.out.printf("Bandera de %10.2f cm2: %10.2f €\n", anchura * altura, anchura * altura / 100);
		if (escudo.equals("s")) {
			System.out.printf("Con escudo: %25.2f €\n", precioEscudo);
		}
		if (escudo.equals("n")) {
			System.out.printf("Sin escudo: %25.2f €\n", precioEscudo);
		}
		System.out.printf("Gastos de envío: %20.2f €\n", 3.25);
		System.out.printf("Total: %30.2f €\n", (anchura * altura / 100) + precioEscudo + 3.25);
		
	}

}
