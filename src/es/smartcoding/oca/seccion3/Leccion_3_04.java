/**
 * LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

import java.util.Arrays;

/**
 * @author pep
 * 
 *         Los arrays de Java
 * 
 *         Tanto la clase String como la clase StringBuilder están implementadas con una array de caracteres.
 * 
 *         La clase StringBuilder sustituye su array de caracteres por otro cuando se queda sin espacio.
 *
 */
public class Leccion_3_04 {

	public static void main(String[] args) {
		
		// La manera más sencilla de crear un array es esta, donde cada elemento es un entero y por defecto toma el valor de 0.
		System.out.println("Array 1");
		int[] numbers1 = new int[3];
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println(numbers1[i]);
		}

		// Esta es otra forma de crear un array y de especificar cuáles son sus elementos.
		System.out.println("Array 2");
		int[] numbers2 = new int[] { 42, 55, 99 };
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}

		// Esta es una versión reducida de la anterior, más conveniente. En este caso creamos un array anónimo.
		System.out.println("Array 3");
		int[] numbers3 = { 42, 55, 99 };
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
		// En ocasiones puedes encontrar los corchetes junto a la variable, en principio, es equivalente.
		int numbers4[] = { 42, 55, 99 };

		// Pero atención en este ejemplo, a es un array de enteros y b un entero. Mientras que c y d, ambos son arrays de enteros.
		int a[], b;
		int[] c, d;

		/*
		 * Los arrays pueden ser de cualquier tipo, incluso de clases creadas por nosotros.
		 * 
		 * Un array de cadenas por ejemplo, no contiene cadenas sino referencias a cadenas y lo mismo pasa con cualquier otro tipo.
		 * 
		 * La implementación del método equals de un array simplemente comprueba si apuntan al mismo objeto.
		 */
		String[] cadenas1 = { "alfa", "bravo", "charlie", "delta", "echo" };
		// String[] cadenas2 = { "alfa", "bravo", "charlie", "delta", "echo" };
		String[] cadenas2 = cadenas1;
		System.out.println("cadenas1: " + Arrays.toString(cadenas1));
		System.out.println("cadenas1.equals(cadenas2): " + cadenas1.equals(cadenas2));
		System.out.println("cadenas1 == cadenas2: " + (cadenas1 == cadenas2));
		System.out.println("cadenas1: " + cadenas1);
		System.out.println("cadenas2: " + cadenas2);
		// Considera este ejemplo donde el array de cadenas cadenas3 tiene tres elementos: alfa, bravo y charlie.
		// Fijate cómo a pesar de asignar null a alfa, bravo y charlie, el array sigue manteniento sus referencias intactas.
		String alfa = "alfa", bravo = "bravo", charlie = "charlie";
		String[] cadenas3 = { alfa, bravo, charlie };
		System.out.println("Arrays.toString(cadenas3): " + Arrays.toString(cadenas3));
		alfa = bravo = charlie = null;
		
		// cadenas3 continúa guardando las referencias iniciales.
		System.out.println("Arrays.toString(cadenas3): " + Arrays.toString(cadenas3));
		Object[] objects = new String[] { "alfa", "bravo", "charlie", "delta" };
		System.out.println(Arrays.toString(objects));
		// Lanza java.lang.ArrayStoreException en tiempo de ejecución.
		// objects[0] = new StringBuilder();
		String[] cadenes4 = { "cana", "caña", "cama" };
		Arrays.sort(cadenes4);
		System.out.println("Arrays.toString(cadenes4): " + Arrays.toString(cadenes4));
		
		// El método binarySearch busca elementos dentro de una array ordenado, por ejemplo con el método sort() de la clase Arrays. Si un array no está ordenado, el resultado de la búsqueda será impredecible.
		int pos = Arrays.binarySearch(cadenes4, "caña");
		System.out.println("cadenes4[pos]: " + cadenes4[pos]);
		pos = Arrays.binarySearch(cadenes4, "cava");
		System.out.println("pos: " + pos);
		
		/*
		 * Java interpreta los arrays multidimensionales como arrays de arrays. Las matrices o arrays bidimensionales pueden ser simétricas de m x n elementos, 
		 * o asimétricas donde cada fila puede tener un número diferente de columnas.
		 */
		int[][] matriz1 = new int[3][4];
		int[][] matriz2 = new int[3][];
		matriz2[0] = new int[3];
		matriz2[1] = new int[4];
		matriz2[2] = new int[2];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("********");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println();
		}
		
		// Alternativamente puede recorrerse con dos bucles for-Each.
		System.out.println("********");
		for(int[] i: matriz2) {
			for(int j: i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}















