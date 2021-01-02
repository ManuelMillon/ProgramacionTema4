/**
 * Ejercicio de pr�ctica del tema 4 con Switch
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class EjercicioMenuConSwitch {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	System.out.println(" C�LCULO DE �REAS ");
	System.out.println(" -----------------");
	System.out.println(" 1. Cuadrado ");
	System.out.println(" 2. Rect�ngulo ");
	System.out.println(" 3. Tri�ngulo ");
	System.out.print("\n Elija una opci�n (1-3): ");
	
	int opcion = teclado.nextInt();
	
	double lado;
	double base;
	double altura;
	
	switch (opcion) {
	case 1:
		System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
		lado = teclado.nextDouble();
		System.out.println("\nEl �rea del cuadrado es " + (lado * lado + "cm2"));
		break;
	case 2:
		System.out.print("\nIntroduzca la base del rect�ngulo en cm: ");
		base = teclado.nextDouble();
		System.out.print("\nIntroduzca la altura del rect�ngulo en cm: ");
		altura = teclado.nextDouble();
		System.out.println("\nEl �rea del rect�ngulo es " + (base * altura + "cm2"));
		break;
	case 3:
		System.out.print("\nIntroduzca la base del tri�ngulo en cm: ");
		base = teclado.nextDouble();
		System.out.print("\nIntroduzca la altura del tri�ngulo en cm");
		altura = teclado.nextDouble();
		System.out.println("El �rea del tri�ngulo es de" + (base * altura / 2) + " cm2");
		
	default: 
		System.out.println("Lo siento, la respuesta elegida no es correcta.");
	
	
	}
	
	}

}
