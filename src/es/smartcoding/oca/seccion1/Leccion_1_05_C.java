package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         Referencias a objetos vs tipos primitivos
 * 
 *         Hay varias formas de asignar un valor a una referencia:
 * 
 *         1. Creando una instancia de la clase con new.
 * 
 *         2. Asignando otra referencia del mismo tipo.
 *         
 *         3. Asignando el valor de retorno de un método.
 * 
 *         Los objetos en sí, no tienen nombre, sólo una dirección de memoria y solamente pueden ser accedidos mediante una referencia.
 * 
 *         La diferencia clave entre referencias y tipos primitivos es que las referencias pueden inicializarse con null y los tipos primitivos no.
 *         Asímismo, los tipos primitivos no tienen miembros (métodos o campos) mientras que a través de las referencias podemos invocar los métodos de la clase.
 *
 */
public class Leccion_1_05_C {

	public static void main(String[] args) {

		/*
		 * La clase String es un caso particular que permite inicializar una instacia sin new.
		 */
		String s1 = new String("OCA"), s2 = s1, s3 = "OCP", s4 = s3.toUpperCase();
	}

}
