/**
 * LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

/**
 * @author pep
 * 
 *         La clase StringBuilder
 * 
 *         En esta lección aprenderemos a crear y utilizar objetos de tipo
 *         StringBuilder y las ventajas que aporta respecto de la clase String.
 * 
 *         La diferencia más importante es que StringBuilder es mutable, o dicho
 *         de otra manera, no es inmutable.
 *
 */
public class Leccion_3_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String alpha = "";
		for (char current = 'a'; current <= 'z'; current++) {
			alpha += current;
		}
		System.out.println(alpha);

	}
}
