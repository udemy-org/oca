/**
 * LAS API'S DEL NÚCLEO DE JAVA
 */
package es.smartcoding.oca.seccion3;

/**
 * @author pep
 * 
 *         La clase StringBuilder
 * 
 *         En esta lección aprenderemos a crear y utilizar objetos de tipo
 *         StringBuilder y las ventajas que aporta respecto de la clase String.
 * 
 *         La diferencia más importante es que StringBuilder es mutable, o dicho
 *         de otra manera, no es inmutable.
 * 
 *         La clase StringBuilder se añadió a Java en la versión 5.
 *         Anteriormente se usaba StringBuffer que es algo más lenta porque es
 *         multithread.
 *
 */
public class Leccion_3_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Dada la naturaleza inmutable de las cadenas en Java, en cada
		 * iteración, cuando se asigna una nueva cadena a la variables alpha, el
		 * objeto anterior esta disponible para que el Garbage Collector lo
		 * recupere.
		 * 
		 * Como resultado, durante el bucle se crean un total de 27 instancias,
		 * la mayor parte de las cuales son candidatas para que le Garbage
		 * Collector las reclame.
		 */
		String alphaStr = "";
		for (char current = 'a'; current <= 'z'; current++) {
			alphaStr += current;
		}
		System.out.println(alphaStr);
		/*
		 * Por su puesto, esto es demasiado ineficiente. La clase StringBuffer
		 * no es inmutable y no guarda los valores intermedios lo que la hace
		 * más eficiente.
		 * 
		 * En cada iteración StringBuilder modifica su estado y devuelve una
		 * referencia a sí mismo.
		 */
		StringBuilder alphaSb = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++) {
			alphaSb.append(current);
		}
		System.out.println(alphaSb);
		/*
		 * Cuando asignamos una referencia a otra, ambas apunta al mismo objeto,
		 * por lo tanto, el hecho de modificar una, modifica la otra también.
		 */
		StringBuilder a = new StringBuilder("abc");
		/*
		 * b y a apuntan al mismo objeto: sólo hay un objeto StringBuilder
		 * referenciado por dos variables
		 */
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		/*
		 * Hay tres maneras de crear un objeto StringBuilder:
		 * 
		 * El contructor por defecto crea un objeto StringBuilder con una
		 * capacidad de 16 caracteres.
		 */
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);
		/*
		 * Sobre tamaño y capacidad:
		 * 
		 * Tamaño se refiere al número de caracteres que contiene y capacidad al
		 * número de caracteres que puede contener actaulmente.
		 * 
		 * Como las cadenas son inmutables, capacidad y tamaño coinciden.
		 */
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		/*
		 * Los métodos charAt, indexOf, length y substring funcionan igual que
		 * en la clase String.
		 * 
		 * Cuál es la salida de estas línas de código?
		 * 
		 * anim 7 s
		 */
		StringBuilder sb4 = new StringBuilder("animals");
		String sub = sb4.substring(sb4.indexOf("a"), sb4.indexOf("al"));
		int len = sb4.length();
		char ch = sb4.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		/*
		 * El método append es probablemente el método más utilizado de la clase
		 * StringBuilder, está sobrecargado para soportar virtualmente cualquier
		 * tipo de datos.
		 */
		StringBuilder sb5 = new StringBuilder().append(1).append('c');
		sb5.append("-").append(true);
		System.out.println(sb5); // 1c-true
		/*
		 * El método insert añade caracteres a StringBuilder en una posición
		 * concreta.
		 */
		StringBuilder sb6 = new StringBuilder("Oracle Associate.");
		System.out.println(sb6);
		sb6.insert(7, "Certification ");
		System.out.println(sb6);
		/*
		 * El método delete es el opuesto, elimina caracteres de una secuencia y
		 * retorna una referencia al StringBuilder actual.
		 * 
		 * El métoodo deleteCharAt es conveniente cuando sólo queremos eliminar
		 * un caracter.
		 */
		sb6.delete(7, 21);
		System.out.println(sb6);
		sb6.deleteCharAt(sb6.length() - 1);
		System.out.println(sb6);
	}
}
