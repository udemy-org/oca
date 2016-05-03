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
 *         Como ves, creamos un único objeto de MiClaseConcreta que después
 *         asignamos a diferentes referencias y el código compila y funciona sin
 *         necesidad de castings. Esto se conoce como polimorfismo, la habilidad
 *         de un objeto de asignarse a diferentes referencias relacionadas.
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

class C01 {
}

class C02 {
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
		// i1.g(); // No compila
		/*
		 * Cuando se asigna un objeto a una referencia, sólo los miembros
		 * disponibles en ese tipo de referencia estan disponibles sin hacer
		 * cast.
		 * 
		 * Por ejemplo, si asignamos un objeto a una referencia de tipo Object,
		 * sólo estarán disponibles los métodos de la clase Object. Pero el
		 * objeto en sí no ha cambiado. Más tarde pordemos hacer una cast a
		 * MiClaseConcreta y seguiremos teniendo acceso a los miembros de esta
		 * clase.
		 */
		Object object = cc;
		cc = (MiClaseConcreta) object;
		cc.f();
		cc.g();

		/*
		 * Casting tiene una serie de reglas:
		 * 
		 * 1. Convertir un objeto de una subclase a una superclase no necesita
		 * un casting explícito.
		 * 
		 * 2. Convertir un objeto de una superclase a un subclase SÍ que
		 * necesita un casting específico.
		 * 
		 * 3. El compilador no permitirá conversiones imposibles.
		 * 
		 * 4. Incluso si el código compila, si el objeto a convertir no es de
		 * hecho una instancia de la otra clase, en tiempo de ejecució lanzará
		 * una excepción de tipo java.lang.ClassCastException.
		 */
		/*
		 * Esta conversión compila porque Object y String forman parte de la
		 * jerarquía pero lanza una excepción java.lang.ClassCastException en
		 * tiempo de ejecución.
		 */
		String strObject = (String) object;
		Number number = new Integer(1);
		// String strNumber = (String) number; // No compila, conversión
		// imposible
	}

}
