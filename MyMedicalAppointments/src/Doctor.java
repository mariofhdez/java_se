
public class Doctor {
	
	int id;
	String name;
	String speciallity;
	
	Doctor(){
		System.out.println("Construyendo el objeto doctor");
	}
	
	Doctor(String name){
		System.out.println("El nombre del doctor asignado es: "+name);
	}
	
	public void showName() {
		System.out.println(name);
	}

}
