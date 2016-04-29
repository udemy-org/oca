/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Los constructores
 * 
 *         En esta lección veremos qué son lo constructores, métodos especiales
 *         que tienen el mismo nombre que la clase y que no retornan nada, ni
 *         siquiera ‘void’.
 * 
 *         Aunque según alguna documentación lo que realmente retornan es una
 *         referencia, una instancia de la clase.
 * 
 *         La palabra clave new busca un constructor y reserva espacio para un
 *         nuevo objeto. Los constructores normalmente se utilizan para
 *         inicializar un objeto. Cuando un parámetro de un constructor coincide
 *         con una propiedad o campo de la clase, la palabra reservada this
 *         puede utilizarse para hacer acceder a miembros de la clase actual. De
 *         hecho, this es una referencia al objeto actual.
 * 
 *         Java proporciona un constructor por defecto (sin parámetros) siempre
 *         y cuando no haya otros constructores.
 * 
 *         Como cualquier otro miembro, no podemos acceder a un constructor
 *         private; un constructor private puede ser útil cuando tenemos una
 *         clase con métodos estáticos o cuando queremos tener control de cómo
 *         se crean las instancias de una clase.
 * 
 *         Dentro de un constructor podemos invocar otros constructores de la
 *         propia clase pero sin utilizar la palabra clave new (que no tendria
 *         el efecto deseado), sino la palabra clave this que debe ser la
 *         primera línea de código de un constructor.
 * 
 *         Las constantes finales deben ser asignadas exactamente una vez y
 *         puede hacerse en uno de tres puntos:
 * 
 *         1. En la propia declaración.
 * 
 *         2. En un bloque de iniciación.
 * 
 *         3. En un constructor ya que forman parte del proceso de
 *         inicialización de una instancia.
 * 
 *         Lo que debe quedar claro es que cuando el proceso de inicialización
 *         acabe, las constantes finales deben tener un valor.
 * 
 *         El proceso de inicialización sigue unas reglas sencillas:
 * 
 *         1. Si hay una superclase (Se trata más adelante) ocupa el primer
 *         lugar.
 * 
 *         2. La declaración de variables estáticas y bloques de inicialización
 *         estáticos (en el mismo orden en que aparecen) ocupan el segundo
 *         lugar.
 * 
 *         3. La declaración de variables de instancia y bloques de
 *         inicialización de instancia (en el mismo orden en que aparecen)
 *         ocupan el tercer lugar.
 *         
 *         4. El constructor ocupa el cuarto lugar.
 *
 */

class Fraccion {
	private final double PRECISION;
	private int numerador;
	private int denominador;

	public Fraccion(int numerador) {
		/*
		 * El encadenamiento de constructores (Constructor chaining) es muy
		 * usual y usa para no repetir código.
		 */
		this(numerador, 1);
		// new Fraccion(numerador, 1); // Compila pero tiene el efecto deseado
	}

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		PRECISION = 1.0e-3;
	}

	@Override
	public String toString() {
		return String.format("Fraccion [numerador=%s, denominador=%s]",
				numerador, denominador);
	}

}

public class Leccion_4_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Fraccion f0 = new Fraccion(); // No compila
		/*
		 * Invoca al constructor por defecto.
		 */
		Leccion_4_06 leccion1 = new Leccion_4_06();
		Fraccion f1 = new Fraccion(1, 2);
		System.out.println(f1);
		Fraccion f2 = new Fraccion(3);
		System.out.println(f2);

	}

}
