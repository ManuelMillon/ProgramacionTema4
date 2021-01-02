/**
 * Ejercicio de práctica del tema 4 con Switch
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class EjercicioMenuConSwitch {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	System.out.println(" CÁLCULO DE ÁREAS ");
	System.out.println(" -----------------");
	System.out.println(" 1. Cuadrado ");
	System.out.println(" 2. Rectángulo ");
	System.out.println(" 3. Triángulo ");
	System.out.print("\n Elija una opción (1-3): ");
	
	int opcion = teclado.nextInt();
	
	double lado;
	double base;
	double altura;
	
	switch (opcion) {
	case 1:
		System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
		lado = teclado.nextDouble();
		System.out.println("\nEl área del cuadrado es " + (lado * lado + "cm2"));
		break;
	case 2:
		System.out.print("\nIntroduzca la base del rectángulo en cm: ");
		base = teclado.nextDouble();
		System.out.print("\nIntroduzca la altura del rectángulo en cm: ");
		altura = teclado.nextDouble();
		System.out.println("\nEl área del rectángulo es " + (base * altura + "cm2"));
		break;
	case 3:
		System.out.print("\nIntroduzca la base del triángulo en cm: ");
		base = teclado.nextDouble();
		System.out.print("\nIntroduzca la altura del triángulo en cm");
		altura = teclado.nextDouble();
		System.out.println("El área del triángulo es de" + (base * altura / 2) + " cm2");
		
	default: 
		System.out.println("Lo siento, la respuesta elegida no es correcta.");
	
	
	}
	
	}

}
