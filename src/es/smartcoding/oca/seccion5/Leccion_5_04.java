/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         El polimorfismo
 * 
 *         En esta lección estudiaremos uno de los pilares de la Programación
 *         Orientada a Objetos: el polimorfismo.
 * 
 *         Java soporta el polimorfismo, la propiedad que tienen los objetos de
 *         tomar diferentes formas.
 * 
 *         Para ser más preciso, un objeto Java puede asignarse a una referencia
 *         del mismo tipo que el objeto, a una referencia a la superclase del
 *         objeto, o una referencia a una interfaz que implemente el objeto,
 *         bien directa o indirectamente.
 * 
 *
 */

interface I1 {

}

interface I2 extends I1 {

}

class ClaseBase implements I2 {

}

class ClaseConcreta extends ClaseBase {

}

public class Leccion_5_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * El objeto b1 es de tipo B y hace referencia a un objeto del mismo
		 * tipo.
		 */
		ClaseConcreta b1 = new ClaseConcreta();
		/*
		 * El objeto b2 es de tipo A y hace referencia a un objeto de tipo B,
		 * una subclase de A.
		 */
		ClaseBase b2 = new ClaseConcreta();
		/*
		 * El objeto b3 es de tipo K, la clase B implementa K de forma
		 * indirecta.
		 */
		I1 b3 = new ClaseConcreta();
	}

}
