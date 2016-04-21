/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         Referencias a objetos vs tipos primitivos
 * 
 *         En esta lección abordaremos los dos tipos de datos que nos podemos
 *         encontrar tipos primitivos y referencias a objetos.
 * 
 *         Una referencia apunta a un objeto (una instancia de una clase). Es
 *         decir contiene la dirección de memoria donde esta el objeto al que
 *         apunta.
 *
 */
public class Leccion_1_05_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Hay dos formas de asignar un valor a una referencia:
		 * 
		 * 1. Creando una instancia de la clase con new
		 * 
		 * 2. Asignando otra refencia del mismo tipo
		 * 
		 * Los objetos en sí, no tienen nombre, sólo una dirección y solamente
		 * pueden ser accedidos mediante una referencia.
		 * 
		 * La diferencia clave entre referencias y tipos primitivos es que las
		 * referencias pueden inicializarse con null y los tipos primitivos no.
		 * Asímismo, los tipos primitivos no tienen miembros (métodos o campos)
		 * mientas que a través de las referencias podemos invocar los métodos
		 * de su clase.
		 */
		String s0 = null;
		String s1 = new String("OCA");
		String s2 = s1;
		/*
		 * La clase String es un caso particular que permite inicializar una
		 * instacia sin new.
		 */
		String s3 = "OCA";
		// java.lang.NullPointerException
		System.out.println(s0.length());

	}

}
