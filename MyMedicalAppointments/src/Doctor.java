
public class Doctor {
	
	//atributos
	static int id = 0; //autoincrement
	String name;
	String speciallity;
	
	//metodos
	
	Doctor(){
		System.out.println("Construyendo el objeto doctor");
		id++;
	}
	
	Doctor(String name, String speciallity){
		id++;
		this.name = name;
		this.speciallity = speciallity;
		System.out.println("El nombre del doctor asignado es: "+name);
	}
	
	public void showName() {
		System.out.println(name);
	}

	public void showId() {
		System.out.println("ID Doctor: "+id);
	}
}
