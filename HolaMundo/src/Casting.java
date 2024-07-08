
public class Casting {
	
	public static void main(String[] args) {
		
		//En un año ubicar 30 perritos
		//Cántos perritos ubiqué al mes
		
		double monthlyDogs = 30.0/12.0;
		System.out.println(monthlyDogs);
		
		//ESTIMACION: el valor se trunca
		int estimatedMonthlyDogs = (int) monthlyDogs;
		System.out.println(estimatedMonthlyDogs);
		
		//EXACTITUD:
		int a = 30;
		int b = 12;
		System.out.println((double)a/b);
		
		double c = a/b; //No está casteando la raíz
		System.out.println(c);
		
		c = (double) a/b; //Si está casteando la raíz
		System.out.println(c);
		
		//Casting de un dato menor hacia un dato mayo
		char n = '1'; //dato menor
		int nI = n;  //dato mayor
		
		System.out.println(nI);
		
		//Casting de un dato mayor a uno menor
		short nS = (short) n;	//El cast debe ser explícito
		System.out.println(nS);
	}

}
