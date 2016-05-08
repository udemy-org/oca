/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;



/**
 * @author pep
 * 
 *         La estructura de una clase Java
 * 
 *         En general la estructura de una clase esta compuesta por un nombre de paquete, cero o más órdenes import, el nombre de la clase, sus propiedades y métodos.
 *
 */
public class Leccion_1_01 {

	private String nombre;

	/*
	 * Método print
	 */
	public void print() {
		System.out.println("Bienvenido a OCA");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Leccion_1_01 leccion_1_01 = new Leccion_1_01();
		leccion_1_01.print();

	}

}
