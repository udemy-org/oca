/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

import java.util.Random;

/**
 * @author pep
 * 
 *         El orden de los elementos de una clase
 * 
 *         En esta lección abordaremos el orden en que se deben declarar los
 *         diferentes elementos de una clase.
 * 
 *         1. Los comentarios pueden ir en cualquier parte.
 * 
 *         2. La declaración de package es opcional y ocupa el primer lugar.
 * 
 *         3. Los imports son opcionales y van después de la declaración
 *         package.
 * 
 *         4. La declaración de clase es obligatoria y va a continuación de los
 *         imports. En Java puede haber clases dentro de clases pero NO forma
 *         parte del examen.
 * 
 *         5. La declaración de campos es opcional y pueden ir en cualquier
 *         parte de la clase (fuera de cualquier método).
 * 
 *         6. La declaración de métodos es opcional y puede ir en cualquier
 *         parte de la clase. En Java NO puede haber métodos dentro de métodos.
 *
 */
public class Leccion_1_09 {
	/*
	 * Muchos programadores prefieren poner las propiedades o campos en la parte
	 * superior.
	 */
	String s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * En un mismo fichero puede haber más de una clase, pero solamente una puede
 * ser pública, la que da nombre al fichero.
 */
class OtraClase {
}
