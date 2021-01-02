/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio23 {

	/**
	 * Escribe un programa que calcule el precio final de un producto según su base
	 * imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
	 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
	 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
	 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
	 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
	 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
	 * se muestran los valores correctos, aunque los números no estén tabulados.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduzca la base imponible: ");
		double baseImponible = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.print("Introduzca el tipo de IVA: general, reducido o superreducido: ");
		String tipoIva = teclado.nextLine();
		
		int tipoIVANumerico = 0;

		switch (tipoIva) {
		case "general":
			tipoIVANumerico = 21;
			break;
		case "reducido":
			tipoIVANumerico = 10;
			break;
		case "superreducido":
			tipoIVANumerico = 4;
			break;
		default:
			System.out.println("El tipo de IVA introducido no es correcto");
		}
		double iva = baseImponible * tipoIVANumerico / 100;
		double precioSinDescuento = baseImponible + iva;

		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String codigoPromocional = teclado.nextLine();
		
		double descuento = 0;

		switch (codigoPromocional) {
		case "nopro":
			break;
		case "mitad": // el precio se reduce a la mitad
			descuento = precioSinDescuento / 2;
			break;
		case "5porc":
			descuento = precioSinDescuento * 0.05;
			break;
		default:
			System.out.println("El código promocional introducido no es correcto");
		}

		
		double total = precioSinDescuento - descuento;
		
		System.out.printf("Base imponible      %6.2f\n", baseImponible);
		System.out.printf("Precio IVA 10%%      %6.2f\n", iva);
		System.out.printf("Precio con IVA      %6.2f\n", precioSinDescuento);
		System.out.printf("Cod.promo. (5%%)     %6.2f\n",descuento );
		System.out.printf("Total               %6.2f", total);
				
				
				
	}

}
