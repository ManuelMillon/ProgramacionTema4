/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema4Ejercicio10 {

	/**
	 * Ejercicio 10 Escribe un programa que nos diga el horóscopo a partir del día y
	 * el mes de nacimiento.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, introduzca el número del mes de su nacimiento. ");
		int dia = teclado.nextInt();
		
		System.out.print("Por favor, introduzca el número del día de su nacimiento. ");
		int mes = teclado.nextInt();

		String horóscopo = "";

		switch (dia) {
		case 1:
			if (dia < 21) {
				horóscopo = "Capricornio";
			} else {
				horóscopo = "Acuario";
			}
			break;
		case 2:
			if (dia < 20) {
				horóscopo = "Acuario";
			} else {
				horóscopo = "Piscis";
			}
			break;
		case 3:
			if (dia < 21) {
				horóscopo = "Piscis";
			} else {
				horóscopo = "Aries";
			}
			break;
		case 4:
			if (dia < 21) {
				horóscopo = "Aries";
			} else {
				horóscopo = "Tauro";
			}
			break;
		case 5:
			if (dia < 20) {
				horóscopo = "Tauro";
			} else {
				horóscopo = "Géminis";
			}
			break;
		case 6:
			if (dia < 22) {
				horóscopo = "Géminis";
			} else {
				horóscopo = "Cáncer";
			}
			break;
		case 7:
			if (dia < 22) {
				horóscopo = "Cáncer";
			} else {
				horóscopo = "Leo";
			}
			break;
		case 8:
			if (dia < 24) {
				horóscopo = "Leo";
			} else {
				horóscopo = "Virgo";
			}
			break;
		case 9:
			if (dia < 23) {
				horóscopo = "Virgo";
			} else {
				horóscopo = "Libra";
			}
			break;
		case 10:
			if (dia < 23) {
				horóscopo = "Libra";
			} else {
				horóscopo = "Escorpio";
			}
			break;
		case 11:
			if (dia < 23) {
				horóscopo = "Escorpio";
			} else {
				horóscopo = "Sagitario";
			}
			break;
		case 12:
			if (dia < 21) {
				horóscopo = "Sagitario";
			} else {
				horóscopo = "Capricornio";
			}
			break;
			default:
				
		}
		System.out.println("Su horóscopo es " + horóscopo);

	}
}
