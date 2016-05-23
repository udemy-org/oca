/**
 * LAS API'S DEL NÚCLEO DE JAVA 
 */
package es.smartcoding.oca.seccion3;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author pep
 * 
 *         Trabajando con fechas y horas
 * 
 *         Java 8 ha renovado completamente el trabajo con fechas, horas, períodos, y zonas
 *         horarias: con las clases LocalDate, LocalTime, LocalDateTime entre otras.
 * 
 *         En el examen suele quedar claro el formato de las fechas
 *         (Unos paises utilizan el formato 'dd/MM/yyyy' como
 *         España, otros el formato 'yyyy-MM-dd' como los Estados Unidos de
 *         Norte América), además Java usa un formato de 24 horas.
 *
 */
public class Leccion_3_06 {

	public static void main(String[] args) {
		/*
		 * La clase java.time.LocalDate contiene sólo una fecha, con formato ISO-8601 como 2010-08-31
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

		// También se puede combinar la fecha y la hora en un mismo objeto. SIEMPRE a través de métodos estáticos.
		LocalDateTime fechaHora1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6,
				15, 30);
		LocalDateTime fechaHora2 = LocalDateTime.of(fecha1, hora1);
		
		/*
		 * En versiones anteriores a Java 8, usábamos las clases Date y
		 * Calendar.
		 * 
		 * Actualmente, la mayoria de constructores de la clase Date no están
		 * recomendados (deprecated), y los meses empiezan en 0 lo que añade
		 * confusión.
		 */
		Date date1 = new Date();
		System.out.println(date1);
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2016, 4, 21);
		System.out.println(calendar1);
		Date date2 = calendar1.getTime();
		System.out.println(date2);
		Calendar calendar2 = new GregorianCalendar(2016, Calendar.APRIL, 21);
		Date date3 = calendar2.getTime();
		// Date date4 = new Date(2015, Calendar.JANUARY, 12); // Deprecated
		/*
		 * Manipular fechas con las nuevas clases de Java 8 es fácil.
		 */
		LocalDate date5 = LocalDate.of(2014, Month.JANUARY, 20);
		// 2014-01-20
		System.out.println(date5);
		date5 = date5.plusDays(2);
		// 2014-01-22
		System.out.println(date5);
		date5 = date5.plusWeeks(1);
		// 2014-01-29
		System.out.println(date5);
		date5 = date5.plusMonths(1);
		// 2014-02-28
		System.out.println(date5);
		date5 = date5.plusYears(5);
		// 2019-02-28
		System.out.println(date5);
		/*
		 * También tenemos la familia de métodos minus...
		 */
		date5 = date5.minus(Period.ofDays(3));
		System.out.println(date5);
		date5 = date5.minus(1, ChronoUnit.YEARS);
		System.out.println(date5);
		/*
		 * La clase LocalDate es inmutable, por lo tanto cuidado! este código no
		 * tiene ningún efecto:
		 */
		date5.minusDays(1);
		System.out.println(date5);
		/*
		 * En Java 8 Java define la clase Period. Hay cinco maneras de definir
		 * un período:
		 */
		// Cada año
		Period period1 = Period.ofYears(1);
		System.out.println(period1);
		// Cada trimestre
		Period period2 = Period.ofMonths(3);
		System.out.println("period2: " + period2);
		// Cada tres semanas
		Period period3 = Period.ofWeeks(3);
		System.out.println(period3);
		// Día sí y dia no, cada dos días
		Period period4 = Period.ofDays(2);
		System.out.println(period4);
		// Cada año y siete días
		Period period5 = Period.of(1, 0, 7);
		System.out.println(period5);
		/*
		 * Los períodos no se pueden encadenar al contrario que las fechas. Este
		 * período es de siete días contrariamente a lo que parece. A eso se
		 * debe el warning que puedes ver.
		 */
		Period period6 = Period.ofYears(1).ofWeeks(1);
		System.out.println(period6);
		/*
		 * Si bien un período comprende un día o más, las instancias de la clase
		 * Duration pueden contener el número de días, horas, minutos, segundos
		 * y nanosegundos.
		 * 
		 * Duration no está presente en el examen pero te puede ser útil en tu
		 * día a día.
		 */
		Duration duration1 = Duration.of(10, ChronoUnit.MINUTES);
		System.out.println(duration1);
		Instant instant1 = Instant.now();
		System.out.println(instant1);
		/*
		 * ISO es una estándar para las fechas.
		 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime
				.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		/*
		 * La clase DateTimeFormatter de Java 8 viene a ser como la clase
		 * SimpleDateFormat de Java 7.
		 */
		DateTimeFormatter shortDateTime = DateTimeFormatter
				.ofLocalizedDate(FormatStyle.SHORT);
		// 1/20/20
		System.out.println(shortDateTime.format(dateTime));
		// 1/20/20
		System.out.println(shortDateTime.format(date));
		// UnsupportedTemporalTypeException
		// System.out.println(shortDateTime.format(time));
		/*
		 * Este código es equivalente al anterior. Se puede utilizar uno u otro
		 * indistintamente.
		 */
		System.out.println(date.format(shortDateTime));
		// UnsupportedTemporalTypeException
		// System.out.println(time.format(shortDateTime));
		System.out.println(dateTime.format(shortDateTime));
		/*
		 * Si por algún motivo no queremos utilizar los formatos predeterminados
		 * (SHORT, MEDIUM, LONG o FULL), podemos crear nuestros propios formatos
		 * con los siguientes códigos:
		 * 
		 * MMMM representa el mes del año: M muestra el mes como un dígito. MM
		 * muestra el mes como dos dígitos. MMM muestra el mes como por ejemplo
		 * 'Ene' y MMMM muestra el mes como por ejemplo 'Enero'.
		 * 
		 * dd representa el dia del mes. Como en el caso del mes el numero de
		 * d's determina el formato del dia.
		 * 
		 * yyyy representa el año.
		 * 
		 * mm representa los minutos.
		 * 
		 * hh representa la hora.
		 */
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter
				.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(dateTimeFormatter1));
		/*
		 * Por último, nos queda por tratar el tema de la conversión de una
		 * cadena en un objeto fecha.
		 * 
		 * Tanto la clase LocalDate, LocalTime como LocalDateTime proporcionan
		 * un método estático, parse, que puede transformar una cadena en fecha.
		 */
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter
				.ofPattern("MM dd yyyy");
		LocalDate localDate = LocalDate.parse("01 02 2015", dateTimeFormatter2);
		LocalTime localTime = LocalTime.parse("11:22");
		// 2015-01-02
		System.out.println(localDate);
		// 11:22
		System.out.println(localTime);
	}

}
