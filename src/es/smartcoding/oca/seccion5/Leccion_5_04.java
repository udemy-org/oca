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
 *         Para ser más preciso, una objeto Java puede asignarse a una
 *         referencia del mismo tipo, a una referencia de la superclase, o a una
 *         referencia de una interfaz que la implemente ya sea directa o
 *         indirectamente.
 * 
 */

interface I1 {
	void f();
}

interface I2 extends I1 {
	void g();
}

abstract class ClaseBase implements I2 {
	public void g() {
		System.out.println("en g()");
	}
}

class MiClaseConcreta extends ClaseBase {
	public void f() {
		System.out.println("en f()");
	}
}

public class Leccion_5_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * En este fragmento de código se crea un único objeto de tipo
		 * ClaseConcreta que se asigna a diferentes referencias
		 */
		/*
		 * El objeto cc es de tipo ClaseConcreta y hace referencia a un objeto
		 * del mismo tipo.
		 */
		MiClaseConcreta cc = new MiClaseConcreta();
		cc.f();
		cc.g();
		/*
		 * El objeto cb es de tipo ClaseBase y hace referencia a un objeto de
		 * tipo ClaseConcreta, una subclase de ClaseBase.
		 */
		ClaseBase cb = cc;
		cb.f();
		cb.g();
		/*
		 * El objeto i1 es de tipo I1, la clase ClaseConcreta hereda de
		 * ClaseBase que implementa I1 de forma indirecta a través de I2.
		 */
		I1 i1 = cc;
		i1.f();
		((I2)i1).g();
	}

}
