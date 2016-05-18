/**
 *  LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

/**
 * @author pep
 * 
 *         La creación y manipulación de cadenas
 * 
 *         En esta lección veremos que un String es una secuencia de
 *         caracteres, cómo crear objetos de tipo String y cómo manipularlos,
 *         así como la naturaleza inmutable de la clase String.
 *
 */
public class Leccion_3_01 {

	public static void main(String[] args) {
		/*
		 * Estas cadenas no forman parte del pool, sus direcciones de memoria
		 * son diferentes, por lo tanto no son iguales.
		 */
		String s1 = new String("OCA");
		String s2 = new String("OCA");
		/*
		 * Java sabe que las cadenas ocupan entre el 25% y el 40% de la memoria
		 * de un programa, por eso ha creado un área (pool) de cadena donde
		 * alberga cadenas repetidas para que no ocupen espacio extra.
		 * 
		 * Estas cadenas van al pool, como son iguales, ocupan la misma
		 * dirección de memoria por lo tanto son iguales.
		 */
		String s3 = "OCA";
		String s4 = "OCA";
		// false
		System.out.println(s1 == s2);
		// false
		System.out.println(s1 == s3);
		// true
		System.out.println(s3 == s4);
		// 3
		System.out.println(1 + 2);
		// ab
		System.out.println("a" + "b");
		// Si un opernado es de tipo cadena el resultado será una cadena: ab3
		System.out.println("a" + "b" + 3);
		// La expresión se evalúa de izquierda a derecha: 3c
		System.out.println(1 + 2 + "c");
		String s = "1";
		s += "2";
		// s = "12" + 3
		s += 3;
		// 123
		System.out.println(s);
		/*
		 * Un objeto String es inmutable (no puede modificarse) y final.
		 */
		String s5 = "a";
		String s6 = s5.concat("b");
		// s6 no se modifica
		s6.concat("c");
		System.out.println(s6);
		String s7 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		/*
		 * Durante el examen tendrás que demostrar que sabes utilizar los
		 * métodos básicos de la clase String.
		 */
		System.out.println(s7.length());
		// Empieza desde cero
		System.out.println(s7.charAt(5));
		System.out.println(s7.indexOf('M'));
		System.out.println(s7.indexOf("M", 20));
		System.out.println(s7.indexOf("ABCD"));
		System.out.println(s7.substring(20));
		System.out.println(s7.substring(5, 7));
		System.out.println(s7.substring(10, s7.indexOf("Q")));
		// cadena vacia
		System.out.println(s7.substring(5, 5));
		// Lanza java.lang.StringIndexOutOfBoundsException:
		// System.out.println(s7.substring(5, 3));
		// Lanza java.lang.StringIndexOutOfBoundsException:
		// System.out.println(s7.substring(5, 30));
		System.out.println(s7.toLowerCase());
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("ABC"));
		System.out.println("abc".equalsIgnoreCase("abc"));
		System.out.println(s7.startsWith("ABC"));
		System.out.println(s7.contains("FGHJ"));
		System.out.println(s7.replace('A', 'a'));
		System.out.println("*** " + "   abc def      ".trim() + " ***");
	}

}
