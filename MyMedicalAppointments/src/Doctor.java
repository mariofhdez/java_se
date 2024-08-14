import java.util.ArrayList;
import java.util.Date;

public class Doctor {

	// atributos
	static int id = 0; // autoincrement
	private String name;
	private String email;
	private String speciallity;
	
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	// metodos

	Doctor() {
		System.out.println("Construyendo el objeto doctor");
		id++;
	}

	Doctor(String name, String speciallity) {
		id++;
		this.name = name;
		this.speciallity = speciallity;
		System.out.println("El nombre del doctor asignado es: " + name);
	}

	public void showName() {
		System.out.println(name);
	}

	public void showId() {
		System.out.println("ID Doctor: " + id);
	}
	
	public void addAvailableAppointment (Date date, String time) {
		availableAppointments.add(new AvailableAppointment(date, time));
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointments;
	}

	public static class AvailableAppointment {
		private int id_availableAppointment;
		private Date date;
		private String time;

		public int getId_availableAppointment() {
			return id_availableAppointment;
		}

		public void setId_availableAppointment(int id_availableAppointment) {
			this.id_availableAppointment = id_availableAppointment;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public AvailableAppointment(Date date, String time) {
			this.date = date;
			this.time = time;
		}

	}
}
