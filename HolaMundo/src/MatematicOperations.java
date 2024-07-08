
public class MatematicOperations {
	public static void main(String[] args) {
		double x = 2.1;
		double y = 3;
		
		//aproximación al máximo
		System.out.println(Math.ceil(x));
		
		//aproximación al mínimo
		System.out.println(Math.floor(x));
		
		//función potencia de un número a otro
		System.out.println(Math.pow(x, y));
		
		//Compara dos números y retorna el mayor
		System.out.println(Math.max(x, y));
		
		//función para hallar la raíz cuadrada de un número
		System.out.println(Math.sqrt(y));
		System.out.println((int)Math.sqrt(y)); //Casting
		
		//Área de un círculo: pi*r^2
		System.out.println(Math.PI*Math.pow(y, 2));
		
		//área de una esfera: 4*pi*r^2
		System.out.println(4*Math.PI*Math.pow(y, 2));
		
		//Volúmen de una esfera: (4/3) * Pi * r^3
		System.out.println((4/3)*Math.PI*Math.pow(y, 3));
		
		
	}

}
