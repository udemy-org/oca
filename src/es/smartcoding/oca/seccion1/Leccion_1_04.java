/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

import java.util.Random;

/**
 * @author pep
 * 
 *         La creación de objetos
 * 
 *         En esta lección estudiaremos el proceso de creación de objetos y el
 *         orden de ejecución de los diferentes elementos: definición de
 *         propiedades, bloques, constructores.
 *
 */
public class Leccion_1_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new llama al Constructor de la clase
		Random r = new Random();
		System.out.println(r.nextDouble());
		Coche c = new Coche();
		System.out.println(c.numPuertas);
	}

}

/*
 * RECUERDA: Todas las clases tienen un constructor por defecto -sin parámetros
 */
class Coche {
	// {System.out.println(numPuertas);} // NO COMPILA
	int numPuertas = 1;
	String color;
	
	public Coche() {
		System.out.println("En constructor de la clase Coche");
		numPuertas = 4;
		color = "gris";
	}
	
	// Bloque de inicialización de instancia. Se ejecutan en orden.
	{
		System.out.println("En bloque 1");
		numPuertas = 2;
	}
	
	{
		System.out.println("En bloque 2");
		numPuertas = 3;
	}

	
}