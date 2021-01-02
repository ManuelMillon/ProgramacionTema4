/**
 * 
 */
package packageejerciciostema4;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema4ExperimentosIf {

	/**
	 * Experimentos con if
	 */
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);  
     
        System.out.print("¿Eres socio? ");  
        boolean socio = sc.nextBoolean();  
        if (socio == true) {  
            System.out.println("Eres socio.");  
        } else if (socio == false) {  
            System.out.println("No eres socio.");  
        }  
        
        System.out.print("¿Tienes 18?- ");  
        String respuesta = sc.next();
        
        if (respuesta.equals("si") ) {  
            System.out.println("Sí, tienes 18");  
        } else if (respuesta.equals("no") ) {  
            System.out.println("Eres menor de 18"); 
        }
	
       
	
	}

}
