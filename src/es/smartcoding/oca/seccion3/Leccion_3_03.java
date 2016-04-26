/**
 *  LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

/**
 * @author pep
 * 
 *         La igualdad entre objetos
 * 
 *         En esta lección abordaremos el tema de la igualdad entre objetos. Por
 *         ejemplo, cuándo decimos que dos objetos de tipo ‘Vehiculo’ son
 *         iguales?
 *
 *
 */
public class Leccion_3_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder("abc");
		StringBuilder two = new StringBuilder("abc");
		StringBuilder three = one.append("d");
		// false
		System.out.println(one == two);
		// true
		System.out.println(one == three);
		/*
		 * La clase StringBuilder NO implementa el método equals por lo tanto se
		 * comporta como '=='.
		 * 
		 * La clase String en cambio sí que implementa el método equals (En el
		 * examen OCA no necesitas saber cómo se implementa el método equals).
		 */
		// false
		System.out.println(one.equals(two));

	}

}
