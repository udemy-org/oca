/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores unarios
 * 
 *         Los operadores de incremento (++) y decremento (--) pueden aplicarse
 *         en preorden (a la izquierda del operando) o en postorden (a la
 *         derecha del operando).
 * 
 *         En el examen debes esperar preguntas
 *
 */
public class Leccion_2_03 {

	public static void main(String[] args) {
		/*
		 * ! es la negación logica
		 */
		boolean bool = true;
		System.out.println("bool: " + bool);
		bool = !bool;
		System.out.println("bool: " + bool);
		/*
		 * Durante el examen debes de ser capaz de evaluar expresiones como
		 * esta.
		 */
		int i = 1;
		int j = 2 + 3 * -++i;
		System.out.println("i: " + i + ", j:" + j);
		int a = 1, b = 2;
		int c = a++ * --b + 1;
		System.out.println("a: " + a + ", b:" + b + ", c:" + c);
		// Evalúa estas expresiones
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x: " + x + ", y: " + y);
	}

}
