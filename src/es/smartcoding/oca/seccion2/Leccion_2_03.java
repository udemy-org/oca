/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores unarios
 * 
 *         Los operadores de incremento (++) y decremento (--) pueden aplicarse en preorden (a la izquierda del operando) o en postorden (a la derecha del operando).
 *         
 *		   Tienes que tener en cuenta que el examen va a poner a prueba tus conocimientos sobre esta materia.                  
 *
 */
public class Leccion_2_03 {

	public static void main(String[] args) {
		/*
		 * ! es la negación logica
		 */
		boolean b = true;
		System.out.println(b);
		b = !b;
		System.out.println(b);
		int i = 1;
		System.out.println(i);
		i = -i;
		System.out.println(i);
		int c = 10;
		System.out.println(c++);
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		// Evalúa estas expresiones
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println(x);
		System.out.println(y);
	}

}
