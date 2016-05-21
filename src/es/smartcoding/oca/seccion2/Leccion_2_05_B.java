/**
 * 
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 * 		   Las estructuras de control de Java
 * 
 *         Un bucle (loop) es una estructura de control de repetición.
 * 
 *         Las llaves son opcionales cuando el cuerpo esta formado por una única instrucción.
 *
 */
public class Leccion_2_05_B {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("*** bucle 1 ***");
		/*
		 * Bucle infinito, no incrementa la variable i. Escribe 0
		 * indefinidamente.
		 */
		// while(i < 10) {
		// System.out.println(i);
		// }
		System.out.println("*** bucle 2 ***");
		i = 0;
		/*
		 * Es es un bucle clásico, al final del bloque se incrementa la variable
		 * i. Escribe de 0 a 9.
		 */
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*** bucle 3 ***");
		i = 0;
		/*
		 * Este bucle se comporta exactamente igual que el anterior. Escribe de
		 * 0 a 9.
		 */
		while (i < 10) {
			System.out.println(i++);
		}
		System.out.println("*** bucle 4 ***");
		i = 0;
		/*
		 * Este bucle primero incrementa la variable i y después la escribe.
		 * Escribe de 1 a 10.
		 */
		while (i < 10) {
			System.out.println(++i);
		}
		System.out.println("*** bucle 5 ***");
		i = 0;
		/*
		 * Este bucle primero evalúa la condición y después incrementa la
		 * variable i. Escribe de 1 a 10
		 */
		while (i++ < 10) {
			System.out.println(i);
		}
		System.out.println("*** bucle 6 ***");
		i = 0;
		/*
		 * Este bucle primero incrementa la variable i y después evalúa la
		 * condición. Escribe de 1 a 9
		 */
		while (++i < 10) {
			System.out.println(i);
		}
		/*
		 * Finalmente, el bucle 7 es un bucle do-while. La principal diferencia es que el
		 * bucle do se ejecuta por lo menos una vez, ya que la evaluació de la
		 * condición está al final. Escribe de 0 a 9.
		 * 
		 * Java recomienda utilizar el bucle while, pero en la práctica uno
		 * puede ser más adecuado que otro.
		 */
		System.out.println("*** bucle 7 ***");
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}
}



















