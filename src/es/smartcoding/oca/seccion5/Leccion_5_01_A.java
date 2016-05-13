/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         La herencia
 * 
 *         Cuando creamos una clase en Java implícitamente estamos heredando de
 *         la clase java.lang.Object. Eso quiere decir que sus miembros publicos
 *         y protected como los métodos toString, equals, etc., están presentes
 *         en todas las clases.
 * 
 *         De la misma manera nuestras clases pueden heredar de exactamente una
 *         sola clase siempre que no sea final.
 * 
 *         La palabra clave extends es la que crea una relación de herencia
 *         entre clases. Una relación que se conoce como ES-UN.
 * 
 *         Es fácil de ver que un PortaAviones es un BarcoDeGuerra y que un
 *         BarcoDeGuerra es una Barco.
 * 
 *         La palabra clave super se utiliza para invocar al constructor de la
 *         superclase.
 * 
 *         Igual que hay un constructor por defecto, todo contructor tiene una
 *         llamada super() implícita añadida por el compilador que podemos
 *         modificar pasando una lista de argumentos si conviene.
 * 
 *         En resumen, cuando hay herencia los constructores deben cumplir unas
 *         reglas:
 * 
 *         1. En este contexto, el método this() se utiliza para invocar otros
 *         constructores dentro de la misma clase, y el método super() para
 *         invocar otros constructores de la clase padre. Uno u otro debe ser la
 *         primera orden de un constructor.
 * 
 *         2. Java añade una invocación a super() implícitamente en cada
 *         constructor que llama al costructor por defecto de la clase padre.
 * 
 *         3. De no existir el constructor por defecto en la clase padre, el
 *         compilador genera un error: 'Implicit super constructor is
 *         undefined'.
 * 
 *         4. La solución es doble, o bien creamos un constructor por defecto en
 *         la clase padre, o bien modificamos la invocación del método super()
 *         pasando los argumentos adecuados.
 * 
 *         5. La invocación de super() debe ser la primera línea de código de un
 *         costructor.
 * 
 *         6. Como consecuencia del punto anterior, el constructor de la clase
 *         padre se ejecuta antes que el constructor de una clase dada.
 *
 *
 *         La palabra reservada this y el el método this() no están relacionadas
 *         en Java, this se utiliza para acceder a miembros (propiedades y
 *         métodos) visibles de la clase (posiblemente heredados) y this() se
 *         utiliza desde un constructor para invocar otro constructor.
 * 
 *         Con la palabra reservada super y super() pasa algo parecido, super se
 *         utiliza para acceder a miembros sólo de la superclase, y super() se
 *         utiliza para invocar a un constructor de la clase padre.
 */

/*
 * extends java.lang.Object implícito
 */
class Barco {
	protected double eslora;
	protected double manga;
	protected double calado;

	public Barco(double eslora, double manga, double calado) {
		this.eslora = eslora;
		this.manga = manga;
		this.calado = calado;
	}

	@Override
	public String toString() {
		/*
		 * Aqui llamamos al método toString definido en java.lang.Object
		 */
		return super.toString()
				+ String.format("%nBarco [eslora=%s, manga=%s, calado=%s]%n",
						eslora, manga, calado);
	}

}

class BarcoDeGuerra extends Barco {
	protected int marineros;

	// public BarcoDeGuerra() {} // No compila

	// public BarcoDeGuerra() {
	// super(0.0, 0.0, 0.0);
	// }

	public BarcoDeGuerra(double eslora, double manga, double calado,
			int marineros) {
		super(eslora, manga, calado);
		this.marineros = marineros;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("BarcoDeGuerra [marineros=%s]%n", marineros);
	}

}

final class PortaAviones extends BarcoDeGuerra {
	private int aviones;

	public PortaAviones(double eslora, double manga, double calado,
			int marineros, int aviones) {
		super(eslora, manga, calado, marineros);
		this.aviones = aviones;
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("PortaAviones [aviones=%s]", aviones);
	}

}

public class Leccion_5_01_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Leccion_5_01_A leccion1 = new Leccion_5_01_A();
		System.out.println(leccion1 instanceof Object);

		PortaAviones enterprise = new PortaAviones(342, 78.4, 12, 3000, 70);
		System.out.println(enterprise instanceof Barco);
		System.out.println(enterprise);
	}

}
