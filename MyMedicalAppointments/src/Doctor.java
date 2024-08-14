import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

	// atributos
	private String speciallity;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	// metodos
	Doctor(String name, String email) {
		super(name, email);
		System.out.println("El nombre del doctor asignado es: " + name);
	}

	public String getSpeciallity() {
		return speciallity;
	}

	public void setSpeciallity(String speciallity) {
		this.speciallity = speciallity;
	}

	public void addAvailableAppointment(Date date, String time) {
		availableAppointments.add(new AvailableAppointment(date, time));
	}

	public ArrayList<AvailableAppointment> getAvailableAppointments() {
		return availableAppointments;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSpeciallity: "+speciallity+"\nAvailable: "+availableAppointments.toString();
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
		
		@Override
		public String toString() {
			return "Available Appointments \nDate: "+date+"\nTime: "+time;
		}

	}
}
