/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema4Ejercicio8 {

	/**
	 * Realiza un programa que calcule la media de tres notas.
	 * Ampl�a el programa anterior para que diga la nota del bolet�n (insuficiente,
	 * suficiente, bien, notable o sobresaliente).
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la primera nota de su examen. ");
		double x = teclado.nextDouble();
		
		System.out.print("Por favor, introduzca la segunda nota de su examen. ");
		double y = teclado.nextDouble();
		
		System.out.print("Por favor, introduzca la tercera nota de su examen. ");
		double z = teclado.nextDouble();
		
		double nota = ((x + y + z) / 3);
		
		System.out.println("La nota media de sus ex�menes es de... " + nota);
		
	if ((nota >= 0) && (nota < 5)) {
		System.out.println("La suma de tus tres ex�menes da una media de " + nota + ". Enhorabuena, est�s suspenso. Ser�s el pr�ximo Steve Jobs.");
	}
	if ((nota >= 5) && (nota < 6)) {
		System.out.println("La suma de tus tres ex�menes da una media de " + nota + ". Has aprobado. Est�s a unas pocas d�cimas de suspender. Tienes cara de directivo.");
	}
	if ((nota >= 6) && (nota < 7)) {
		System.out.println("La suma de tus tres ex�menes da una media de " + nota + ". Bien. Has sacado un bien. Ni f� ni f�.");
	}
	if ((nota >= 7) && (nota < 9)) {
		System.out.println("La suma de tus tres ex�menes da una media de " + nota + ". Notable. Da las gracias si llegas a becario.");
	}
	if ((nota >= 9) && (nota <= 10)) {
		System.out.println("La suma de tus tres ex�menes da una media de " + nota + ". Sobresaliente. Conf�rmate con usar el Word sin faltas de ortograf�a.");
	}
	
			
	}

}
