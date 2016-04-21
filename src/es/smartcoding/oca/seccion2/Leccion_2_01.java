/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores Java
 * 
 *         En esta lección repasaremos qué son los operadores de Java.
 * 
 *         Los operadores son símbolos especiales que se pueden aplicar a
 *         conjuntos de variables, valores o literales (llamados operandos).
 * 
 *         Pueden ser unarios, binarios y ternarios que pueden aplicarse a uno,
 *         dos o tres operadores respectivamente.
 * 
 *         Los operadores Java, no necesariamente se evalúan de izquierda a
 *         derecha, la expresión que ves en el método main se ejecuta de derecha
 *         a izquierza.
 * 
 *         Aunque puede modificarse con paréntesis, la prioridad de los
 *         operadores Java es la siguinte (de más a menos):
 * 
 *         Operadores unarios ++, --
 * 
 *         Operadores unarios + - !
 * 
 *         Operadores producto, división y módoulo * / %
 * 
 *         Operadores suma y resta + -
 * 
 *         Operadores de desplazamiento << >> >>>
 * 
 *         Operadores relacionales < > <= >= instanceof
 * 
 *         Operadores de igualdad y desigualdad == !=
 * 
 *         Operadores lógicos & ^ |
 * 
 *         Operadores lógicos de circuito corto && ||
 * 
 *         Operador ternario <expr booleana> ? <expre1> : <expre2>
 * 
 *         Operadores de asignación = += -= *= /= %= &= ^= != <<= >>= >>>=
 * 
 */
public class Leccion_2_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Durante el examen debes de ser capaz de evaluar expresiones como
		 * esta.
		 */
		int i = 1;
		int j = 2 + 3 * ++i;

		System.out.println(i);
		System.out.println(j);

	}

}
