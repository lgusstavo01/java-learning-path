package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	protected Double payment() {
		return valuePerHour * hours;
	}

	@Override
	public String toString() {
		return "Name: " + name + String.format("%nPayment: R$%.2f%n", payment());
	}

}
