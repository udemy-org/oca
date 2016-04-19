/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         El método main()
 * 
 *         En esta lección estudiaremos el método main, donde empieza la
 *         ejecución de un programa Java.
 * 
 *         javac -d bin src/es/smartcoding/oca/seccion1/Leccion_1_02.java
 * 
 *         java -cp bin es/smartcoding/oca/seccion1/Leccion_1_02 [<param1> [<param2>] ...]
 */
public class Leccion_1_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hola mundo.");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
