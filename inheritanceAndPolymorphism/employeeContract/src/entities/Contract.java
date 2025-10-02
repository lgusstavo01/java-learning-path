package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Contract {
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDate startDate;
	private LocalDate endDate;
	private Double baseSalary;

	public Contract(LocalDate startDate, LocalDate endDate, Double baseSalary) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.baseSalary = baseSalary;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public Boolean isActive() {
		return !getStartDate().isAfter(LocalDate.now()) && getEndDate().isAfter(LocalDate.now());

	}

	public String contractData() {
		return "Start date: " + startDate.format(fmt) + "\nEnd date: " + endDate.format(fmt)
				+ String.format("%nBase salary: R$ %.2f%n", baseSalary) + "Active: " + (isActive() ? "Yes" : "No");
	}

	@Override
	public abstract String toString();

}
