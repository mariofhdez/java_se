
public class Funciones {

	public static void main(String[] args) {
		double y = 3;

		// Área de un círculo: pi*r^2
		double area = circleArea(y);
		System.out.println(area);

		// área de una esfera: 4*pi*r^2
		System.out.println(sphereArea(y));

		// Volúmen de una esfera: (4/3) * Pi * r^3
		System.out.println(sphereVolume(y));
		
		//Convertir moneda
		System.out.println("Pesos a dólares: "+convertToDolar(1000, "COP"));
	}
	
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static double sphereArea(double radius) {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public static double sphereVolume(double radius) {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}
	
	/**
	 * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
	 * @param quantity Cantidad de dinero
	 * @param currency Tipo de Moneda: Solo acepta MXN o COP
	 * @return quantity Devuelve la cantidad convertida a dólares
	 */
	public static double convertToDolar(double quantity, String currency) {
		switch(currency) {
		case "MXN":
			quantity = quantity *0.052;
			break;
		case "COP":
			quantity = quantity * 0.00031;
			break;
		}
		return quantity;
	}

}
