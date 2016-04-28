/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

import es.smartcoding.oca.seccion4.code.p1.Alfa;

/**
 * @author pep
 * 
 *         Aplicando los modificadores de acceso
 * 
 *         Hay cuatro modificadores de acceso public, private, protected y
 *         default. En esta lección aprenderemos el significado de cada
 *         modificador de acceso de más a menos restrictivo y cómo utilizarlos
 *         así como el significado de de la palabra clave static.
 * 
 *         Los miembros private sólo son accesibles desde la propia clase.
 * 
 *         Los miembros default además son accesibles desde el mismo paquete.
 * 
 *         Los miembros protected además son accesibles desde las subclases.
 * 
 *         Los miembros public son accesibles desde cualquier parte.
 *
 * 
 */
public class Leccion_4_03_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alfa alfa = new Alfa();
		/*
		 * private, sólo es accesible desde la propia clase.
		 */
		// alfa.f(); // No compila
		/*
		 * default, sólo es accesible desde la propia clase y el paquete donde
		 * está definida.
		 */
		// alfa.g(); // No compila
		/*
		 * protected, sólo es accesible desde la propia clase, el paquete donde
		 * está definida y subclases.
		 */
		// alfa.h(); // No compila
		/*
		 * public, accesible desde cualquier parte
		 */
		alfa.i();

	}

	/*
	 * Esta es una de las partes más duras del examen. Asegurate de que la
	 * trabajas a fondo, revisando estos ejemplos hasta que los entiendas
	 * completamente, respondiendo preguntas de tipo test y haciendos tus
	 * propios ejemplos.
	 */

}
