/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

import java.io.File;

/**
 * @author pep
 * 
 *         Operadores binarios adicionales
 * 
 *         En esta lección veremos otros operadores como los operadores
 *         relacionales, el operador de asignación etc.
 *
 */
public class Leccion_2_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short x = 2;
		short y = 3;
		/*
		 * Al hacer un casting, o conversión de tipo, le estamos diciendo la
		 * compilador que ignore su comportamiento predeterminado.
		 */
		short z = (short) (x * y);
		/*
		 * Operadores de asignación compuestos.
		 */
		int a = 2, b = 3;
		// La expresión a = a * b; puede escribirse como
		a *= b;
		//
		long m = 10;
		int n = 5;
		// n = m * n; // DOES NOT COMPILE
		n *= m; // Cast implícito
		System.out.println(n);
		// El resultado de una asignación es una expresión en sí mismo.
		int p = 1;
		int q = (p = 2);
		System.out.println(p);
		System.out.println(q);
		/*
		 * Aunque no forma parte del temario instanceof es útil a la hora de
		 * determinar si una instancia es de un determinado tipo (clase o
		 * interfaz).
		 */
		String s = "Oracle Certified Associate";
		if (s instanceof CharSequence) {
			System.out.println(s);
		}
		/*
		 * Los operadores lógicos &, | (o inclusivo) y ^ (o exclusivo) también
		 * se usan a nivel de bit, llamados operadores de bit (bitwise
		 * operators), que NO entran en el examen.
		 */
		int d = 3, e = 2;
		boolean bool1 = d > 3 & e < 10;
		boolean bool2 = d != 3 | d + 2 <= 9;
		boolean bool3 = bool1 & (!bool2 | 3 - 2 > Math.pow(e, 2));
		/*
		 * Los operadores lógicos de circuito corto &&, || son casi idénticos a
		 * los operadores logicos & y |. Sólo se diferencia en que tan pronto
		 * como el resultado es evidente, la evaluación se detiene.
		 */
		/*
		 * La expresión entre paréntesis nunca llegará a evaluarse, es decir, no
		 * se lanzará una excepción por división entre cero.
		 */
		boolean bool4 = true || (d * 3 + e - 1 > e / 0);
		System.out.println(bool4);
		/*
		 * Es muy útil en casos como este, cuando queremos asegurarnos de que
		 * una instancia no es nula antes de invocar un método.
		 */
		String str = null;
		if (str != null && str.length() > 0) {
			System.out.println("String no es nulo y tiene un valor " + str);
		}
		/*
		 * En el examen puedes encontrarte con preguntas como esta, sobre clases
		 * quizas no te sean familiares, pero en general, la lógica es la misma
		 * para cualquier tipo de objeto.
		 */
		File f1 = new File("myFile.txt");
		File f2 = new File("myFile.txt");
		File f3 = f1;
		/*
		 * El operador == evalúa si dos objetos apuntan al mismo objeto (misma
		 * dirección de memoria)
		 */
		System.out.println(f1 == f2); // false
		System.out.println(f3 == f1); // true
	}
}
