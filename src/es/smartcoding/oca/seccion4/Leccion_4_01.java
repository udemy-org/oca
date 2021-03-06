/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

import java.util.List;

/**
 * @author pep
 * 
 *         El diseño de métodos
 * 
 *         La definición de un método consta de varias partes:
 * 
 *         1. Un modificador de acceso opcional.
 * 
 *         2. Uno o más especificadores opcionales.
 * 
 *         3. Un tipo de retorno obligatorio.
 * 
 *         4. Un nombre de método obligatorio (que sigue las reglas de construcción de cualquier otro identificador).
 * 
 *         5. Una lista de parámetros entre parentesis que puede ser vacia.
 * 
 *         6. Una lista opcional de excepciones.
 * 
 *         7. Un bloque de código que puede ser un bloque vacio.
 *
 */
public class Leccion_4_01 {

	/**********
	 * Este es un ejemplo de definición de método sólo con los elementos  obligatorios. Como no tiene ningún modificador de acceso decimos que su
	 * modificador de acceso es default (por defecto).
	 */
	void m1() {
	}

	/*
	 * Los modificadores de acceso opcionales, aparte de default, son public, protected o private.
	 */
	public void m2() {
		return;
	}

	protected void m3() {

	}

	private void m4() {

	}

	/**********
	 * Los especificadores opcionales son static, abstract, final, synchronized, native y strictfp.
	 * 
	 * static, abstract y final se tratan en detalle posteriormente; 
	 * synchronized forma parte del curso OCP (Oracle Certified Programmer) y tanto native como strictfp no forman parte ni de uno ni de otro.
	 * 
	 */
	
	/*
	 * Un método static significa que es un miembro de clase, no se necesita una instancia de la clase para invocarlo.
	 */
	public static void m5() {

	}

	/*
	 * Un método final significa que las subclases no puede sobrescribirlo pero sobrecargarlo sí.
	 */
	public final void m6() {

	}

	/*
	 * Los modificadores de acceso opcionales y los especificadores opcionales pueden intercambiarse pero no es una práctica recomendable.
	 */
	public static final void m7() {

	}

	final public static void m8() {

	}

	/**********
	 * En Java un método puede retornar cualquier tipo, ya sea primitivo o referencia a objeto o void si no retorna nada. Y aunque no retorne nada, puede haber un return.
	 */

	String m9() {
		return null;
	}

	String[] m10() {
		return null;
	}

	String[][] m11() {
		return null;
	}

	List<String> m12() {
		return null;
	}

	List<String[][]> m13() {
		return null;
	}

	void m14() {
		return;
	}

	/**********
	 * Por ultimo, un consejo, aunque es posible, no uses nombres como este para declarar ni tus métodos ni tus variables o clases, identificadores en general.
	 */
	void $() {

	}

	/*
	 * La lista de parámetros separados por comas es opcional. Pero los paréntesis siempre tienen que estar presentes.
	 */

	void m15(int a, double b) {
		System.out.println("en m15(int, double)");
	}

	/*
	 * A veces, preveemos que un método puede lanzar una o más excepciones. En estos casos, podemos declarar un lista separada por comas de excepciones
	 * precedida por la palabra clave throws.
	 */

	void m16() throws IllegalArgumentException, InterruptedException {

	}

	public static void main(String[] args) {
		// Así se invoca un método de instancia
		Leccion_4_01 l = new Leccion_4_01();
		l.m15(1, 1.0);
	}

}












