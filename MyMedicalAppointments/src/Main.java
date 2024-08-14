import static ui.UIMenu.*;

public class Main {

	public static void main(String[] args) {
		
		//showMenu();
		
		Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
		System.out.println(myDoctor.name);
		System.out.println(myDoctor.speciallity);
		
		Patient patient = new Patient("Alejandra", "alejandra@email.com");
		patient.setWeight(54.6);
		System.out.println(patient.getWeight());
		
		patient.setPhoneNumber("123454678");
		System.out.println(patient.getPhoneNumber());
	}

}
