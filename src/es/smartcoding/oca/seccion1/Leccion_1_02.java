/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         El método main()
 *         
 *         Con estas órdenes podemos compilar y ejecutar un proyecto Java:
 * 
 *         javac -d bin src/es/smartcoding/oca/seccion1/Leccion_1_02.java
 * 
 *         java -cp bin es/smartcoding/oca/seccion1/Leccion_1_02 [<param1> [<param2>] ...]
 *         
 *         Donde javac es el compilador de Java y java es el interprete de bytecode para una arquitectura particular.
 *         La opción -d del compilador indica la ruta donde guardar el resultado de la compilación, con extensión class.
 *         La opción -cp o -classpath del interprete indica dónde buscar las clases.
 *         A continuación del nombre de la clase podemos pasar un número variable de parámetros.
 *         
 */
public class Leccion_1_02 {

	/**
	 * @param args, guarda los parámetros que se pasan a main durante la invocación. Como todo array en Java, se indexan a partir de cero.
	 */
	public static void main(String[] args) {
		System.out.println("Hola mundo.");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
