package model;

public class Nurse extends User {

	private String speciallity;

	public Nurse(String name, String email) {
		super(name, email);
	}

	public String getSpeciallity() {
		return speciallity;
	}

	public void setSpeciallity(String speciallity) {
		this.speciallity = speciallity;
	}

	@Override
	public void showDataUser() {
		System.out.println("Hospital: Sagrada Familia");
		System.out.println("Departamento: Pediatría, Psicología");
	}

}
