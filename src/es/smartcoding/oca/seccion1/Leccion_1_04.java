/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La creación de objetos
 * 
 *         Aunque todas las clases tienen un constructor por defecto (sin parámetros), en este ejemplo, creamos un constructor por defecto personalizado.
 *         Cuál crees que será la salida de este programa?
 *
 */

public class Leccion_1_04 {

	public static void main(String[] args) {
		// new llama al Constructor de la clase
		Coche c = new Coche();
		System.out.println(c.numPuertas);
	}

}

class Coche {
	int numPuertas = 1;

	public Coche() {
		System.out.println("En constructor de la clase Coche");
		numPuertas = 2;
	}

	// Bloques de inicialización de instancia. Se ejecutan en orden.
	{	System.out.println("En bloque 1"); numPuertas = 3; }

	{ 	System.out.println("En bloque 2"); numPuertas = 4; }

}










