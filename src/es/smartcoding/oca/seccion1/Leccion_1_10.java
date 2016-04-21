/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La destrucción de objetos
 * 
 *         En esta lección haremos una distinción clara entre referencias y
 *         objetos y estudiaremos el ‘Garbage Collector’.
 * 
 *         Debes tener en cuenta que no hay ninguna garantía de que el método
 *         System.gc() (Gargabe Collector) se ejecute cuando lo invocas.
 * 
 *         Java se toma esta invocación como una mera sugerencia pero
 *         perfectamente puede ignorarla.
 * 
 *         También debes saber cuándo el espacio que ocupa un objeto es
 *         candidato a ser recuperado:
 * 
 *         1. Un objeto no tiene ningua referencia.
 * 
 *         2. Todas las referencia de un objeto estan fuera de alcance.
 * 
 */
public class Leccion_1_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Llamando al Garbage Collector");
		Temporal t1 = new Temporal();
		System.out.println(t1);
		{
			Temporal t2 = new Temporal();
			System.out.println(t2);
			// t2 = null;
		}
		t1 = null;
		System.gc();
	}

}

class Temporal {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("En filanize");
	}
}