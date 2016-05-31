/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

import static java.util.Arrays.asList;

/*
 * No se pueden importar dos clases con el mismo nombre.
 */
import java.util.List;
// import java.awt.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.*;

/*
 * Aunque usando comodines es posible importar implícitamente un método más de una vez!!!.
 */

/**
 * @author pep
 * 
 *         Para acceder a los miembros (propiedades y métodos) estáticos de una clase no se requiere una instancia. Por eso se llaman miembros de
 *         clase, en oposición a los miembros de instancia.
 * 
 *         Todos los miembros estáticos son compartidos entre todos los usuarios de la clase, como si existieran independientemente de cualquier
 *         instancia de la clase.
 * 
 *         Cada instancia de una clase tiene una cópia de las variables de instancia (no static) pero sólo hay una copia de las variables de
 *         clase (static) que es compartida por todas las instancias de la clase. En cuanto a los métodos, tanto de instancia como de clase
 *         sólamente hay una copia a efectos de eficiencia, y los parámetros y variables locales se sitúan en la pila.
 * 
 *         El método main, que hemos usado ampliamente, es público y estático con el objetivo de que sea accesible desde cualquier parte y que el
 *         cargador de clases no necesite crear una instancia de la clase para invocarlo.
 * 
 *         Aparte del método main, declaramos miembros estáticos en varios escenarios:
 * 
 *         1. Cuando queremos definir métodos de utilidad, como hace la clase Math.
 * 
 *         2. Cuando queremos definir estado que sea compartido por todas las instancias de una clase. Por ejemplo, el número de instancias que tiene un clase.
 * 
 *         Y RECUERDA, LOS METODOS ESTÁTICOS SÓLO PUEDEN ACCEDER A OTROS MIEMBROS ESTÁTICOS. EN CAMBIO, LOS MÉTODOS DE INSTANCIA (NO ESTÁTICOS) 
 *         PUEDEN ACCERDER TANTO A MIEMBROS DE CLASE (ESTÁTICOS) COMO DE INSTANCIA (NO ESTÁTICOS).
 *         
 */

class DemoStatic {
	public static int count = 0;
	private int i = 0;

	public DemoStatic() {
		count++;
	}

	public static void m1() {
		// System.out.println(i); // No compila, un miembro static no puede acceder a miembros de instancia.
		System.out.println(count);
	}

	public void m2() {
		System.out.println(i);
		System.out.println(count);
	}
}

class DemoStaticInit {
	/*
	 * En cuanto a las constantes estáticas o bien se inicializan cuando se declaran o bien en un bloque estático (sólo una vez), de otra forma se genera un error de compilación.
	 */
	private static final int MAX_ELEM;
	private static final int CONST1 = 0;
	// private static final int CONST2; // No compila, no está inicializada
	/*
	 * Los bloques de inicialización estáticos se ejecutan cuando la clase se usa por primera vez.
	 * 
	 * Cuando se crea una instancia de esta clase, primero se ejecuta el código de los bloques estáticos (en orden de aparición) y después el código de los bloques de instancia
	 * (tambien en orden).
	 * 
	 * De todas formas, se recomienda no utilizar bloques de inicialización de instancia y trasladar ese código al constructor.
	 * 
	 */
	static {
		System.out.println("En bloque estático");
		int max_filas = 3;
		int max_cols = 5;
		MAX_ELEM = max_filas * max_cols;
	}

	{
		System.out.println("En bloque de instancia");
	}

	public static void m1() {
		System.out.println(MAX_ELEM);
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
		 * ds1 es todavia un objeto DemoStatic
		 * 
		 * Totalmente válido para invocar un método estático!!!
		 */
		ds1.m1();
		/*
		 * Como invocamos un método estático, sólamente el bloque estático se ejecuta, pero sólo una vez.
		 */
		DemoStaticInit.m1();
		DemoStaticInit.m1();
		/*
		 * En este caso creamos una instancia de la clase DemoStaticInit, por lo tanto, si no se ha ejecutado ya, 
		 * se invoca el código de inicialización estático primero y después el código de inicialización de instancia.
		 */
		DemoStaticInit dsi = new DemoStaticInit();
		/*
		 * En cuanto a las ordenes import, recuerda, así como los imports normales importan clases, los imports estáticos importan miembros estáticos (como métodos) de clases concretas.
		 */
		List<String> list1 = asList("alfa", "bravo");
		/*
		 * Fíjate bien que el import estático importa el método asList y no la clase Arrays.
		 */
		// List<String> list2 = Arrays.asList("alfa", "bravo"); // No compila
	}

}

















