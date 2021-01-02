/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio10 {

	/**
	 * Ejercicio 10 Escribe un programa que nos diga el hor�scopo a partir del d�a y
	 * el mes de nacimiento.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor, introduzca el n�mero del mes de su nacimiento. ");
		int dia = teclado.nextInt();
		
		System.out.print("Por favor, introduzca el n�mero del d�a de su nacimiento. ");
		int mes = teclado.nextInt();

		String hor�scopo = "";

		switch (dia) {
		case 1:
			if (dia < 21) {
				hor�scopo = "Capricornio";
			} else {
				hor�scopo = "Acuario";
			}
			break;
		case 2:
			if (dia < 20) {
				hor�scopo = "Acuario";
			} else {
				hor�scopo = "Piscis";
			}
			break;
		case 3:
			if (dia < 21) {
				hor�scopo = "Piscis";
			} else {
				hor�scopo = "Aries";
			}
			break;
		case 4:
			if (dia < 21) {
				hor�scopo = "Aries";
			} else {
				hor�scopo = "Tauro";
			}
			break;
		case 5:
			if (dia < 20) {
				hor�scopo = "Tauro";
			} else {
				hor�scopo = "G�minis";
			}
			break;
		case 6:
			if (dia < 22) {
				hor�scopo = "G�minis";
			} else {
				hor�scopo = "C�ncer";
			}
			break;
		case 7:
			if (dia < 22) {
				hor�scopo = "C�ncer";
			} else {
				hor�scopo = "Leo";
			}
			break;
		case 8:
			if (dia < 24) {
				hor�scopo = "Leo";
			} else {
				hor�scopo = "Virgo";
			}
			break;
		case 9:
			if (dia < 23) {
				hor�scopo = "Virgo";
			} else {
				hor�scopo = "Libra";
			}
			break;
		case 10:
			if (dia < 23) {
				hor�scopo = "Libra";
			} else {
				hor�scopo = "Escorpio";
			}
			break;
		case 11:
			if (dia < 23) {
				hor�scopo = "Escorpio";
			} else {
				hor�scopo = "Sagitario";
			}
			break;
		case 12:
			if (dia < 21) {
				hor�scopo = "Sagitario";
			} else {
				hor�scopo = "Capricornio";
			}
			break;
			default:
				
		}
		System.out.println("Su hor�scopo es " + hor�scopo);

	}
}
