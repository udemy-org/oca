/**
 * LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author pep
 * 
 *         La clase ArrayList
 * 
 *         En esta lección veremos cómo la clase ArrayList supera la limitación
 *         de los arrays al poder añadir elementos a una colección.
 * 
 *         Al crear un array debemos saber cuantos elementos tendrá. Este no es
 *         siempre el caso. El tamaño de la clase ArrayList igual que la clase
 *         StringBuilder puede cambiar en tiempo de ejecución.
 * 
 *         Recuerda que si durante el examen te muestran un fragmento de código
 *         que no empieza por 1, puedes asumir que todos los imports requeridos
 *         están presentes. De la misma manera, también puedes asumir que todos
 *         los imports están presentes si te muestran un método o un fragmento
 *         de un método.
 *
 */
public class Leccion_3_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * A la hora de crear un objeto ArrayList tenemos tres constructores:
		 * 
		 * 1. El constructo por defecto.
		 * 
		 * 2. Con una capacidad específica.
		 * 
		 * 3. Haciendo una copia de otro ArrayList.
		 */
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		/*
		 * Desde Java 5, con la introducción de genéricos, podemos especificar
		 * el tipo de contenido.
		 */
		ArrayList<String> list4 = new ArrayList<String>();
		/*
		 * Y desde Java 7, podemos omitir el tipo a la hora de invocar al
		 * constructor, puesto que el compilador lo puede inferir.
		 * 
		 * Esto se consigue con el operador diamante (diamond)
		 */
		ArrayList<String> list5 = new ArrayList<>();
		/*
		 * Puesto que la clase ArrayList implementa la interfaz List, esto es
		 * totalmente válido.
		 */
		List<String> list6 = new ArrayList<>();
		/*
		 * El método add es probablemente el método más utilizado. Como no hemos
		 * especificado ningún parámetro en el momento de la creación, Java
		 * asume Object, es decir, cualquier objeto.
		 */
		list1.add("Alfa");
		list1.add(123);
		list1.add(Boolean.TRUE);
		System.out.println(list1);
		/*
		 * Pero qué ocurre con list4? Dado que hemos especificado que contenga
		 * sólo cadenas el compilador detectara cualquier intento de uso
		 * indebido.
		 */
		list4.add("Alfa");
		list4.add("Charlie");
		// list4.add(123); // NO COMPILA
		list4.add(1, "Bravo");
		System.out.println(list4);
		/*
		 * El método remove, elimina el primer elemento que coincida con el
		 * argumento, o un elemento en una posición específica.
		 */
		list4.remove("Bravo");
		System.out.println(list4);
		list4.remove(0);
		System.out.println(list4);
		/*
		 * Si intentamos eliminar un índice que no existe, obtenemos una
		 * excepción java.lang.IndexOutOfBoundsException.
		 */
		// list4.remove(10);
		/*
		 * En cambio, si intentamos eliminar un objeto que no existe,
		 * sencillamente retorna false, pero no se lanza ninguana excepción.
		 */
		boolean obj = list4.remove("Zulu");
		System.out.println(obj);
		/*
		 * También existe el método removeIf, pero lo trataremos más tarde
		 * porque utiliza expresiones lambda.
		 */
		list4.removeIf(e -> e.startsWith("K"));
		System.out.println(list4);
		/*
		 * Por otro lado, el método set reemplaza un elemento por otro y lanza
		 * una excepcion java.lang.IndexOutOfBoundsException si no existe el
		 * elemento a reemplazar.
		 */
		list4.set(0, "Zulu");
		System.out.println(list4);
		/*
		 * Los métodos isEmpty, size, clear y contains, hacen exactamente lo que
		 * dicen:
		 * 
		 * isEmpty retorna true si la lista esta vacía (que es diferentes de
		 * null).
		 * 
		 * size retorna el número de elementos de la lista (un entero).
		 * 
		 * clear elimina todos los elementos de la lista (no se lanza ninguna
		 * excepción si la lista ya está vacia).
		 * 
		 * contains retorna true si un elemento esta presente en la lista.
		 */
		System.out.println(list4.isEmpty());
		System.out.println(list4.size());
		System.out.println(list4.contains("Zulu"));
		list4.clear();
		list4.clear();
		System.out.println(list4);
		/*
		 * Finalmente el método equals retornará true cuando dos listas tengan
		 * los mismos elementos y en el mismo orden.
		 */
		list5.clear();
		list6.clear();
		System.out.println(list5);
		System.out.println(list6);
		System.out.println(list5.equals(list6));
		list5.add("Alfa");
		list5.add("Bravo");
		list6.add("Alfa");
		list6.add("Bravo");
		System.out.println(list5);
		System.out.println(list6);
		System.out.println(list5.equals(list6));
		list5.add(1, "Charlie");
		list6.add("Charlie");
		System.out.println(list5);
		System.out.println(list6);
		System.out.println(list5.equals(list6));
		/*
		 * Pero, qué pasa si queremos guardar valores primitivos dentro de una
		 * lista? Bien, cada tipo primitivo tiene su clase envolvente (Wrapper).
		 * 
		 * boolean -> Boolean. new Boolean(true)
		 * 
		 * byte -> Byte. new Byte((byte) 1)
		 * 
		 * short -> Short. new Short((short) 1)
		 * 
		 * int -> Integer. new Integer(1)
		 * 
		 * long -> Long. new Long(1)
		 * 
		 * float -> Float. new Float(1.0)
		 * 
		 * double -> Double. new Double(1.0)
		 * 
		 * char -> Character. new Character('a')
		 */
		/*
		 * Además, cada clase envolvente proporciona un método para pasar de
		 * String a su tipo primitivo correspondiente:
		 * 
		 * Boolean.parseBoolean("true");
		 * 
		 * Byte.parseByte("1");
		 * 
		 * Short.parseShort("1");
		 * 
		 * Integer.parseInt("1");
		 * 
		 * Long.parseLong("1");
		 * 
		 * Float.parseFloat("1");
		 * 
		 * Double.parseDouble("1");
		 * 
		 * La família de métodos valueOf se utilizan para pasar de String a su
		 * clase envolvente correspondiente:
		 * 
		 * Boolean.valueOf("TRUE");
		 * 
		 * Byte.valueOf("2");
		 * 
		 * Short.valueOf("2");
		 * 
		 * Integer.valueOf("2");
		 * 
		 * Long.valueOf("2");
		 * 
		 * Float.valueOf("2.2");
		 * 
		 * Double.valueOf("2.2");
		 */
		List<Integer> list7 = new ArrayList<>();
		list7.add(new Integer(1));
		list7.add(new Integer(2));
		list7.add(new Integer(3));
		list7.add(null);
		System.out.println(list7);
		/*
		 * Quiere esto decir que cada vez que queramos añadir un elemento a la
		 * lista tenemos que crear un objeto Integer?
		 * 
		 * No, afortunadamente desde Java 5 podemos utilizar un mecanismo
		 * llamado Autoboxing que básicamente consiste en que es el propio Java
		 * quien hace las conversiones apropiadas tanto en un sentido (de tipo
		 * primitivo a objeto inBoxing) como en otro (de objeto a tipo primitivo
		 * outBoxing).
		 */
		list7.add(4);
		System.out.println(list7);
		int k = list7.get(0);
		System.out.println(k);
		/*
		 * El método remove elimina un objeto o el objeto en una posición
		 * concreta, por lo que puede haber cierta confusión.
		 * 
		 * Recuerda, en este caso remove elimina el objeto en la posición 1 (es
		 * decir el 2) y no el Integer con valor 1.
		 * 
		 * Si quieres eliminar el Integer con valor 1, tienes que hacerlo
		 * explícitamente:
		 * 
		 * list7.remove(new Integer(1));
		 */
		list7.remove(1);
		// list7.remove(new Integer(1));
		System.out.println(list7);
		/*
		 * Convertir entre arrays y listas y viceversa es una tarea común. El
		 * método toArray hace justamente eso, pero por defecto convierte a un
		 * array de objetos que seguramente no es lo que queremos en la mayoría
		 * de los casos.
		 * 
		 * El método toArray acepta un parámetro de tipo array. La ventaja de
		 * especificar un cero como tamaño del array que pasamos como argumento
		 * al parámetro del metodo toArray es que Java determine el tamaño
		 * adecuado por sí mismo.
		 * 
		 * Aunque nosostros podemos sugerir un tamaño, que si es mayor que el
		 * número de elementos, Java rellenará con valores null y si es menor,
		 * Java sencillamente lo ignorará y creará uno nuevo que se ajuste al
		 * tamaño real.
		 */
		Object[] array1 = list7.toArray();
		System.out.println(Arrays.toString(array1));
		Integer[] array2 = list7.toArray(new Integer[0]);
		// Integer[] array2 = list7.toArray(new Integer[10]);
		// Integer[] array2 = list7.toArray(new Integer[2]);
		System.out.println(Arrays.toString(array2));
		/*
		 * Convertir de una array a un lista es más interesante.
		 * 
		 * El array original y la lista estan enlazados: cuando se hace un
		 * cambio en uno de los dos el cambio está automáticamente presente en
		 * el otro.
		 * 
		 * La lista de respaldo (backed List) como se la conoce es una
		 * implementación particular de la interfaz List, de tamaño fijo, que
		 * lanza una excepción java.lang.UnsupportedOperationException si
		 * intentamos añadir elementos.
		 */
		String[] array3 = new String[] { "Alfa", "Bravo", "Charlie", "Delta",
				"Eco" };
		List<String> list8 = Arrays.asList(array3);
		System.out.println(Arrays.toString(array3));
		System.out.println(list8);
		array3[4] = "Foxtrot";
		System.out.println(Arrays.toString(array3));
		System.out.println(list8);
		list8.set(4, "Golf");
		System.out.println(Arrays.toString(array3));
		System.out.println(list8);
		// Lanza una excepción de tipo java.lang.UnsupportedOperationException
		// list8.add("Hotel");
		/*
		 * No forma parte del examen, pero el método asList de la clase Arrays
		 * que declara un parámetro Varargs es una alternativa interesante a la
		 * hora de crear un ArrayList en un sola línia.
		 */
		List<String> list9 = Arrays.asList("Alfa", "Bravo", "Charlie", "Delta",
				"Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo",
				"Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo",
				"Sierra", "Tango", "Uniform", "Victor", "Wiskey", "Xray",
				"Yankee", "Zulu");
		System.out.println(list9);
		/*
		 * Finalmente, podemos desordenar, girar y ordenar una lista fácilmente
		 * con los métodos shuffle, reverse y sort respectivamente de la clase
		 * Collections.
		 */
		Collections.shuffle(list9);
		System.out.println(list9);
		Collections.reverse(list9);
		System.out.println(list9);
		Collections.sort(list9);
		System.out.println(list9);

	}

}
