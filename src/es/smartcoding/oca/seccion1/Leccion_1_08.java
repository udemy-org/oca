/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La visibilidad de una variable
 * 
 *         Las variables locales (incluídos los parametros de los métodos) tienen alcance local, es decir, sólo son visibles dentro del método que las contiene.
 *         Las variables declaradas en un bloque tienen alzance en ese bloque.
 *         
 */
public class Leccion_1_08 {

	public static void main(String[] args) {
		int i = 0;
		{
			int j = 0;
			{
				int k = 0;
				i++; // OK
				j++; // OK
				k++; // OK
			}
			i++; // OK
			j++; // OK
//			k++;
		}
		i++; // OK
//		j++;
//		k++;
	}
}
