import static ui.UIMenu.*;

public class Main {

	public static void main(String[] args) {
		
		//showMenu();
		
		Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
		System.out.println(myDoctor.name);
		System.out.println(myDoctor.speciallity);
		
		int i = 0;
		int b = 2;
		b = 1;
		
		System.out.println("\n");
		
		Patient patient = new Patient("Alejandra", "alejandra@email.com");
		Patient patient2 = new Patient("Andrea", "andrea@email.com");
		
		System.out.println(patient.getName());
		System.out.println(patient2.getName());
		patient2 = patient;
		System.out.println("\n");
		
		System.out.println(patient.getName());
		System.out.println(patient2.getName());
		
		System.out.println("\n");
		patient2.setName("Manuel");
		System.out.println(patient.getName());
		System.out.println(patient2.getName());
		
		patient.setWeight(54.6);
		System.out.println(patient.getWeight());
		
		patient.setPhoneNumber("123454678");
		System.out.println(patient.getPhoneNumber());
	}

}
