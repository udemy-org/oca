/**
 * LA GESTIÓN DE EXCEPCIONES
 */
package es.smartcoding.oca.seccion6;

/**
 * @author pep
 * 
 *         La orden try
 * 
 *         Java utiliza la orden try para separar el código que puede lanzar una excepción del código que trata la excepción.
 * 
 *         El código de un bloque try se ejecuta normalmente y si alguna orden lanza un excepción entonces el o los bloques catch toman el control.
 *         Pero si el bloque try se ejecuta normalmente, entonces el o los bloques catch se ignoran.
 * 
 *         El bloque opcional finally, en cambio, se ejecuta siempre y viene a continuación del último bloque catch. Aunque hay una excepción a la
 *         regla, cuando se ejecuta la orden System.exit() el flujo normal del programa acaba abruptamente.
 * 
 *         Un bloque try necesariamente debe ir seguido de una bloque catch o finally o ambos.
 * 
 *         En el examen OCP se trata el try-with-resources pero el examen OCA solamente trata la orden try tradicional.
 *
 */
public class Leccion_6_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int i = 1 / 1;
			System.out.println(i);
			// System.exit(0);
		}
		/*
		 * No compila, el orden es importante, los bloques catch deben especificar clases de más concretas a más generales
		 */
		// catch (Exception e) {
		//
		// }
		catch (IllegalArgumentException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("En finally");
		}

//		try {
//			throw new RuntimeException();
//		} catch (RuntimeException e) {
//			throw new RuntimeException();
//		} finally {
//			/*
//			 * No compila, falta un bloque try-catch
//			 */
//			// throw new Exception();
//		}
		
		/*
		 * En el examen OCA, tendrás preguntas de este tipo, cuál es la salida de este código?
		 */
		System.out.println(e());

	}

	static String e() {
		String result = "";
		String v = null;
		try {
			try {

				result += "before";
				v.length();
				result += " after";
			} catch (NullPointerException e) {
				result += " catch";
				throw new RuntimeException();
			} finally {
				result += " finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += " done";
		}
		finally {
			result += " bye bye.";
		}
		return result;
	}
}
