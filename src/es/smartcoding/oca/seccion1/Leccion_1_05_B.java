/**
 * LOS BLOQUES DE CONSTRUCCIÓN JAVA
 */
package es.smartcoding.oca.seccion1;

/**
 * @author pep
 * 
 *         Referencias a objetos vs tipos primitivos
 *         
 *         A la hora de trabajar con literales numéricos hay algunas reglas que debes conocer: 
 *         
 *         Un literal con decimales, por defecto es double, excepto si contiene el sufijo f o F.
 *         
 *         Cuando se opera con diferentes tipos numéricos el tipo del resultado es el tipo del operando mayor:  int < long < float < double 
 *         
 *         Porqué crees que falla la compilación en cada caso y cómo podría arreglarse?
 *         
 *         La solución es doble, o bien modificamos el tipo de la variable o bien modificamos el el tipo de los operandos con d o D para double, f o F para float y l o L para long.
 *         
 *         Por último recuerda que un char no puede contener valores negativos.
 *         
 *         Visita este enlace si quieres ampliar información: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * 
 *
 */
public class Leccion_1_05_B {

	public static void main(String[] args) {
		float f = 1.0F;
		double l = 1 + 1D;
		float i = 1 + 1.0f;
		char c = '\u0000';
	}

}
