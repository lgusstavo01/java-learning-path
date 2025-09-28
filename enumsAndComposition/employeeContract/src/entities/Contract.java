package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import util.ContractType;

public class Contract {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String employeeName;
	private LocalDate startDate;
	private LocalDate endDate;
	private ContractType type;

	public Contract() {
	}

	public Contract(String employeeName, LocalDate startDate, LocalDate endDate, ContractType type) {
		this.employeeName = employeeName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public ContractType getType() {
		return type;
	}

	public boolean isActive() {
		return !LocalDate.now().isBefore(startDate) && !LocalDate.now().isAfter(endDate);
	}

	public long calculateDuration() {
		Period diff = Period.between(startDate, endDate);
		return diff.toTotalMonths();
	}

	@Override
	public String toString() {
		return "Name of employee: " + employeeName + "\nType of contract: " + type + "\nDate starting contract: "
				+ startDate.format(formatter) + "\nDate ending contract: " + endDate.format(formatter)
				+ "\nDuration (months): " + calculateDuration() + "\nContract is active: "
				+ (isActive() ? "Active" : "No, contract is not active.") + "\n";
	}

}
