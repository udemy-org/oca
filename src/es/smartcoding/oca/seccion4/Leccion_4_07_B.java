/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         La encapsulación de datos
 * 
 *         Las clases inmutables tienen una característica tan simple como útil.
 *         Una vez creadas no cambian su estado, lo que nos garantiza que
 *         podemos pasearlas por cualquier parte de la aplicación sin que cambie
 *         su estado.
 * 
 *         La forma de conseguirlo es igualmente simple, basta con declarar las
 *         propiedades como private y no proporcionar ningún método setter. La
 *         inicialización se llevará a cabo exclusivamente a través del
 *         constructor.
 *
 */

class MiClaseInmutable {
	private int codigoSecreto;

	public MiClaseInmutable(int codigoSecreto) {
		this.codigoSecreto = codigoSecreto;
	}

	@Override
	public String toString() {
		return String.format("MiClaseInmutable [codigoSecreto=%s]",
				codigoSecreto);
	}

}

/*
 * La clase MiClaseInmutableFalsa a pesar de no tener ningún método setter y
 * tener su propiedad privada, no es inmutable. El método getter retorna una
 * referencia a StringBuilder que no es inmutable. Por lo tanto cualquier cambio
 * en esa referencia modificará la propiedad original.
 * 
 * La solución es no retornar el original sino una copia, lo que se llama una
 * copia defensiva.
 * 
 * Otra solución podría ser retornar un objeto String que es inmutable.
 */
class MiClaseInmutableFalsa {
	private StringBuilder codigoSecreto;

	public MiClaseInmutableFalsa(String str) {
		this.codigoSecreto = new StringBuilder(str);
	}

	public StringBuilder getCodigoSecreto() {
		// return codigoSecreto;
		return new StringBuilder(codigoSecreto);
	}
	
	// public String getCodigoSecreto() {
	// return codigoSecreto.toString();
	// }

	@Override
	public String toString() {
		return String.format("MiClaseInmutable [codigoSecreto=%s]",
				codigoSecreto);
	}

}

public class Leccion_4_07_B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MiClaseInmutable mci = new MiClaseInmutable(238176322);
		System.out.println(mci);
		MiClaseInmutableFalsa mcif = new MiClaseInmutableFalsa("12345657");
		System.out.println(mcif);
		StringBuilder sb = mcif.getCodigoSecreto();
		sb.setCharAt(3, 'X');
		System.out.println(mcif);
	}

}
