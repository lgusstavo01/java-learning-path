package entities;

import java.time.LocalDate;

public class InternShip extends Contract {
	private String mentor;

	public InternShip(LocalDate startDate, LocalDate endDate, Double baseSalary, String mentor) {
		super(startDate, endDate, baseSalary);
		this.mentor = mentor;
	}

	public String getMentor() {
		return mentor;
	}

	@Override
	public String toString() {
		return contractData() + "\nMentor: " + mentor;
	}

	
}
