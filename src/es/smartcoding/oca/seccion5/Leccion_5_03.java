/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         La implementación de interfaces
 * 
 *         Aunque Java no permite la herencia múltiple, sí que permite a una
 *         clase implementar cualquier número de interfaces.
 * 
 *         Una interfaz es una estructura de datos abstracta que define una
 *         lista de cero o más métodos públicos y abstractos que cualquier clase
 *         concreta debe implementar.
 * 
 *         Una interfaz es abstract implícitamente y también puede contener una
 *         lista de cero o más constantes public, final y static, y Java 8
 *         introduce los métodos por defecto (default methods), con cuerpo y
 *         métodos estáticos.
 * 
 *         Las reglas para definir una interfaz son muy parecidas a las reglas
 *         de las clases abstractas:
 * 
 *         1. Una interfaz no puede instanciarse directamente.
 * 
 *         2. Una interfaz puede tener cero o más métodos.
 * 
 *         3. Una interfaz no puede ser final.
 * 
 *         4. Las interfaces definidas a alto nivel (en su propio fichero)
 *         pueden ser public o default y se asume abstract.
 * 
 *         5. Implícitdamente, todos los métodos de una interfaz son abtract y
 *         public, por lo tanto un método no puede ser private, protected ni
 *         final.
 * 
 *         Importante, ni las clases ni las interfaces internas forman parte de
 *         los objetivos del examen OCA.
 * 
 *         Puedes encontrarte con un escenario donde una clase implementa dos
 *         interfaces que definen el mismo método por defecto. Este es un caso
 *         particular y sólo compilará si la clase concreta implementa el método
 *         por defecto, lo que elimina la ambiguedad. Además, los métodos
 *         estáticos de una interfaz no se heredan.
 * 
 * 
 */
abstract interface Vehiculo {

	/*
	 * Las constantes de una interfaz son public, static y final implícitamente.
	 */
	public static final int MAX_PUERTAS = 5;

	/*
	 * Los métodos de una interfaz son public y abstract implícitamente.
	 */
	public abstract void arranca();

	void gira();

	/*
	 * Los métodos default permiten añadir métodos a interfaces (sólo a
	 * interfaces) sin romper la compatibilidad con el código antiguo.
	 * 
	 * Imagina que quieres añadir uno o más métodos a una interfaz que está
	 * implementada por múltiples clases sin que se rompa el código. La solución
	 * es añadir métodos por defecto que ya tienen una implementación.
	 * 
	 * Los métodos por defectos no pueden ser ni abstract ni final ni static.
	 */
	public default void frena() {
		System.out.println("Implementación por defecto de frena...");
	}
}

abstract class Utilitario implements Vehiculo {
	/*
	 * Una clase abstracta o interfaz puede redefinir un método por defecto como
	 * abstracto. A partir de este momento, las subclases deben proporcionar una
	 * implementación para dicho método.
	 */
	public abstract void frena();
}

class Turismo extends Utilitario {

	@Override
	public void arranca() {
		System.out.println("Arrancando turismo...");

	}

	@Override
	public void gira() {
		System.out.println("Girando turismo...");
	}

	@Override
	public void frena() {
		System.out.println("Frenando turismo...");
	}

}

interface MiInterfaz1 {

	public static void g() {
	}

	public default void f() {

	}
}

interface MiInterfaz2 {

	public static void g() {
	}

	public default void f() {

	}
}

class MiClase implements MiInterfaz1, MiInterfaz2 {
	public void f() {
		MiInterfaz1.g();
		MiInterfaz2.g();
		// g(); // No compila
	}
}

public class Leccion_5_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Turismo turismo = new Turismo();
		turismo.arranca();
		turismo.gira();
		turismo.frena();
	}

}
