/**
 * Alfa.java
 */
package es.smartcoding.oca.seccion4.code.p1;

/**
 * @author pep
 * 
 * Desde la clase Alfa todos los miembros son accesibles. Fíjate que cada miembro tiene un modificador de acceso diferente de más restrictivo a menos.
 *
 */
public class Alfa {

	private void f() {
	}

	void g() {
	}

	protected void h() {
	}

	public void i() {
	}

	public final void j() {
	}

	public Alfa() {
		f();
		g();
		h();
		i();
	}
}






