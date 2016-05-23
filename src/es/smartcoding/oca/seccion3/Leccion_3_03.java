/**
 *  LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

/**
 * @author pep
 * 
 *         La igualdad entre objetos
 * 
 *         Te ha planteado alguna vez cuándo decimos que dos objetos, por ejemplo, de tipo ‘Vehiculo’ son iguales?
 *         
 *         Se consigue sobrescribiendo el metodo equals() de la clase Object. Aunque en el examen OCA no necesitas saber cómo se implementa el método equals.
 *
 *
 */
public class Leccion_3_03 {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder("abc");
		StringBuilder two = new StringBuilder("abc");
		StringBuilder three = one.append("d");
		System.out.println("one == two: " + (one == two));
		System.out.println("one == three: " + (one == three));
		/*
		 * Lo que sí debes saber es que la clase StringBuilder NO implementa el método equals, sino que lo hereda de Object con la implementación por defecto, 
		 * 
		 * por lo tanto se comporta como '=='.
		 * 
		 * La clase String en cambio sí que implementa el método equals.
		 */
		System.out.println("one.equals(two): " + one.equals(two));
		System.out.println("one.equals(three): " + one.equals(three));
	}

}
