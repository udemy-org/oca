/**
 * EL DISEÑO DE CLASES
 */
package es.smartcoding.oca.seccion5;

/**
 * @author pep
 * 
 *         Las clases abstractas
 * 
 *         Las clases abstractas son clases incompletas, pensadas para ser
 *         extendidas y por lo tanto completadas mediante clases concretas.
 * 
 *         Por lo tanto, abstract y final son dos conceptos totalmente opuestos:
 *         una clase o método abstracto no puede ser final. De la misma manera,
 *         un método abstracto no puede ser privado porque no sería visible en
 *         la subclases.
 * 
 *         En resumen, una clase que extiende una clase abstracta está obligada
 *         a implementar todos los métodos abstractos de la clase abstracta o a
 *         definirse ella misma como abstracta.
 * 
 *         Reglas de definición de una clase abstracta:
 * 
 *         1. Una clase abstracta no puede instanciarse directamente.
 * 
 *         2. Una clase abstracta puede tener cero o más métodos abstractos.
 * 
 *         3. Una clase abstracta no puede ser final.
 * 
 *         4. Una clase abstracta que extiende otra clase abstracta hereda todos
 *         sus métodos abstractos.
 * 
 *         5. La primer clase concreta que extiende una clase abstracta debe
 *         proporcionar una implementación de todos los métodos abstractos que
 *         hereda.
 * 
 *         Reglas de definición de un método abstracto:
 * 
 *         1. Un método abstracto sólo puede ser definido en una clase
 *         abstracta.
 * 
 *         2. Un métood abstracto no puede ser declarado como final o private.
 * 
 *         3. Los métodos abstractos no pueden tener cuerpo.
 * 
 *         4. La implementación de un método abstracto en una clase concreta
 *         sigue las mismas reglas de sobrescritura de métodos en cuanto a nivel
 *         de visibilidad, firma y gestión de excepciones.
 * 
 *
 */
abstract class Figura {

	/*
	 * Una clase sólo puede tener métodos abstractos si es una clases abstracta.
	 */
	public abstract double area();
}

class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

}

public class Leccion_5_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// No compila, de una clase abstracta no pueden crerse instancias
		// Figura figura = new Figura();
		Figura cuadrado = new Cuadrado(3.0e0);
		System.out.println(cuadrado.area());
	}

}
