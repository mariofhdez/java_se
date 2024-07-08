
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
	}

}
