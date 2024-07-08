package practica;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Practica {
	
	public static void main(String[] args) {
		//Ejercicio 1: Variables
		/*
		 * Ponte creativo y preséntanos a tu familia con variables, 
		 * utiliza todos los tipos y cantidad de variables que puedas, 
		 * no olvides las convenciones de nombres Camel Case.
		 */
		
		String miNombre = "Mario Flórez";
		int miEdad = 26;
		
		String miNovia = "Seydy Moreno";
		int edad_novia = 24;
		
		String hija_perruna = "Hanna Banana";
		LocalDate dia_nacimiento = LocalDate.of(2019, 01, 01);
		int edad_perruna = (int) ChronoUnit.YEARS.between(dia_nacimiento, LocalDate.now());
		
		String $hijaMedioPerruna = "Tamara Andrea 'Tammy'";
		LocalDate $diaNacimiento = LocalDate.of(2021, 3, 1).minusMonths(5);
		int $edadPerruna = (int) ChronoUnit.YEARS.between($diaNacimiento, LocalDate.now());
		
		String hijaPerrunaMenor = "Mia Colucci";
		LocalDate diaNacimiento = LocalDate.of(2021, 7, 1);
		int edadPerruna = (int) ChronoUnit.YEARS.between(diaNacimiento, LocalDate.now());
		
		
		System.out.println("----->     Mi Familia     <-----");
		System.out.println();
		System.out.println("Me llamo "+miNombre+" tengo "+miEdad+" años.");
		System.out.println("Mi novia se llama "+miNovia+" tiene "+edad_novia+" años.");
		System.out.println("Tengo 3 hijas perrunas:");
		System.out.println("La primera se llama "+hija_perruna+" tiene "+edad_perruna+" años.");
		System.out.println("La del medio se llama "+$hijaMedioPerruna+" tiene "+$edadPerruna+" años.");
		System.out.println("La menor se llama "+hijaPerrunaMenor+" tiene "+edadPerruna+" años.");
		
		
		//Ejercicio 2: Casting
		/*
		 * Usando los dos tipos de casting que aprendiste (implícito y explícito), 
		 * resuelve los siguientes casteos indicando qué tipo es 
		 * y si se está calculando estimación o exactitud.
		 */
		
		System.out.println("\n \n ");
		System.out.println("----->     Casting     <-----");

		System.out.println();
		
		//conviértelo a int
		char c = 'z';
		int cI = c;
		System.out.println("char convertido a int (cast simple): "+cI);
		
		//conviertelo a long y luego de long a short
		int i = 250; 
		long iL = i;
		System.out.println("int convertido a long (cast simple): "+iL);
		short iS = (short) iL;
		System.out.println("long convertido a short (cast explícito): "+iS);
		
		//conviértelo a long
		double d = 301.067;
		long dL = (long)d;
		System.out.println("Double convertido a long (cast explícito): "+dL);
		
		//súmale 5000.66 conviértelo a float
		int i2 = 100;
		float i2F = (float) (i2 + 5000.66);
		System.out.println("int sumado y convertido a float (cast explícito): "+i2F);

		//multiplícalo por 100 y conviértelo a byte
		int i3 = 737;
		byte i3B = (byte) (i3 * 100);
		System.out.println("int multiplicado y convertido a byte (cast explícito): "+i3B);
		
		//divídelo entre 25 y conviértelo a long
		double d2 = 298.638;
		long d2L = (long) d2/25;
		System.out.println("double divido y convertido a long (cast explícito): "+d2L);
	}

}
