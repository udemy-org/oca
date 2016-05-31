/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pep
 * 
 *         La herencia
 * 
 *         La anotación @Override indica que estamos sobrescribiendo un método de la clase padre.
 * 
 *         Por ejemplo, la clase Barco sobrescribe el método toString de la clase java.lang.Object para adecuarlo a sus necesidades particulares.
 * 
 *         Durante la sobrescritura de métodos el compilador hace las siguientes comprobaciones:
 * 
 *         1. Ambos métodos, el sobrescrito (original) y el que sobrescribe (de la subclase) deben tener la misma firma (signature) y valor de retorno.
 * 
 *         2. El método de la subclase debe ser tan accesible o más que el método sobrescrito.
 * 
 *         3. El método de la subclase no puede lanzar una excepcion comprobada (checked exception) que sea nueva o más amplia que las lanzadas en el método sobrescrito.
 * 
 *         4. Si el método original retorna un valor, el método de la subclase  debe retornar un valor del mismo tipo o un tipo de retorno covariante (una sublcase).
 * 
 *         Un método escondido es un método sobrescrito que además es estático en ambas clases. Si intentas sobrescribir un método de clase 
 *         (estático) con un método de instancia (no estático) o un método de instancia con un método de clase no compilará.
 * 
 *         Reusar un nombre de método estático NO es una buena práctica.
 * 
 *         Atención, no confundas overloading con overriding, aunque ambos redefinen un método que tiene el mismo nombre, overloading o
 *         sobrecarga varia la firma de un metodo (lista de parametros) y también puede modificar el valor de retorno. Pero overriding o
 *         sobrescritura tan solo redefine un metodo de la superclase.
 * 
 *         Los metodos finales, por definición, no pueden sobrescribirse ni esconderse si es estático pero sí sobrecargarse.
 * 
 *         En general, definiremos un método como final cuando queramos asegurarnos de que no se cambia su comportamiento en ninguna
 *         subclase.
 * 
 *         Finalmente, las reglas para con los nombres de propiedades iguales son más simples: en Java las variables con igual nombre esconden las
 *         variables de la superclase. De manera que para acceder a una variable escondida de la superclase, lo podemos hacer con la palabra reservada super.
 * 
 *         De todas formas no es una práctica recomendada utilizar los mismos nombres de propiedades públicas, propected o default en varios
 *         niveles de la jerarquía de clases. Las propiedades private en cambio, se consideran menos problemáticas dado que no son visibles en las subclases.
 */

/**********
 * Clase Base
 */
class Base {

	public int var = 1;

	public static void s() {
		System.out.println("En Base");
	}

	public void f() {
		System.out.println("En Base");
	}

	public List<String> g() throws Exception {
		return null;
	}

	public void h() throws IllegalAccessException {
	}

	/*
	 * Este método es privado, no es visible en las subclases
	 */
	private void i() {
	}
}

/**********
 * Clase Subclase
 */
class Subclase extends Base {

	public int var = 2;

	public static void s() {
		System.out.println("En Subclase");
	}
	
	// No compila, modificador de acceso mas restrictivo.
	// protected void f() {}

	// No compila, tipo de retorno incompatible.
	// public int f() {}

	// No compila, el método f() en la clase Base no lanza ninguna excepción.
	// public void f() throws Exception {}

	// Compila, pero esto no es una sobrescritura sino una sobrecarga.
	// @Override
	protected int f(int k) throws Exception { return 0; }

	@Override
	public void f() { System.out.println("En Subclase"); }

	/*
	 * Compila, ArrayList es una subclase de List e IllegalAccessException es una subclase de Exception. También compilaría si omitiémos 'throws IllegalAccessException'
	 * También compilaría con 'throws IllegalAccessException, IllegalArgumentException'
	 */
	@Override
	public ArrayList<String> g() throws IllegalAccessException { return null; }

	// No compila, porque Exception no es una subclase de IllegalAccessException
	// public void h() throws Exception {}

	// Compila, porque este método no está relacionado con el método i() de la superclase ya que los miembros privados no se heredan.
	public int i(int k) throws Exception { return 0; }

}

/**********
 * 
 * @author pep
 *
 */
public class Leccion_5_01_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subclase.s();
		/*
		 * Esto es un ejemplo de polimorfismo, que veremos más adelante, El objeto base es de tipo Base pero hace referencia a una instancia de
		 * Subclase. A pesar de eso, cuando accedemos a la variable var definida en ambas clases se muestra el valor definido en la clase Base.
		 */
		Base base = new Subclase();
		Subclase subclase = new Subclase();
		// 1
		System.out.println(base.var);
		// 2
		System.out.println(subclase.var);
		/*
		 * En cambio, cuando accedemos al método f(), en ambos casos accedemos al método f de la clase Subclase.
		 */
		base.f();
		subclase.f();
	}

}













