/**
 * 
 */
package packageejerciciostema4;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio24 {

	/**
	 * Escribe un programa que genere la n�mina (bien desglosada) de un empleado
	 * seg�n las siguientes condiciones: � Se pregunta el cargo del empleado (1 -
	 * Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), los d�as que ha estado
	 * de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2
	 * - Casado). � El sueldo base seg�n el cargo es de 950, 1200 y 1600 euros seg�n
	 * si se trata de un prog. junior, un prog. senior o un jefe de proyecto
	 * respectivamente. � Por cada d�a de viaje visitando clientes se pagan 30 euros
	 * extra en concepto de dietas. Al sueldo neto hay que restarle el IRPF, que
	 * ser� de un 25% en caso de estar soltero y un 20% en caso de estar casado.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Este programa pretende proporcionar su n�mina. Tiene las siguientes opciones");
		System.out.println("1 - Programador junior.");
		System.out.println("2 - Programador Senior.");
		System.out.println("3 - Jefe de proyecto.");

		System.out.print("Por favor, introduzca su puesto: ");
		int puesto = teclado.nextInt();
		double sueldo = 0;

		switch (puesto) {
		case 1:
			sueldo = 950;
			break;
		case 2:
			sueldo = 1200;
			break;
		case 3:
			sueldo = 1600;
			break;
		default:
			System.out.println("Los datos introducidos son err�neos, int�ntelo de nuevo.");
		}

		System.out.println("Por favor, introduzca el n�mero de d�as de viaje: ");
		double dietas = teclado.nextDouble();

		double sueldoYDietas = sueldo + (dietas * 30);

		System.out.println("Por favor, introduzca su estado civil. 1, si est� soltero. 2, si est� casado: ");
		int estado = teclado.nextInt();
		double irpf = 0;

		if (estado == 1) {
			irpf = 20;
		} else if (estado == 2) {
			irpf = 25;
		} else {
			System.out.println("Esa opci�n es incorrecta.");

		}

		double sueldoNeto = sueldoYDietas - (sueldoYDietas * irpf / 100);

		System.out.println("____________________________________");
		System.out.printf("|Sueldo base        %15.2f |\n", sueldo);
		System.out.printf("|Dietas             %15.2f |\n", dietas);
		System.out.println("|-----------------------------------|");
		System.out.printf("|Sueldo bruto       %15.2f |\n", sueldoYDietas);
		System.out.printf("|Retenci�n IRPF (%%) %15.2f |\n", irpf);
		System.out.println("|-----------------------------------|");
		System.out.printf("|Sueldo Neto        %15.2f |\n", sueldoNeto);
		System.out.println("|___________________________________|");

	}

}
