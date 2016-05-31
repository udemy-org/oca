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
 *         En esencia Java es un lenguaje orientado a objetos, pero Java 8 añadió la posibilidad de escribir código al estilo funcional, más declarativo.
 * 
 *         La programación funcional se centra en el Qué queremos hacer y no en el Cómo.
 * 
 *         La programación funcional utiliza expresiones lambda que se pueden interpretar como métodos anónimos ya que tiene parámetros y cuerpo
 *         pero no un nombre como un verdadero método.
 * 
 *         Las expresionres lambda o simplemente lambdas se las conoce como closures en otros lenguajes, aunque Java las ha simplificado enormemente.
 * 
 *         El examen OCA tan sólo revisa conceptos fundamentales de las expresiones lambda que se ven en profundidad en el examen Oracle Certified Professional (OCP).
 * 
 *         De cara al examen OCA necesitas conocer la interfaz Predicate, una interfaz funcional porque define un único método abstracto test.
 * 
 *         De todas formas, te recomiendo que dediques a las expresiones lambda, referencias a métodos, interfaces funcionales y streams
 *         algún tiempo porque cada vez vas a estar más presentes.
 *
 */
public class Leccion_4_08 {

	public static void main(String[] args) {
		
		// Así se definía una interfaz antes
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.startsWith("A");
			}
		};
		/*
		 * Este código define una instancia de Predicate con un expresión lambda y es equivalente al anterior. Como ves las lambdas son muy compactas.
		 */
		Predicate<String> p2 = s -> s.startsWith("A");
		/*
		 * Java 8 declara múltiples métodos donde se pueden aplicar predicados,  pero para el examen sólo necesitas conocer uno, el método removeIf de la clase ArrayList.
		 */
		List<String> lista1 = Arrays.asList("ABCDMX", "ABCX", "ABCD", "FGHX",
				"DFMTU");
		lista1 = new ArrayList<String>(lista1);
		/*
		 * Este sencillo ejemplo define una expresión lambda que implementa Predicate. 
		 * A continuación el método removeIf la utiliza para elimitar cadenas de la lista, que empiezan por A
		 */
		lista1.removeIf(p2);
		System.out.println(lista1);

	}

}



















//Predicate<String> p1 = s -> s.startsWith("A");
//
//Predicate<String> p3 = p1.and(s -> s.endsWith("X")).or(
//		s -> s.contains("M"));
//// Compara mediante Objects.equal(Object, Object);
//Predicate<String> p4 = Predicate.isEqual("OCA");
//Predicate<String> p5 = p4.negate();


/*
 * Aunque estrictamente no forma parte del examen, la clase Objects tiene una serie de métodos static que pueden ser útiles en el día a día, como este:
 */
//String a = "abc ", b = " ABC ";
//Comparator<String> c = (s1, s2) -> s1.trim().toUpperCase().compareTo(s2.trim().toUpperCase());
//System.out.println(Objects.compare(a, b, c));
//System.out.println(Objects.hash(a, b, c));
//a = Objects.requireNonNull(a);