/**
 * LA GESTIÓN DE EXCEPCIONES
 */
package es.smartcoding.oca.seccion6;

/**
 * @author pep
 * 
 *         Llamada a métodos que lanzan excepciones
 * 
 *         Las excepciones son nuestras amigas. Nos ayudan a depurar el código de errores.
 * 
 */

class MyException extends Exception {
}

interface Maquina {
	public void overClocking(double velocidad) throws Exception;
}

/*
 * Recuerda, cuando un método sobrescribe otro método que lanza alguna excepción no puede lanzar más excepciones ni excepciones más generales 
 * pero si excepciones más concretas.
 * 
 * Como el método overClocking() de la interfaz Maquina lanza una Exception, las subclases que sobrescriben overClocking() puede lanzar la misma excepción,
 * una sublase o nada.
 * 
 * Lo contrario no es cierto. si el método overClocking() de la clase interfaz no lanzará ninguna excepción, las subclases que sobrescriben overClocking()
 * tampoco podrían lanzar ninguna.
 */
class Ordenador implements Maquina {
	public void overClocking(double velocidad) throws MyException {

	}
}

public class Leccion_6_04 {

	// Este método lanza una excepción comprobada porque MyException hereda de Exception.
	static void f() throws MyException {
		System.out.println("En f()");
	}

	public static void main(String[] args) {
		// Por lo tanto, esta invocación no compila, porque falta gestionar la excepción
		// f();
		// Alternativamente se puede declarar la excepción en el método main con throws Exception.
		try {
			f();
		} catch (MyException e) {
			// Escribe toda la excepción.
			System.out.println(e);
			// Escribe sólo el mensaje de la excepción, si hay.
			System.out.println(e.getMessage());
			/*
			 * Escribe todo la información disponible. Es tipicamente el más útil a la hora de depurar código.
			 * En cualquier caso, siempre se debería escoger uno u otro y tratar la excepción adecuadamente.
			 */
			e.printStackTrace();
		}
	}

}











