/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         Referencias a objetos vs tipos primitivos
 *         
 *         El día del examen estaría bien que supieras los límites de los tipos numéricos, particularmente del tipo int, aunque no te los preguntarán directamente.
 *         Cuál crees que es la salida de este código?
 *         
 *         Como ves si sumas uno a valor entero máximo obtienes el valor entero mínimo y paralelamente si restas uno al valor entero mínimo obtienes el valor entero máximo.
 *
 */
public class Leccion_1_05_A {

	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		i++;
		System.out.println(i);
		i = Integer.MIN_VALUE;
		System.out.println(i);
		i--;
		System.out.println(i);
		
	}

}
