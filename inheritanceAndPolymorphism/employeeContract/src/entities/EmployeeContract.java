package entities;

import java.time.LocalDate;

import util.Position;

public class EmployeeContract extends Contract {

	private Position position;

	public EmployeeContract(LocalDate startDate, LocalDate endDate, Double baseSalary, Position position) {
		super(startDate, endDate, baseSalary);
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return contractData() + "\nPosition: " + position;
	}

}
