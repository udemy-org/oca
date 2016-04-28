/**
 * Charlie.java
 */
package es.smartcoding.oca.seccion4.code.p2;

import es.smartcoding.oca.seccion4.code.p1.Alfa;

/**
 * @author pep
 *
 */
public class Charlie extends Alfa {

	public Charlie() {
		/*
		 * private, sólo es accesible desde la propia clase.
		 */
		// f(); // No compila
		/*
		 * default, sólo es accesible desde la propia clase y el paquete donde
		 * está definida.
		 */
		// g(); // No compila
		/*
		 * protected, sólo es accesible desde la propia clase, el paquete donde
		 * está definida y subclases.
		 */
		h();
		/*
		 * public, accesible desde cualquier parte
		 */
		i();

		/*
		 * Sin embargo, aunque estemos en una subclase de Alfa, una instancia de
		 * Alfa no tiene acceso a los miembros default, ni protected ni private.
		 */

		Alfa alfa1 = new Alfa();

		// alfa1.f(); // No compila
		// alfa1.g(); // NO compila
		// alfa1.h(); // No compila
		alfa1.i();

		/*
		 * Lo mismo pasa con una variable de tipo Alfa que hace referencia a un
		 * objeto de tipo Charlie: sólo puede acceder a sus miembro públicos.
		 */

		Alfa alfa2 = new Charlie();

		// alfa2.f(); // No compila
		// alfa2.g(); // No compila
		// alfa2.h(); // No compila
		alfa2.i();

		/*
		 * Como era de esperar, una instancia de Charlie que es subclase de
		 * Alfa, sí tiene accesos a los miembros protected y public de Alfa.
		 */

		Charlie charlie = new Charlie();

		// charlie.f(); // No compila
		// charlie.g(); // No compila
		charlie.h();
		charlie.i();

	}

}
