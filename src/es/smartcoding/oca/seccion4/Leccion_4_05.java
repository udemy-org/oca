/**
 * LOS MÉTODOS Y LA ENCAPSULACIÓN
 */
package es.smartcoding.oca.seccion4;

/**
 * @author pep
 * 
 *         La sobrecarga de métodos
 *         
 *         Probablemente te encontrarás preguntas de este tipo en el test, así que asegurate de entender bien lo que se esconde detrás de cada invocación.
 * 
 *         Ya hemos utilizado métodos sobrecargados sin darnos cuenta. Por ejemplo System.out.println() es un método sobrecargado porque admite
 *         virtualmente cualquier tipo de argumento.
 * 
 *         La manera cono Java resulve el método a invocar cuando está sobrecargado es mediante una reglas muy sencillas. Por ejemplo, la invocación metodo1(1, 1)
 * 
 *         1. Busca una correspondencia exacta: metodo1(int, int)
 * 
 *         2. Busca una correspondencia con un tipo primitivo mayor: metodo1(int, long), metodo1(long, long) ...
 * 
 *         3. Hace auxtoboxing: metodo1(Integer, Integer) pero NO metodo1(Long, Long) porque implicaría una ampliación de tipo y un autoboxing, dos operaciones.
 * 
 *         4. Busca un método con argumentos variables, varargs: metodo1(int ... v). 
 * 
 *         Como regla general, en toda expresión el tipo con mayor tamaño domina sobre el resto.
 *
 */
public class Leccion_4_05 {

	static void metodo1() {
	}

	static void metodo1(byte a, byte b) { System.out.println("byte byte");	}

	static void metodo1(short a, short b) {	System.out.println("short short"); }

	static void metodo1(int a, int b) { System.out.println("int int"); }

	static void metodo1(Integer a, Integer b) { System.out.println("Integer Integer");	}

	static void metodo1(long a, long b) { System.out.println("long long"); }

	static void metodo1(float a, float b) {	System.out.println("float float"); }

	static void metodo1(double a, double b) { System.out.println("double double"); }

	static void metodo1(int... v) {	System.out.println("varargs"); }

	// No compila, método duplicado, los argumentos variables se considera un array
	// static void metodo1(int[] v) {
	//
	// }


	public static void main(String[] args) {

		byte b1 = 1, b2 = 2;
		short s1 = 1, s2 = 2;

		/* Intenta deducir la salida de este programa.	 */
		metodo1(b1, b2);
		metodo1(s1, s2);
		metodo1(b1, s1);
		metodo1(1, 2);
		metodo1(new Integer(1), new Integer(2));
		// metodo1(new Integer(1), 2); // No compila, ambiguo
		metodo1(1L, 2);
		metodo1(1L, 2F);
		metodo1(1.0F, 2.0F);
		metodo1(1.0F, 2.0);
		metodo1(1.0, 2.0);
		metodo1(1, 2, 3);
		metodo1(b1, b2, s1, s2);
		// metodo1(1.0, 2.0, 3.0); // No compila, no hay un metodo metodo1(double ... d)
		metodo1(new Integer(1), new Integer(2), new Integer(3));

		/*
		 * En resumen, la forma de proceder en una invocación como por ejemplo metodo1(1, 2), es la siguiente:
		 * 
		 * 1. Busca una correspondencia exacta: metodo1(int, int)
		 * 2. Busca una correspondencia con un tipo primitivo mayor: metodo1(long, long)
		 * 3. Auxtoboxing: metodo1(Integer, Integer) pero NO metodo1(Long, Long)
		 * 4. Varargs: metodo1(int ... v)
		 */

	}

}



















/*
 * Qué pasaría si comentáramos el método metodo1(int, int). La llamada metodo1(1, 2) a qué método invocararía, al método metodo1(long, long)
 * o al método metodo1(Integer, Integer)?
 * 
 * Java toma el camino menos caro, es más facil convertir int a long (de más pequeño a más grande) que a Integer, por lo tanto llamaría al
 * método metodo1(long, long).
 * 
 * Lo que no hará Java de forma automática es pasar de un tipo mayor como long a una menor como int, porque se pierde precisión.
 * 
 * Tampoco hará conversiones dobles de forma automática, por ejemplo de int a long y de long a Long.
 * 
 */
