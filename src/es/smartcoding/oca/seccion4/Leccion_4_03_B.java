/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Para acceder a los miembros (propiedades y métodos) estáticos de una
 *         clase no se requiere una instancia. Por eso se llaman miembros de
 *         clase, en oposición a los miembros de instancia.
 * 
 *         Todos los miembros estáticos son compartidos entre todos los usuarios
 *         de la clase, como si existieran independientemente de cualquier
 *         instancia de la clase.
 * 
 *         Cada instancia de una clase tiene una cópia de las variables de
 *         instancia (no static) pero sólo hay una copia de las variables de
 *         clase (static) que es compartida por todas las instancias de la
 *         clase. En cuanto a los métodos, tanto de instancia como de clase
 *         sólamente hay una copia a efectos de eficiencia, y los parámetros y
 *         variables locales se sitúan en la pila.
 * 
 *         El método main, que hemos usado ampliamente, es público y estático
 *         con el objetivo de que el cargador de clases no necesite crear una
 *         instancia de la clase para invocarlo.
 * 
 *         Aparte del método main, declaramos miembros estáticos en varios
 *         escenarios:
 * 
 *         1. Cuando queremos definir métodos de utilidad, como hace la clase
 *         Math.
 * 
 *         2. Cuando queremmos definir estado que sea compartido por todas las
 *         instancias de una clase.
 * 
 *         Y RECUERDA, LOS METODOS ESTÁTICOS SÓLO PUEDEN ACCEDER A OTROS
 *         MIEMBROS ESTÁTICOS. EN CAMBIO, LOS MÉTODOS NO ESTÁTICOS PUEDEN
 *         ACCERDER A MIEMBROS DE CLASE (ESTÁTICOS) COMO DE INSTANCIA (NO
 *         ESTÁTICOS).
 */

class DemoStatic {
	public static int count = 0;
	private int i = 0;

	public DemoStatic() {
		count++;
	}

	public static void m1() {
		// System.out.println(i); // No compila
		System.out.println(count);
	}

	public void m2() {
		System.out.println(i);
		System.out.println(count);
	}
}

public class Leccion_4_03_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DemoStatic.m1();
		DemoStatic ds1 = new DemoStatic();
		DemoStatic ds2 = new DemoStatic();
		DemoStatic ds3 = new DemoStatic();
		DemoStatic.m1();
		ds1.m1();
		ds2.m1();
		ds3.m1();
		ds1 = null;
		/*
		 * ds1 es todavia un objeto DemoStatic!!!
		 * 
		 * Totalmente válido para invocar un método estático.
		 */
		ds1.m1();
	}

}
