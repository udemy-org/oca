/**
 * Bravo.java
 */
package es.smartcoding.oca.seccion4.code.p1;

public class Bravo {

	/**
	 * @author pep
	 *
	 */
	public Bravo() {
		
		Alfa alfa = new Alfa();
		
		/*
		 * private, sólo es accesible desde la propia clase.
		 */
		// alfa.f(); // No compila
		/*
		 * default, sólo es accesible desde la propia clase y el paquete donde
		 * está definida.
		 */
		alfa.g();
		/*
		 * protected, sólo es accesible desde la propia clase, el paquete donde
		 * está definida y subclases.
		 */
		alfa.h();
		/*
		 * public, accesible desde cualquier parte.
		 */
		alfa.i();
		
	}

}
