/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La visibilidad de una variable
 * 
 *         En esta lección analizaremos el alcance o visibilidad de una
 *         variable, es decir, en qué parte del código se puede utilizar.
 * 
 *         Las variables locales (y parametros) tienen alcance local.
 * 
 *         Las variables declaradas en un bloque tienen alzance en ese bloque.
 *
 */
public class Leccion_1_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		{
			int j = 0;
			{
				int k = 0;
			}
			// k++; // NO COMPILA
		}
		i++; // OK
		// j++; // NO COMPILA
	}
}
