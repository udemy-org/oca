/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La inicialización de variables por defecto
 * 
 *         En esta lección veremos qué valores toma por defecto cada tipo de
 *         variable y alguna diferencia sutil entre propiedades y variables
 *         locales.
 * 
 *         Las variables locales son las variables que se declaran dentro de un
 *         método y deben ser inicializadas antes de ser usadas.
 * 
 *         El resto de variables son los campos de la clase también se conocen
 *         como variables de instancia porque cada instancia puede tener valores
 *         diferentes. Si son estáticas, se comparten entre todas las instancias
 *         de esa clase y se llaman variables de clase.
 * 
 *         Las variables de instancia toman valores por defecto:
 * 
 *         boolean (false), byte, short, int y long (0), float y double (0.0),
 *         char ('\u0000'), todas las referencias a objetos (null).
 * 
 *
 */
public class Leccion_1_07 {

	/* null por defecto */
	String s;
	/* o por defecto */
	static int v;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;

		// System.out.println(x); // NO COMPILA

	}

}
