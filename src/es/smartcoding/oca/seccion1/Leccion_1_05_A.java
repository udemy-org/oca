/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         Referencias a objetos vs tipos primitivos
 * 
 *         En esta lección abordaremos los dos tipos de datos que nos podemos
 *         encontrar tipos primitivos y referencias a objetos.
 * 
 *         Java tiene 8 tipos primitivos:
 * 
 *         byte, short, char, int, long, float, double, boolean.
 *
 */
public class Leccion_1_05_A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println((int) (Math.pow(2, 32) / 2 - 1));
		System.out.println(Integer.MIN_VALUE);
		System.out.println((int) (Math.pow(2, 32) / 2 * -1));
		System.out.println();
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MIN_VALUE - 1);
		System.out.println();
		System.out.println((long) Integer.MAX_VALUE + 1);
		System.out.println((long) Integer.MIN_VALUE - 1);
		long l1 = 2147483647;
		// long l2 = 2147483648; // NO COMPILA
		long l3 = 2147483648L;
		// octal
		int i1 = 031;
		System.out.println(i1);
		// hexa
		int i2 = 0x19;
		System.out.println(i2);
		// binario
		int i3 = 0B11001;
		System.out.println(i3);
		/*
		 * Se pueden colocar guiones bajos en cualquier parte del literal menos
		 * al principio y al final del literal y antes o después de del punto
		 * decimal.
		 */
		int i4 = 39_164_987;
		double d1 = 3.141_516;
		System.out.println(i4);
		System.out.println(d1);
	}

}
