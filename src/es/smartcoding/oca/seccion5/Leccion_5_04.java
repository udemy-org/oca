/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         El polimorfismo
 * 
 *         Un objeto Java puede asignarse:
 * 
 *         1. A una referencia del mismo tipo
 * 
 *         2. A una referencia de la superclase
 * 
 *         3. Y a una referencia de una interfaz que implemente ya sea directa o indirectamente
 * 
 *         Como ves, creamos un único objeto de MiClaseConcreta que después asignamos a diferentes referencias y el código compila y funciona sin
 *         necesidad de castings. Esto se conoce como polimorfismo, la habilidad de un objeto de asignarse a diferentes referencias relacionadas.
 */

interface I1 {
	void f();

	void print(I1 i);
}

interface I2 extends I1 {
	void g();
}

class ClaseBase implements I2 {
	public void g() {
		System.out.println("en CodeBase.g()");
	}

	@Override
	public void f() {
		System.out.println("en CodeBase.f()");
	}

	@Override
	public void print(I1 i) {
		System.out.println(i);
	}

}

class MiClaseConcreta extends ClaseBase {
	public void g() {
		System.out.println("en MiClaseConcreta.g()");
	}

	public void f() {
		System.out.println("en MiClaseConcreta f()");
	}
}

public class Leccion_5_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * En este fragmento de código se crea un único objeto de tipo MiClaseConcreta que se asigna a diferentes referencias.
		 * La variable cc es de tipo MiClaseConcreta y hace referencia a un objeto del mismo tipo.
		 */
		MiClaseConcreta cc = new MiClaseConcreta();
		cc.f();
		cc.g();
		/*
		 * La variable cb es de tipo ClaseBase y hace referencia a un objeto de tipo MiClaseConcreta, una subclase de ClaseBase.
		 */
		ClaseBase cb = cc;
		cb.f();
		cb.g();
		/*
		 * El objeto i1 es de tipo I1, la clase MiClaseConcreta hereda de ClaseBase que implementa I1 de forma indirecta a través de I2. 
		 * Fíjate que la interfaz I1 no conoce el método g().
		 */
		I1 i1 = cc;
		i1.f();
		// i1.g(); // No compila. 
		/*
		 * Cuando se asigna un objeto a una referencia, sólo los miembros disponibles en el tipo de la referencia estan disponibles.
		 * 
		 * Por ejemplo, si asignamos un objeto de MiClaConcreta a una referencia de tipo Object, sólo estarán disponibles los métodos de la clase Object. Pero el
		 * objeto en sí no ha cambiado. Más tarde podemos hacer una cast a MiClaseConcreta y seguiremos teniendo acceso a los miembros de esta clase.
		 */
		Object object = cc;
		cc = (MiClaseConcreta) object;
		cc.f();
		cc.g();

		/*
		 * El casting tiene una serie de reglas:
		 * 
		 * 1. Convertir un objeto de una subclase a una superclase no necesita un casting explícito.
		 * 
		 * 2. Convertir un objeto de una superclase a un subclase SÍ que necesita un casting específico.
		 * 
		 * 3. El compilador no permitirá conversiones imposibles.
		 * 
		 * 4. Incluso cuando el código compila, si el objeto a convertir no es de hecho una instancia de la otra clase, se lanzará una excepción de
		 * tipo java.lang.ClassCastException en tiempo de ejecució.
		 */
		/*
		 * Esta conversión compila porque Object y String forman parte de la jerarquía pero lanza una excepción java.lang.ClassCastException en tiempo de ejecución.
		 */
		// String strObject = (String) object;
		Number number = new Integer(1);
		/*
		 * No compila, las clases Number y String no están relacionadas.
		 */
		// String strNumber = (String) number;

		/*
		 * Aunque no forma parte del examen, el operador instanceof puede usarse para comprobar un cast en tiempo de ejecución.
		 */

		/*
		 * Pero donde el polimorfismo es verdaderamente fuerte es el soporte de métodos virtuales (todos aquellos métodos que no son finales,
		 * estáticos ni privados) como g(), donde la implementación a ejecutar se decide en tiempo de ejecución, siempre en función del objeto y no
		 * del tipo de la referencia. En este ejemplo, la instancia claseBase correctamente invocara al método g() de MiClaseConcreta.
		 */
		ClaseBase claseBase = new MiClaseConcreta();
		claseBase.g();
		/*
		 * Un resultado interesante del polimorfismo son los parámetros polimorficos de un método. En otras palabras, se trata de que los
		 * parámetros de un método no sean clases concretas sino interfaces o superclases, lo que amplia el rango de argumentos formales.
		 * 
		 * A modo de ejemplo es mas recomendable definir un método f() con un parámetro de tipo List que de tipo ArrayList 
		 * porque List es una interfaz y ArrayList es una clase concreta.
		 */
		claseBase.print(claseBase);

	}

}







