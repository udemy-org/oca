/**
 * LA GESTIÓN DE EXCEPCIONES
 */
package es.smartcoding.oca.seccion6;

/**
 * @author pep
 * 
 *         Qué son las excepciones?
 * 
 *         Un programa puede fallar por numeros razones, algunas que podemos solucionar nosotros como programadores y otras que se escapan a
 *         nuestro control.
 *
 *         Las excepciones como java.lang.ArrayIndexOutOfBoundsException alteran el flujo del programa, lenguajes como C retornan un valor especial,
 *         quizas -1, cuando ocurre una situación de error.
 * 
 *         En Java, la clase java.lang.Throwable es la superclase de todas las excepciones y errores que se puedan producir.
 * 
 *         Un error está encapsulado en la clase java.lang.Error y supone una condición de la que es prácticamente imposible de recuperarse, por
 *         ejemplo, cuando no queda memoria.
 * 
 *         Las excepciones en tiempo de ejecución están encapsulados en la clase java.lang.RuntimeException y subclases y no son necesariamente
 *         fatales, por ejemplo, cuando intentamos acceder a una posición de un array que no existe. También se las conoce como excepciones no
 *         comprobadas (unchecked exceptions).
 * 
 *         Las excepciones comprobadas (checked exceptions) están encapsuladas en la clase java.lang.Exception y subclases excepto la clase y
 *         subclases de java.lang.RuntimeException que también hereda de java.lang.Exception.
 * 
 *         Aunque todas las exceptiones ocurren en tiempo de ejecución, cuando hablamos de excepciones en tiempo de ejecución nos referimos a las
 *         excepciones no comprobadas (unchecked exceptions).
 * 
 *         Esta distinción entre comprobadas (checked) y no comprobadas (unchecked) es básica porque Java requiere que las primeras, las
 *         comprobadas, sean gestionadas según la regla 'handle o declare', es decir, 'trata o declara'.
 * 
 *         Aunque el debate está servido sobre si las excepciones que lanzan los métodos deben se comprobadas o no, en el examen es muy improbable que
 *         te encuentres preguntas filosóficas de este tipo.
 * 
 * 
 */
public class Leccion_6_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Esta simple línea de código compila pero lanza una excepción no comprobada: java.lang.NegativeArraySizeException.
		 * 
		 * Como puedes verificar en la documentación oficial de Oracle, NegativeArraySizeException es una RuntimeException.
		 * 
		 * Un gran número de preguntas del examen OCA tienen alternativas del estilo 'no compila' o 'lanza una excepción'. Por lo que es
		 * especialmente importante que te familiarices con este concepto.
		 */
		// String[] array = new String[-1];
		/*
		 * Nuevamente esta línea compila pero lógicamente lanza una excepcion no comprobada.
		 */
		// throw new RuntimeException();
		/*
		 * Esta línea en cambio, no compila. Porque Exception es una excepción comprobada que el código debe gestionar según la regla 'handle or
		 * declare'.
		 */
		// throw new Exception();
		/*
		 * A la hora de lanzar una excepción es común proporcionar una cadena que explique lo que pasó.
		 */
		// throw new Exception("Se acabó el presupuesto");

	}
	

}
