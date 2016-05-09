/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         La destrucción de objetos
 * 
 *         Debes tener en cuenta que no hay ninguna garantía de que el método System.gc() (Gargabe Collector) se ejecute cuando lo invocas.
 *         Java se toma esta invocación como una mera sugerencia pero perfectamente puede ignorarla.
 *         También debes saber cuándo el espacio que ocupa un objeto es candidato a ser recuperado:
 *         1. Será candidato cuando un objeto no tiene ninguna referencia.
 *         2. O cuando todas las referencias a un objeto están fuera de alcance.
 *         Como ves en este ejemplo, a la instancia t1 le asigno el valor null justo antes de invocar al método System.gc() y además la instancia t2 está fuera de rango,
 *         sin embargo el Garbage Collector sólo llama una vez al método finalize(), para recuperar el espacio que ocupaba el objeto asignado a t1.  
 * 
 */
class Temporal {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("En filanize()");
	}
}
public class Leccion_1_10 {

	public static void main(String[] args) {
		System.out.println("Llamando al Garbage Collector");
		Temporal t1 = new Temporal();
		System.out.println(t1);
		{
			Temporal t2 = new Temporal();
			System.out.println(t2);
			//t2 = null;
		}
		t1 = null;
		System.gc();
	}

}

