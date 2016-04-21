/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

//import java.util.Date;
import java.util.Random;

/**
 * @author pep
 * 
 *         La declaración de paquetes e import
 * 
 *         Java tiene literalmente miles de clases, distribuidas en paquetes que
 *         son agrupaciones lógicas de clases. En esta lección veremos cómo
 *         importar esos paquetes.
 * 
 *         ATENCIÓN: las preguntas con líneas de código numeradadas desde 1
 *         representan programan enteros. Si no están numeradas a partir de 1
 *         representan fragmentos y tenemos que suponer que el código anterior
 *         es correcto y que se han hecho los imports que correspondan.
 *
 */
public class Leccion_1_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());
		// conflictos entre clases
		java.util.Date date1 = new java.util.Date();
		java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(date1);
		System.out.println(date2);
	}

}
