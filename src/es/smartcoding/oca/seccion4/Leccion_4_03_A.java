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
 *         Los miembros private sólo son accesibles desde la propia clase.
 * 
 *         Los miembros default son accesibles desde la propia clase y desde el mismo paquete.
 * 
 *         Los miembros protected son accesibles desde la propia clase, desde el mismo paquete y desde las subclases.
 * 
 *         Los miembros public son accesibles desde cualquier parte.
 *
 * 
 */
public class Leccion_4_03_A {
	
	/*
	 * Esta es una de las partes más duras del examen. Asegurate de que la trabajas a fondo, revisando estos ejemplos hasta que los entiendas
	 * completamente, respondiendo corectamente a las preguntas de los tests y haciendos tus propios ejemplos.
	 * 
	 * Es esta lección vamos a usar las clases Alfa y Bravo declaradas en este paquete: es.smartcoding.oca.seccion4.code.p1 
	 * y la clase Charlie que extiende Alfa declarada en este paquete es.smartcoding.oca.seccion4.code.p2.
	 * 
	 * También vamos a ilustrar el tema de los miembros estáticos con dos clases: la clase DemoStatic y DemoStaticInit.
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


}





