/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores aritméticos binarios
 * 
 *         En esta lección revisaremos los operadores aritméticos binarios, como
 *         la suma, resta, etc.
 * 
 *         Todos son familiares, aunque los operadores + y += aplicados a las
 *         cadenas actúan como una concatenación de cadenas.
 * 
 *         El operador módulo % calcula el resto de la division de dos números.
 * 
 *         Reglas de promoción numéricas:
 * 
 *         1. El de mayor tamaño gana.
 * 
 *         2. Coma flotante gana sobre entero.
 * 
 *         3. byte, short y char SIEMPRE se convierten en int automáticamente.
 * 
 *         4. El resultado será del tipo que haya ganado.
 *
 */
public class Leccion_2_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * La prioridad de los operadores puede modificarse mediante los
		 * paréntesis.
		 */
		int x = 2 * ((5 + 3) * 4 - 8);
		System.out.println(x);
		System.out.println(7 % 3);
		// Operador módulo con negativos
		System.out.println(-7 % 3);
		System.out.println(-7 % -3);
		System.out.println(7 % -3);
		// No entra en el examen
		System.out.println(7.1 % 3.5);
		// Ejemplos de promoción
		long l1 = 1;
		// int i = 2 * l1; // NO COMPILA
		// El mayor entero es 2.147.483.647
		long l2 = 2_147_483_648L;
		byte b1 = 1, b2 = 2;
		// byte b3 = b1 * b2; // NO COMPILA
		int b3 = b1 * b2;
		// float f1 = 1.0; // NO COMPILA 1.0 ES UN double
		float f2 = 1.0F, f3 = 1.0f;
	}

}
