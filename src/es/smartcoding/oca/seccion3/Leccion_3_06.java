/**
 * LAS API'S DEL NÚCLEO DE JAVA 
 */
package es.smartcoding.oca.seccion3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author pep
 * 
 *         Trabajando con fechas y horas
 * 
 *         En esta lección introduciremos nuevas clases con las que Java 8 ha
 *         renovado el trabajo con fechas, horas, períodos, y zonas horarias:
 *         LocalDate, LocalTime, LocalDateTime entre otras.
 * 
 *         En el examen no tienes que preocuparte sobre los diferentes formatos
 *         de las fechas (Unos paises utilizan el formato 'dd/MM/yyyy' como
 *         España, otros el formato 'yyyy-MM-dd' como los Estados Unidos de
 *         Norte América), además Java usa un formato de 24 horas.
 *
 */
public class Leccion_3_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * La clase java.time.LocalDate contiene sólo una fecha, ISO-8601 como
		 * 2010-08-31
		 * 
		 * La clase java.time.LocalTime contiene sólo una hora.
		 * 
		 * La clase java.time.LocalDateTime contiene una fecha y una hora.
		 */
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		/*
		 * Estas dos fechas son equivalentes. Si bien el tipo enumerado Month no
		 * forma parte del examen OCA.
		 */
		LocalDate fecha1 = LocalDate.of(2015, 1, 20);
		LocalDate fecha3 = LocalDate.of(2015, Month.JANUARY, 20);
		/*
		 * Las horas pueden tener diferentes niveles de detalle:
		 * 
		 * 1. Hora y minutos.
		 * 
		 * 2. Hora, minutos y segundos.
		 * 
		 * 3. Hora, minutos, segundos y nanosegundos.
		 */
		LocalTime hora1 = LocalTime.of(6, 15);
		LocalTime hora2 = LocalTime.of(6, 15, 30);
		LocalTime hora3 = LocalTime.of(6, 15, 30, 200);
		/*
		 * También se puede combinar la fecha y la hora en un mismo objeto.
		 * SIEMPRE a través de métodos estáticos.
		 */
		LocalDateTime fechaHora1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6,
				15, 30);
		LocalDateTime fechaHora2 = LocalDateTime.of(fecha1, hora1);
	}

}
