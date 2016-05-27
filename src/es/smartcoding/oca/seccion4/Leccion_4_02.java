/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Trabajando con argumentos variables (varags)
 * 
 *         La regla de oro es que los varargs o argumentos variables deben ser siempre el último parámetro del método
 *
 */
public class Leccion_4_02 {
	
	/*
	 * No compila
	 */
	// void m2(String ...args, int i) {}

	/*
	 * Internamente este parámetro variable es una array de enteros int[]
	 */
	static void m1(int i, int... a) {
		System.out.println("en m1(int...): " + a.length);
	}

	public static void main(String... args) {
		/*
		 * Un método con parámetros variables se puede invocar mediante una secuencia separada por comas de argumentos o mediante un array. Aunque no es estrictamente igual.
		 */
		m1(1, 2, 3);
		//m1(new int[] { 1, 2, 3 });
	}

}






