package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

	// atributos
	private String speciallity;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	// metodos
	public Doctor(String name, String email) {
		super(name, email);
	}

	public String getSpeciallity() {
		return speciallity;
	}

	public void setSpeciallity(String speciallity) {
		this.speciallity = speciallity;
	}

	public void addAvailableAppointment(String date, String time) {
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
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		public int getId_availableAppointment() {
			return id_availableAppointment;
		}

		public void setId_availableAppointment(int id_availableAppointment) {
			this.id_availableAppointment = id_availableAppointment;
		}

		public Date getDate() {
			return date;
		}
		public String getDate(String DATE) {
			return format.format(DATE);
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

		public AvailableAppointment(String date, String time) {
			try {
				this.date = format.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.time = time;
		}
		
		@Override
		public String toString() {
			return "Available Appointments \nDate: "+date+"\nTime: "+time;
		}

	}

	@Override
	public void showDataUser() {
		System.out.println("Hospital: San Juan de Dios");
		System.out.println("Departamento: Cancerología");
	}
}
