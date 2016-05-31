/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Los constructores
 *         
 *         EN TODA CLASE EXISTE UN CONSTRUCTOR POR DEFECTO (SIN PARÁMETROS) ÍMPLICITO QUE SE PIERDE CUANDO CREAMOS OTROS CONSTRUCTORES.
 * 
 *         No tienen valor de retorno, ni siquiera void, lo que realmente retornan es una referencia a un objeto de la clase.
 * 
 *         La palabra clave new busca un constructor y reserva espacio para un nuevo objeto. Los constructores normalmente se utilizan para
 *         inicializar un objeto. Cuando un parámetro de un constructor coincide con una propiedad o campo de la clase, la palabra reservada this
 *         puede utilizarse para hacer acceder a miembros de la clase actual. De hecho, this es una referencia al objeto actual.
 * 
 *         Como he dicho antes, Java proporciona un constructor por defecto (sin parámetros) siempre y cuando no se definan otros constructores.
 * 
 *         Como cualquier otro miembro, no podemos acceder a un constructor private; un constructor private puede ser útil para prevenir la
 *         creación de instancias indiscriminadamente, como cuando tenemos una clase sólo con métodos estáticos.
 * 
 *         Dentro de un constructor podemos invocar otros constructores de la propia clase pero sin utilizar la palabra clave new (que no tendria
 *         el efecto deseado), sino el método this() que debe ser la primera línea de código de un constructor.
 * 
 *         Las constantes finales deben ser asignadas exactamente una vez y puede hacerse en uno de tres puntos:
 * 
 *         1. En la propia declaración.
 * 
 *         2. En un bloque de iniciación.
 * 
 *         3. En un constructor ya que forman parte del proceso de inicialización de una instancia.
 * 
 *         Lo que debe quedar claro es que cuando el proceso de inicialización acabe, las constantes finales deben tener un valor.
 * 
 *         El proceso de inicialización sigue unas reglas sencillas:
 * 
 *         1. Si hay una superclase (Se trata más adelante) ocupa el primer lugar.
 * 
 *         2. La declaración de variables estáticas y bloques de inicialización estáticos (en el mismo orden en que aparecen) ocupan el segundo lugar.
 * 
 *         3. La declaración de variables de instancia y bloques de inicialización de instancia (en el mismo orden en que aparecen) ocupan el tercer lugar.
 * 
 *         4. El propio constructor de la clase ocupa el cuarto y último lugar.
 *
 */

class Fraccion {
	private final double PRECISION;
	private int numerador = 0;
	private int denominador = 1;

	public Fraccion(int numerador) {
		/*
		 * El encadenamiento de constructores (Constructor chaining) es muy usual y se usa para no repetir código.
		 */
		this(numerador, 1);
		// new Fraccion(numerador, 1); // Compila pero no tiene el efecto deseado
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














