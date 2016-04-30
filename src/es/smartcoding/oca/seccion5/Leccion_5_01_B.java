/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         La herencia
 * 
 *         La anotación @Override indica que estamos sobrescribiendo un método
 *         de la clase padre.
 * 
 *         Por ejemplo, la clase Barco sobrescribe el método toString de la
 *         clase java.lang para adecualo a sus necesidades particulares.
 * 
 *         Durante la sobrescritura de métodos el compilador hace las siguientes
 *         comprobaciones:
 * 
 *         1. Ambos métodos, el sobrescrito (original) y el que sobrescribe (de
 *         la subclase) deben tener la misma firma (signature).
 * 
 *         2. El método de la subclase debe tener debe ser tan accesible o más
 *         que el método sobrescrito.
 * 
 *         3. El método de la subclase no puede lanzar una excepcion comprobada
 *         (checked exception) que sea nueva o más amplia que las lanzadas en el
 *         método sobrescrito.
 * 
 *         4. Si el método original retorna un valor, el método de la subclase
 *         debe retornar un valor del mismo tipo o un tipo de retorno covariante
 *         (una sublcase).
 * 
 *
 */
public class Leccion_5_01_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
