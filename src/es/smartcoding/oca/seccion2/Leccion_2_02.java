/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores aritméticos binarios
 * 
 *         En esta lección revisaremos los operadores aritméticos binarios, como la suma, resta, etc.
 * 
 *         Los operadores + y += están sobrecargados, cuando un operando o más son de tipo cadena actúan como una concatenación donde el resultado es una cadena.
 * 
 *         El operador módulo % calcula el resto de la division de dos números.
 * 
 *         Recuerda las reglas de promoción numéricas:
 * 
 *         1. El de mayor tamaño gana.
 * 
 *         2. Coma flotante gana sobre entero.
 * 
 *         3. byte, short y char SIEMPRE se convierten a int automáticamente.
 * 
 *         4. El resultado de la expresión será del tipo que haya ganado.
 *
 */
public class Leccion_2_02 {

	public static void main(String[] args) {
		/*
		 * Como en otros lenguajes, la prioridad de los operadores puede modificarse mediante los paréntesis.
		 */
		int x = 2 * ((5 + 3) * 4 - 8);
		System.out.println(x);
		// java.lang.ArithmeticException:
		// System.out.println(1 % 0);
		// Operador módulo con negativos
		System.out.println(-7 % 3);
		System.out.println(-7 % -3);
		System.out.println(7 % -3);
		// El operador modulo con operandos decimales no entra en el examen
		System.out.println(7.5 % 3);
		System.out.println(7.1 % 3.5);
		// NaN. No genera ninguna excepción.
		System.out.println(1.0 % 0);
		// NaN. No genera ninguana excepción.
		System.out.println(1 % 0.);
		// Ejemplos de promoción
		long l1 = 1;
		// int i = 2 * l1; // NO COMPILA
		// El mayor entero es 2.147.483.647
		long l2 = 2_147_483_648L;
		byte b1 = 1, b2 = 2;
		// byte b3 = b1 * b2; // NO COMPILA
		int b3 = b1 * b2;
		// float f1 = 1.0; // NO COMPILA, 1.0 ES UN double
		float f1 = 1; // SI COMPILA, 1 pasa de int a float
		float f2 = 1.0F, f3 = 1.0f;
		//byte b1 = 1;
		// byte b2 = b1 + 1; // No compila, byte se convierte a int 'widening primitive conversion'.
		//float f1 = 1.0001F;
		f1++;
		System.out.println(f1);
		// La aritmética decimal no es exacta, si sumamos diez veces 0.1 el resultado debería ser 1.
		double t = 0;
		for (int k = 0; k < 10; k++) {
			t +=  0.1;
		}
		System.out.println(t);
		int big = 1234567890;
	    float approx = big;
	    System.out.println(big);
	    System.out.println(approx);
	    System.out.println(big - (int)approx);
	}

}
