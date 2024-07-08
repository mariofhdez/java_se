package dataTypes;

public class DataTypes {
	
	public static void main(String[] args) {
		//Dato numérico entero
		int n = 1234567890; //cantidad máxima de digitos es 10
		
		long nL = 12345678901L;
		
		//Dato numérico decimal
		double nD = 123.456;
		float nF = 123.456F;
		
		//A partir de Java 10 se vuelve mas flexible y no es necesario indicar el datatype
		var salary = 1000; //int
		//pensión 4%
		var pension = salary*0.04; //Double
		var totalSalary = salary - pension; //Double
		System.out.println(salary);
		System.out.println(pension);
		System.out.println(totalSalary);
		
		var employeeName = "Mario Florez";
		System.out.println("EMPLOYEE: " + employeeName + "\nSALARY: " + totalSalary);
	}

}
