/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Las estructuras de control de Java
 * 
 *         En esta lección revisaremos los condicionales y bucles básicamente.
 * 
 *         Una instrucción Java es una unidad de ejecución completa, terminada
 *         en ;
 * 
 *         Un bloque de código es una o más instrucciones Java delimitadas por
 *         {}
 * 
 *
 *
 */
public class Leccion_2_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Como regla general utiliza siempre bloques ({}) con la orden if.
		 * 
		 * Este ejemplo es engañoso.
		 * 
		 * El primero utiliza bloques mientras que el segundo no.
		 * 
		 * En el segundo siempre se ejecuta la orden System.out.println().
		 */
		int k = 10;
		if (k < 5) {
			k++;
			System.out.println(k);
		}
		int l = 10;
		if (l < 5)
			l++;
		System.out.println(l);
		/*
		 * Con la orden if-then-else debemos tener especial cuidado.
		 */
		int m = 99;
		if (m < 10) {
			// bloque 1
		}
		if (m < 20) {
			// bloque 2
		}
		/*
		 * El código anterior sería más correcto escribirlo como
		 */
		if (m < 10) {
			// bloque 1
		} else if (m < 20) {
			// bloque 2
		}
		/*
		 * El orden es importante.
		 * 
		 * El bloque 2 nunca se ejecutará, porque un número menor de 10 es menor
		 * de 20 por definición.
		 */
		if (m < 20) {
			// bloque 1
		} else if (m < 10) {
			// bloque 2
		}

	}

}
