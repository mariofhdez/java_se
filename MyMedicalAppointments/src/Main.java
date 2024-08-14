import static ui.UIMenu.*;

public class Main {

	public static void main(String[] args) {
		
		//showMenu();
		
		Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
		System.out.println(myDoctor.name);
		System.out.println(myDoctor.speciallity);
		
		Patient patient = new Patient("Alejandra", "alejandra@email.com");
		System.out.println(patient.name);
		System.out.println(patient.email);
		
		patient.weight = 60.5; //kg
		patient.height = 1.65; //mt
		
		System.out.println(patient.weight);
		System.out.println(patient.height);
	}

}
