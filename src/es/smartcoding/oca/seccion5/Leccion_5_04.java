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
 *         Para ser más preciso, una referencia Java puede asignarse a un objeto
 *         del mismo tipo, a un objeto de la superclase, o a un objeto de una
 *         interfaz que implemente ya sea directa o indirectamente.
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
		 * El objeto cc es de tipo ClaseConcreta y hace referencia a un objeto
		 * del mismo tipo.
		 */
		ClaseConcreta cc = new ClaseConcreta();
		/*
		 * El objeto cb es de tipo ClaseBase y hace referencia a un objeto de
		 * tipo ClaseConcreta, una subclase de ClaseBase.
		 */
		ClaseBase cb = new ClaseConcreta();
		/*
		 * El objeto i1 es de tipo I1, la clase ClaseConcreta hereda de
		 * ClaseBase que implementa I1 de forma indirecta a través de I2.
		 */
		I1 i1 = new ClaseConcreta();
	}

}
