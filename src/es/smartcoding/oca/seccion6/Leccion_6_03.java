/**
 * LA GESTIÓN DE EXCEPCIONES
 */
package es.smartcoding.oca.seccion6;

/**
 * @author pep
 * 
 *         Tipos de excepciones comunes
 * 
 *         El examen OCA cuestionará tu conocimiento sobre tres tipos de
 *         excepciones: excepciones no comprobadas o excepciones en tiempo de
 *         ejecución, excepciones comprobadas y errores.
 * 
 *         Las excepciones runtime extienden RuntimeException, no necesitan ser
 *         ni tratadas ni declaradas. Pueden ser lanzadas por el programador o
 *         por la Java Virtual Machine y estas son las más comunes:
 * 
 *         1. ArithmeticException
 *         
 *         int i = 1 / 0;
 * 
 *         2. ArrayIndexOutOfBoundsException
 *         
 *         int[] v = new int[] {1,2,3};
 *         int k = v[3];
 * 
 *         3. ClassCastException
 *         
 *         String str = "Alfa";
 *         Object obj = str;
 *         Integer i = (Integer) obj;
 * 
 *         4. IllegalArgumentException
 *         
 *         void f(int e) {
 *            if(e < 0) {
 *            	throw new IllegalArgumentException("El argumento no puede ser negativo");
 *            }
 *         }
 * 
 *         5. NullPointerException
 *         
 *         String s = null;
 *         s.length();
 * 
 *         6. NumberFormatException
 *         
 *         int i = Integer.parseInt("alpha");
 * 
 *         Las excepciones comprobadas con Exception's que no son
 *         RuntimeException's. Pueden ser lanzadas por el programador o por la
 *         Java Virtual Machine y estas son las más comunes:
 * 
 *         1. FileNotFoundException
 * 
 *         2. IOException
 * 
 *         Los errores son instancias de la clase java.lang.Error. Pueden ser
 *         lanzadas sólo por la Java Virtual Machine y no deberían ser ni
 *         tratadas ni declaradas. Los errores son raros pero quizan veas alguno
 *         de estos:
 *         
 *         1. ExceptionInInitizationError
 *         
 *         2. StackOverflowError
 *         
 *         3. NoClassDefFoundError
 * 
 */
public class Leccion_6_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
