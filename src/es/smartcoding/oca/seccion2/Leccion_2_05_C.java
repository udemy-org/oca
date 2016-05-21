/**
 * 
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Las estructuras de control de Java
 * 
 *         Desde la versión 5.0 de Java hay dos tipos de bucles for. El for
 *         básico y el for mejorado también llamado for-each.
 *
 */
public class Leccion_2_05_C {

	public static void main(String[] args) {
		/*
		 * Un bucle for tiene tres partes todas opcionales. De izquierda a derecha, la
		 * primera es la de inicialización, la segunda es la condición de final de bucle
		 * y la tercera la actualización.
		 */
		/*
		 * Este es un bucle infinito.
		 */
		System.out.println("*** Bucle 1 ***");
//		 for (;;) {
//		 }
		/*
		 * El for básico tiene este aspecto. Escribe de 0 a 9.
		 */
		System.out.println("*** Bucle 2 ***");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("*** Bucle 3 ***");
		/*
		 * Este bucle es totalmente equivalente al anterior. Escribe de 0 a 9.
		 */
		int i = 0;
		for (; i < 10;) {
			System.out.println(i);
			i++;
		}
		System.out.println("*** Bucle 4 ***");
		/*
		 * Un bucle for puede declarar más de una varible todas de cualquier
		 * tipo numérico. Escribe de 0.0 a 9.0.
		 */
		for (double j = 0, k = 10; j < k;) {
			System.out.println(j);
			j++;
		}

		/*
		 * El bucle for mejorado, o bucle for-each introducido en Java 5.0 se
		 * compone de dos partes una declaración de variable y un objeto sobre el que
		 * iterar.
		 * 
		 * El objeto sobre el que iteramos debe ser un array o un objeto que
		 * implementa java.lang.Iterable, lo que incluye la mayor parte de las
		 * colecciones, que contenga elementos del mismo tipo que la variable declarada en el bucle.
		 */
		String[] v = new String[] {"Oracle", "Certified", "Associate"};
		for (String s : v) {
			System.out.println(s);
		}
		
	}

}


















