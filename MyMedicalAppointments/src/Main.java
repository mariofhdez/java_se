import static ui.UIMenu.*;

import java.util.Date;

import model.Doctor;
import model.Patient;

public class Main {

	public static void main(String[] args) {
		
		//showMenu();
		
		Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
		
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "10am");
		myDoctor.addAvailableAppointment(new Date(), "1pm");
		
//		for(Doctor.AvailableAppointment avaApp: myDoctor.getAvailableAppointments()) {
//			System.out.println(avaApp.getDate() + "  "+ avaApp.getTime());
//		}
		
		System.out.println(myDoctor.toString());
		
		System.out.println("\n");
		
		Patient patient = new Patient("Alejandra", "alejandra@email.com");
		Patient patient2 = new Patient("Andrea", "andrea@email.com");
		
		System.out.println(patient.getName());
		System.out.println(patient2.getName());
		
		patient.setWeight(54.6);
		System.out.println(patient.getWeight());
		
		patient.setPhoneNumber("123454678");
		System.out.println(patient.getPhoneNumber());
		
		System.out.println(patient.toString());
		
	}

}
