/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         El control de flujo avanzado
 * 
 *         El examen questionará tus conocimientos sobre la orden break y continue con etiquetas en bucles anidados.
 *
 */
public class Leccion_2_06 {

	/**
	 * @param args
	 */
	/*
	 * Un bucle puede contener otros bucles (bucles anidados). En este ejemplo
	 * intencionadamente he escrito un bucle clásico dentro de un bucle
	 * for-each.
	 * 
	 * En Java una Matriz es una array de arrays. El bucle más externo recorre
	 * en turno los arrays { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 4, 7 }. Y el
	 * bucle interno recorre cada elemento de cada array: 5, 2, 1, 3 después 3,
	 * 9, 8, 9, etc.
	 */
	public static void main(String[] args) {
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 },
				{ 5, 7, 4, 7 } };
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
		/*
		 * Los bloques if, switch y bucles pueden tener etiquetas opcionales, un
		 * identificador acabado con ':', que se usa para saltar en un momento
		 * determinado.
		 * 
		 * Tanto break como continue son una rotura de flujo, un salto, y
		 * admiten una etiqueta opcional que si no la llevan se entiende que se
		 * refire al bucle actual.
		 * 
		 * En un bucle for continue primero ejecuta el bloque de incremento de la variable y
		 * después se verifica la condición de final de bucle.
		 */
		System.out.println("Continue + for");
		int[] v1 = { 1, 3, 5, 6, 9 };
		for (int i = 0; i < v1.length; i++) {
			if (v1[i] % 2 == 0) {
				continue;
			}
			System.out.println(v1[i]);
		}

		etiqueta_01: for (int i = 0; i < 10; i++) {
			etiqueta_02: for (int j = 0; j < 10; j++) {
				// ignora si i par
				if (i % 2 == 0) {
					/*
					 * En un bucle for continue va al bloque de incremento y
					 * después evalua la condición!!!
					 */
					continue etiqueta_01;
				}
				// ignora si j <= i
				if (j <= i) {
					continue;
				}
				System.out.println(i + ", " + j);
				// acaba cuando i * j > 9
				if (i * j > 9) {
					break etiqueta_01;
				}
			}
		}
		int a = 3, b = 4, c = 0;
		if_01: if (a != 0) {
			if (b != 0) {
				if (c == 0) {
					break if_01;
				}
				System.out.println((a * b) / c);
			}
		}
		int k = 0;
		while (k < 10) {
			System.out.println(k);
			if (k % 2 == 0) {
				/*
				 * En un bucle do o while continue va a evaluar la condición de
				 * la próxima iteración.
				 */
				++k;
				continue;
			}
			k++;
		}
	}

}
