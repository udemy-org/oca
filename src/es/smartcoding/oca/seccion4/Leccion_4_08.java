/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author pep
 * 
 *         Las expresiones lambda simples
 * 
 *         En esta lección aprenderemos a escribir expresiones sencillas al
 *         estilo del paradigma de programación funcional.
 * 
 *         En esencia Java es un lenguaje orientado a objetos, pero Java 8
 *         añadió la posibilidad de escribir código al estilo funcional, más
 *         declarativo.
 * 
 *         La programación funcional se centra en el Qué queremos hacer y no en
 *         el Cómo.
 * 
 *         La programación funcional utiliza expresiones lambda que pueden
 *         definir como métodos anónimos ya que tiene parámetros y cuerpo pero
 *         no un nombre como un verdadero método.
 * 
 *         Las expresionres lambda o simplemente lambdas se las conoce como
 *         closures en otros lenguajes, aunque Java las ha simplificado
 *         enormemente.
 * 
 *         El examen OCA tan sólo revisa conceptos fundamentales de las
 *         expresiones lambda que se ven en profundidad en el examen Oracle
 *         Certified Programmer (OCP).
 * 
 *         De cara al examen OCA necesitas conocer la interfaz Predicate, una
 *         interfaz funcional porque define un único método abstracto test.
 *
 */
public class Leccion_4_08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<String> p1 = s -> s.startsWith("A");
		/*
		 * Este código define una instancia de Predicate con un expresión lambda
		 * y es equivalente a este otro.
		 */
		Predicate<String> p2 = new Predicate<String>() {

			@Override
			public boolean test(String s) {
				return s.startsWith("A");
			}

		};
		/*
		 * Como ves las lambdas son muy compactas y se pueden combinar para
		 * crear predicados complejos.
		 */
		Predicate<String> p3 = p1.and(s -> s.endsWith("X")).or(
				s -> s.contains("M"));
		Predicate<String> p4 = Predicate.isEqual("OCA");
		Predicate<String> p5 = p4.negate();
		/*
		 * Java 8 declara múltiples métodos donde se pueden aplicar predicados,
		 * pero para el examen sólo necesitas conocer uno, el método removeIf de
		 * la clase ArrayList.
		 */
		List<String> lista1 = Arrays.asList("ABCDMX", "ABCX", "ABCD", "FGHX", "DFMTU");
		lista1 = new ArrayList<String>(lista1);
		lista1.removeIf(p3);
		System.out.println(lista1);

	}

}
