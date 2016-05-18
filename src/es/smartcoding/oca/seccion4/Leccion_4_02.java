/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Trabajando con argumentos variables (varags)
 * 
 *         La regla de oro es que los varargs o argumentos variables deben ser
 *         siempre el último parámetro del método
 *
 */
public class Leccion_4_02 {

	/*
	 * Internamente a es una array de enteros int[]
	 */
	static void m1(int... a) {
		System.out.println(a.length);
	}

	public static void main(String... args) {
		/*
		 * Un método con Varargs se puede invocar mediante una secuencia
		 * separada por comas de argumentos o mediante un array.
		 */
		m1(1, 2, 3);
		m1(new int[] { 1, 2, 3 });
	}

}
