/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio26 {

	/**
	 * Realiza un programa que calcule el precio de unas entradas de cine en funci�n
	 * del n�mero de personas y del d�a de la semana. El precio base de una entrada
	 * son 8 euros. El mi�rcoles (d�a del espectador), el precio base es de 5 euros.
	 * Los jueves son el d�a de la pareja, por lo que la entrada para dos cuesta 11
	 * euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves,
	 * un grupo de 6 personas compran entradas, el precio total ser�a de 33 euros ya
	 * que son 3 parejas; pero si es un grupo de 7, pagar�n 3 entradas de pareja m�s
	 * 1 individual que son 41 euros (33 + 8).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double precioEntradas = 0;
		double precioEntrada = 0;

		System.out.print("Introduzca el n�mero de personas: ");
		double numeroPersonas = teclado.nextDouble();		
		System.out.print("Introduzca el d�a de la semana: ");
		String diaSemana = teclado.next();

		switch (diaSemana) {
		case "lunes":
			precioEntrada = 8;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "martes":
			precioEntrada = 8;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "viernes":
			precioEntrada = 8;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "s�bado":
			precioEntrada = 8;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "domingo":
			precioEntrada = 8;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "mi�rcoles":
			precioEntrada = 5;
			precioEntradas = numeroPersonas * precioEntrada;
			break;
		case "jueves":
			int parejas = (int) numeroPersonas / 2;
			int solitario = (int) numeroPersonas % 2;
			int precioParejas = parejas * 11;
			double precioSolitario = (double) solitario * 8;
			precioEntradas = precioParejas + precioSolitario;
			break;
		default:
		}
		
		double precioAPagar = 0;
		double descuento = 0;
		System.out.print("�Tiene tarjeta CineCampa (s/n): ");
		String tarjeta = teclado.next();
	
		
		if (tarjeta.equals("s")) {
			descuento = (precioEntradas / 10);
			precioAPagar = precioEntradas - descuento;
		} else if (tarjeta.equals("n")) {
			descuento = 0;
			precioAPagar = precioEntradas;
		}
		
		System.out.println("__________________________________________");
		System.out.println("|Venta de entradas CINECAMPA             |");
		System.out.printf("|N�mero de entradas:%20s |\n", numeroPersonas);
		System.out.printf("|�Tiene tarjeta CineCampa? (s/n): %6s |\n", tarjeta);
		System.out.println("|----------------------------------------|");
		System.out.printf("|Entradas individuales %17.2f |\n", numeroPersonas);
		System.out.printf("|Precio entrada individual %13.2f |\n", precioEntrada);
		System.out.println("|----------------------------------------|");
		System.out.printf("|Total %33.2f |\n", precioEntradas);
		System.out.printf("|Descuento %29.2f |\n", descuento);
		System.out.printf("|A pagar%32.2f |\n", precioAPagar);
		System.out.println("|________________________________________|");
		
		
		System.out.println("__________________________________________");
		System.out.println("|Venta de entradas CINECAMPA             |");
		System.out.printf("|N�mero de entradas:%20s |\n", numeroPersonas);
		System.out.printf("|�Tiene tarjeta CineCampa? (s/n): %6s |\n", tarjeta);
		System.out.println("|----------------------------------------|");
		System.out.printf("|Entradas de parejas %19s |\n", parejas);
		System.out.printf("|Precio entrada parejas %16.2f |\n", 11.00);
		System.out.printf("|Entrada individual %20s |\n", solitario);
		System.out.printf("|Precio entrada individual %13.2f |\n", precioSolitario);
		System.out.println("|----------------------------------------|");
		System.out.printf("|Total %33.2f |\n", precioEntradas);
		System.out.printf("|Descuento %29.2f |\n", descuento);
		System.out.printf("|A pagar%32.2f |\n", precioAPagar);
		System.out.println("|________________________________________|");
	}

}
