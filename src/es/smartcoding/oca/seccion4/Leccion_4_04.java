/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         Pasando datos entre métodos
 * 
 *         Java es un lenguaje de programación de tipo 'paso-por-valor' lo que quiere decir que se envia una copia de una variable como argumento durante la invocación de un método.
 * 
 *         Ya sabemos que el método invocado no puede modificar el argumento con el que se invoca un método. Vamos a ver qué implicaciones tiene:
 *
 */
public class Leccion_4_04 {

	/*
	 * Los cambios hechos en i no afectan al argumento de llamada. Si quieres prevenir cambios en i, puedes declarar el argumento como final int i.
	 */
	static void m1(int i) {
		i++;
	}

	/*
	 * La clase String es una clase inmutable, por lo tanto los cambios hechos en un cadena no afectan al argumento de llamada.
	 */
	static void m2(String s) {
		s = s.toUpperCase();
	}

	/**********
	 * La clase StringBuilder es una clase mutable, por lo tanto los cambios hechos en un objeto StringBuilder SÍ afectan al argumento de llamada.
	 */
	static void m3(StringBuilder sb) {
		sb.reverse();
	}

	/*
	 * En cambio, si cambiamos el objeto al que apunta, el argumento de llamada no se ve afectado.
	 */
	static void m4(StringBuilder sb) {
		sb = new StringBuilder("XXX");
	}

	/**********
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Cuál crees que será la salida de este código?
		 */
		int k = 1;
		System.out.println("k antes de invocar a m1(): " + k);
		m1(k);
		System.out.println("k después de invocar a m1(): " + k);
		String str = "OCA";
		System.out.println("str antes de invocar a m2(): " + str);
		m2(str);
		System.out.println("str después de invocar a m2(): " + str);
		StringBuilder builder1 = new StringBuilder("OCA");
		System.out.println("builder1 antes de invocar a m3(): " + builder1);
		m3(builder1);
		System.out.println("builder1 después de invocar a m3(): " + builder1);
		StringBuilder builder2 = new StringBuilder("OCA");
		System.out.println("builder2 antes de invocar a m4(): " + builder2);
		m4(builder2);
		System.out.println("builder2 después de invocar a m4(): " + builder2);

	}

}









