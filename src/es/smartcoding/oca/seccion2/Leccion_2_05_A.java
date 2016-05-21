/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Las estructuras de control de Java
 * 
 *         Un bloque de código es una o más instrucciones Java delimitadas por llaves {}
 * 
 */
public class Leccion_2_05_A {

	public static void main(String[] args) {
		/*
		 * Como regla general utiliza siempre bloques ({}) con la orden if. 
		 * 
		 * Este ejemplo es engañoso.
		 * 
		 * El primero utiliza bloques mientras que el segundo no.
		 * 
		 * En el segundo siempre se ejecuta la orden System.out.println().
		 */
		int k = 10;
		if (k < 5) {
			k++;
			System.out.println("k: " + k);
		}
		int l = 10;
		if (l < 5)
			l++;
			System.out.println("l: " + l);
			
			
		/*
		 * Con la orden if-then-else debemos tener especial cuidado.
		 */
		int m = 99;
		if (m < 10) {
			// bloque 1
		}
		if (m < 20) {
			// bloque 2
		}
		
		/*
		 * El código anterior sería más correcto escribirlo de esta manera:
		 */
		if (m < 10) {
			// bloque 1
		} else if (m < 20) {
			// bloque 2
		}
		
		/*
		 * Y el orden es importante.
		 * 
		 * En este ejemplo el bloque 2 nunca se ejecutará, porque un número menor que 10 es menor que 20 por definición.
		 */
		if (m < 20) {
			// bloque 1
		} else if (m < 10) {
			// bloque 2
		}
		
		/*
		 * El operador ternario, es el único operador que tiene tres operandos
		 */
		int y = 10;
		int x;
		if (y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
		/*
		 * Compara el bloque anterior con esta expresión que hace exactamente lo mismo. Mucho más compacta. 
		 * Los parentesis son opcionales. Primero se evalúa la condición y mayor que 5; si la condición es cierta se evalua la expresión que sigue al interrogante 2 por y,
		 * pero si es falsa, se evalúa la expresión que sigue a los dos puntos 3 por y.
		 */
		x = (y > 5) ? (2 * y) : (3 * y);
		
		/*
		 * Esta expresión compila porque aunque retorna un tipo diferente en
		 * cada caso, el método println sabe como convertirlo a cadena.
		 */
		System.out.println("operador ternario" + ((y > 5) ? 21 : "OCA"));
		/*
		 * La orden switch es una estructura de decisión compleja.
		 * 
		 * Antes de Java 5.0 sólamente admitían enteros (byte, short, char, int). En Java 5.0 cuando se introdujeron los enumerados también se
		 * añadió soporte para enumerados. En Java 7 se enriqueció con soporte para cadenas (String) y finalmente se completó con las clases envolventes
		 * de los tipos primitivos: Byte, Short, Character o Integer. 
		 * 
		 * De todas formas, es importante  recordar que no admite ni long ni boolean.
		 * 
		 * La orden case solamente admite literales, constantes enumeradas, o  variables constantes finales del mismo tipo que la expresión switch y
		 * no necesitan estar ordenado, asímismo la orden default no tienen porqué ser la última. Además en una orden case no puede haber repetidos.
		 * 
		 * Por último, la orden break rompe la secuencia, lo que quiere decir  que si olvidas una puedes obtener resultados inesperados.
		 * 
		 * Estas advertido de que los editores de preguntas de los examenes de certificación juegan mucho con este último aspecto.
		 */
		int nota = 9;
		int tres = 3;
		final int TRES = 3;
		switch (nota) {
		case 1:
		case 2:
			// case tres: // NO COMPILA, porque no es una expresión constante.
		case TRES:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Excelente");
			break;
		case 10:
			System.out.println("Matricula de Honor");
			break;
		default:
			System.out.println("Insuficiente");
		}
	}
	
	// Las expresiones case de una estructura switch deben ser valores constantes conocidos en tiempo de compilación.
	// El hecho de declarar un parametro de un metodo como final, no quiere decir que sea una constante, sino que no puede ser reasignado,
	// aunque si se tratara de un objeto, su estado sí que podria ser modificado.
	private static void checkCase(int a, final int b) {
		 switch(a) {
		 /*
		 * b no es una constante conocida en tiempo de compilación
		 */
//		 case b: // NO COMPILA
//		 System.out.println("En b");
//		 break;
		
		 }
	}
}
























