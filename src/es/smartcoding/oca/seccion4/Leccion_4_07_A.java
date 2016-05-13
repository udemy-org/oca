/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         La encapsulación de datos
 * 
 *         La encapsulación previene que se pueda manipular las propiedades de
 *         un objeto a nuestro antojo.
 * 
 *         La solución pasa por declarar las propiedades como private y definir
 *         metodos accesores public (getters y setters) según convenga. Si
 *         queremos que una propiedad sea de sólo lectura, definiremos sólamente
 *         su método getter y si queremos que sea de sólo escritura definiremos
 *         el método setter. De la misma manera si queremos que una propiedad
 *         sea de lectura y escritura definiremos ambos métodos getter y setter.
 * 
 *         Java define los JavaBeans como clases con una serie de
 *         características:
 *         
 *         1. Tienen constructor por defecto.
 * 
 *         2. Las propiedades son privadas.
 *
 *         3. Los métodos getter empiezan con 'get' excepto cuando se trata de
 *         propiedades booleanas que empiezan por 'is'.
 * 
 *         4. Los métodos setter empieza con 'set'.
 * 
 *         5. Después del prefijo get, is o set le sigue el nombre de la
 *         propiedad con la primera letra en mayusculas.
 */

class CuentaCorriente {
	double saldo;

	// private double saldo;
	//
	// public double getSaldo() {
	// return saldo;
	// }
	//
	// public void setSaldo(double saldo) {
	// this.saldo = saldo;
	// }

}

public class Leccion_4_07_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CuentaCorriente cc1 = new CuentaCorriente();
		cc1.saldo = 1000000;

	}

}
